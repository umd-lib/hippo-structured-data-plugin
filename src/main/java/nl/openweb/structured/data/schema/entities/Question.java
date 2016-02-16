package nl.openweb.structured.data.schema.entities;

import java.util.List;

public class Question extends CreativeWork {

    private Answer acceptedAnswer;
    private Integer answerCount;
    private Integer downvoteCount;
    private List<Answer> suggestedAnswer;
    private Integer upvoteCount;

    protected Question(Builder builder) {
        super(builder);
        this.acceptedAnswer = builder.acceptedAnswer;
        this.answerCount = builder.answerCount;
        this.downvoteCount = builder.downvoteCount;
        this.suggestedAnswer = builder.suggestedAnswer;
        this.upvoteCount = builder.upvoteCount;
    }

    public Answer getAcceptedAnswer() {
        return acceptedAnswer;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public Integer getDownvoteCount() {
        return downvoteCount;
    }

    public List<Answer> getSuggestedAnswer() {
        return suggestedAnswer;
    }

    public Integer getUpvoteCount() {
        return upvoteCount;
    }

    public static class Builder extends CreativeWork.Builder {
        private Answer acceptedAnswer;
        private Integer answerCount;
        private Integer downvoteCount;
        private List<Answer> suggestedAnswer;
        private Integer upvoteCount;

        public Builder setAcceptedAnswer(Answer acceptedAnswer) {
            this.acceptedAnswer = acceptedAnswer;
            return this;
        }

        public Builder setAnswerCount(Integer answerCount) {
            this.answerCount = answerCount;
            return this;
        }

        public Builder setDownvoteCount(Integer downvoteCount) {
            this.downvoteCount = downvoteCount;
            return this;
        }

        public Builder setSuggestedAnswer(List<Answer> suggestedAnswer) {
            this.suggestedAnswer = suggestedAnswer;
            return this;
        }

        public Builder setUpvoteCount(Integer upvoteCount) {
            this.upvoteCount = upvoteCount;
            return this;
        }

        @Override
        public Question build() {
            return new Question(this);
        }
    }
}
