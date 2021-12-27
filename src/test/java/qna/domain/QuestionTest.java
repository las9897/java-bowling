package qna.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qna.CannotDeleteException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class QuestionTest {
    public static final Question Q1 = new Question("title1", "contents1").writeBy(UserTest.JAVAJIGI);
    public static final Question Q2 = new Question("title2", "contents2").writeBy(UserTest.SANJIGI);


    private Question question;

    @BeforeEach
    void setUp() {
        question = new Question("title1", "contents1").writeBy(UserTest.JAVAJIGI);
    }

    @Test
    @DisplayName("질문 작성자와 삭제하려는 사람이 다를 경우")
    void deleteByAnotherUser() {
        //then
        assertThatThrownBy(() -> question.deleteByUser(UserTest.SANJIGI))
                .isInstanceOf(CannotDeleteException.class);
    }


    @Test
    @DisplayName("질문 작성자와 삭제하려는 사람이 같을 경우")
    void deleteByWriter() throws CannotDeleteException {
        //when
        question.deleteByUser(UserTest.JAVAJIGI);
        //then
        assertThat(question.isDeleted()).isTrue();
    }

    @Test
    @DisplayName("질문 작성자와 삭제하려는 사람이 같지만, 다른 사람이 쓴 답변이 있을 경우")
    void deleteWithAnotherAnswer() {
        //given
        Answer answer = new Answer(UserTest.SANJIGI, question, "Answers Contents2");
        question.addAnswer(answer);
        //then
        assertThatThrownBy(() -> question.deleteByUser(UserTest.JAVAJIGI))
                .isInstanceOf(CannotDeleteException.class);
    }

    @Test
    @DisplayName("질문 작성자와 삭제하려는 사람이 같고, 작성자의 답변만 있을 경우")
    void deleteWithWriterAnswer() throws CannotDeleteException {
        //given
        Answer answer = new Answer(UserTest.JAVAJIGI, question, "Answers Contents1");
        question.addAnswer(answer);
        //when
        question.deleteByUser(UserTest.JAVAJIGI);
        //then
        assertThat(question.isDeleted()).isTrue();
        assertThat(answer.isDeleted()).isTrue();

    }

}
