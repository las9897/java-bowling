package qna.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qna.CannotDeleteException;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteHistoriesTest {
    @Test
    @DisplayName("Question이 Answer 보다 앞으로 오는지 테스트")
    void prepend() throws CannotDeleteException {
        //given
        Question question = new Question("title1", "contents1").writeBy(UserTest.JAVAJIGI);
        question.addAnswer(new Answer(UserTest.JAVAJIGI, QuestionTest.Q1, "Answers Contents1"));

        //when
        DeleteHistories deleteHistories = question.deleteByUser(UserTest.JAVAJIGI);
        DeleteHistory deleteHistory = deleteHistories.getDeleteHistories().get(0);
        //then
        assertThat(deleteHistory.getContentType()).isEqualTo(ContentType.QUESTION);
    }
}