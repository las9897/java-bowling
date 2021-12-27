package qna.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qna.CannotDeleteException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AnswerTest {
    public static final Answer A1 = new Answer(UserTest.JAVAJIGI, QuestionTest.Q1, "Answers Contents1");
    public static final Answer A2 = new Answer(UserTest.SANJIGI, QuestionTest.Q1, "Answers Contents2");


    private Answer answer;

    @BeforeEach
    void setUp() {
        this.answer = new Answer(UserTest.JAVAJIGI, QuestionTest.Q1, "Answers Contents1");
    }

    @Test
    @DisplayName("답변 작성자가 본인인지 확인")
    void validationWriterIsOwner() {
        //then
        assertThatThrownBy(() -> this.answer.validationWriterIsOwner(UserTest.SANJIGI))
                .isInstanceOf(CannotDeleteException.class);
    }


    @Test
    @DisplayName("답변이 삭제되었는지 확인")
    void toDeleteHistory() {
        //given
        //when
        this.answer.toDeleteHistory();
        //then
        assertThat(this.answer.isDeleted()).isTrue();
    }
}
