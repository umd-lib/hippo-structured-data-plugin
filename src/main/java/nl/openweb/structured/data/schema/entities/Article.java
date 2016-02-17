package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;
import java.util.List;

public class Article extends CreativeWork {

    private String articleBody;
    private List<String> articleBodyAsList;
    private List<String> articleSection;
    private String pageEnd;
    private String pageStart;
    private String pagination;
    private Integer wordCount;

    protected Article(Builder builder) {
        super(builder);
        this.articleBody = builder.articleBody;
        this.articleBodyAsList = builder.articleBodyAsList;
        this.articleSection = builder.articleSection;
        this.pageEnd = builder.pageEnd;
        this.pageStart = builder.pageStart;
        this.pagination = builder.pagination;
        this.wordCount = builder.wordCount;
    }

    public Object getArticleBody() {
        Object result = this.articleBody;
        if (result == null) {
            result = this.articleBodyAsList;
        }
        return result;
    }

    public List<String> getArticleSection() {
        return articleSection;
    }

    public String getPageEnd() {
        return pageEnd;
    }

    public String getPageStart() {
        return pageStart;
    }

    public String getPagination() {
        return pagination;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public static class Builder extends CreativeWork.Builder {
        private String articleBody;
        private List<String> articleBodyAsList;
        private List<String> articleSection;
        private String pageEnd;
        private String pageStart;
        private String pagination;
        private Integer wordCount;

        public Builder setArticleBody(String articleBody) {
            this.articleBody = articleBody;
            return this;
        }

        public Builder setArticleBody(List<String> articleBodyAsList) {
            this.articleBodyAsList = articleBodyAsList;
            return this;
        }

        public Builder setArticleSection(List<String> articleSection) {
            this.articleSection = articleSection;
            return this;
        }

        public Builder setPageEnd(String pageEnd) {
            this.pageEnd = pageEnd;
            return this;
        }

        public Builder setPageStart(String pageStart) {
            this.pageStart = pageStart;
            return this;
        }

        public Builder setPagination(String pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder setWordCount(Integer wordCount) {
            this.wordCount = wordCount;
            return this;
        }


        @Override
        public Builder setAbout(Thing about) {
            super.setAbout(about);
            return this;
        }

        @Override
        public Builder setAccessibilityAPI(String accessibilityAPI) {
            super.setAccessibilityAPI(accessibilityAPI);
            return this;
        }

        @Override
        public Builder setAccessibilityControl(String accessibilityControl) {
            super.setAccessibilityControl(accessibilityControl);
            return this;
        }

        @Override
        public Builder setAccessibilityFeature(String accessibilityFeature) {
            super.setAccessibilityFeature(accessibilityFeature);
            return this;
        }

        @Override
        public Builder setAccessibilityHazard(String accessibilityHazard) {
            super.setAccessibilityHazard(accessibilityHazard);
            return this;
        }

        @Override
        public Builder setAccountablePerson(String accountablePerson) {
            super.setAccountablePerson(accountablePerson);
            return this;
        }

        @Override
        public Builder setAdditionalType(String additionalType) {
            super.setAdditionalType(additionalType);
            return this;
        }

        @Override
        public Builder setAggregateRating(String aggregateRating) {
            super.setAggregateRating(aggregateRating);
            return this;
        }

        @Override
        public Builder setAlternateName(String alternateName) {
            super.setAlternateName(alternateName);
            return this;
        }

        @Override
        public Builder setAlternativeHeadline(String alternativeHeadline) {
            super.setAlternativeHeadline(alternativeHeadline);
            return this;
        }

        @Override
        public Builder setAward(String award) {
            super.setAward(award);
            return this;
        }

        @Override
        public Builder setCitation(String citation) {
            super.setCitation(citation);
            return this;
        }

        @Override
        public Builder setComment(Comment comment) {
            super.setComment(comment);
            return this;
        }

        @Override
        public Builder setCommentCount(Integer commentCount) {
            super.setCommentCount(commentCount);
            return this;
        }

        @Override
        public Builder setContentLocation(Place contentLocation) {
            super.setContentLocation(contentLocation);
            return this;
        }

        @Override
        public Builder setContentRating(String contentRating) {
            super.setContentRating(contentRating);
            return this;
        }

        @Override
        public Builder setDateCreated(Calendar dateCreated) {
            super.setDateCreated(dateCreated);
            return this;
        }

        @Override
        public Builder setDateModified(Calendar dateModified) {
            super.setDateModified(dateModified);
            return this;
        }

        @Override
        public Builder setDatePublished(Calendar datePublished) {
            super.setDatePublished(datePublished);
            return this;
        }

        @Override
        public Builder setDescription(String description) {
            super.setDescription(description);
            return this;
        }

        @Override
        public Builder setDiscussionUrl(String discussionUrl) {
            super.setDiscussionUrl(discussionUrl);
            return this;
        }

        @Override
        public Builder setEducationalUse(String educationalUse) {
            super.setEducationalUse(educationalUse);
            return this;
        }

        @Override
        public Builder setExampleOfWork(CreativeWork exampleOfWork) {
            super.setExampleOfWork(exampleOfWork);
            return this;
        }

        @Override
        public Builder setFileFormat(String fileFormat) {
            super.setFileFormat(fileFormat);
            return this;
        }

        @Override
        public Builder setGenre(String genre) {
            super.setGenre(genre);
            return this;
        }

        @Override
        public Builder setHasPart(CreativeWork hasPart) {
            super.setHasPart(hasPart);
            return this;
        }

        @Override
        public Builder setHeadline(String headline) {
            super.setHeadline(headline);
            return this;
        }

        @Override
        public Builder setId(String id) {
            super.setId(id);
            return this;
        }

        @Override
        public Builder setImage(String image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Builder setInLanguage(String inLanguage) {
            super.setInLanguage(inLanguage);
            return this;
        }

        @Override
        public Builder setInteractionStatistic(String interactionStatistic) {
            super.setInteractionStatistic(interactionStatistic);
            return this;
        }

        @Override
        public Builder setInteractivityType(String interactivityType) {
            super.setInteractivityType(interactivityType);
            return this;
        }

        @Override
        public Builder setIsBasedOnUrl(String isBasedOnUrl) {
            super.setIsBasedOnUrl(isBasedOnUrl);
            return this;
        }

        @Override
        public Builder setIsFamilyFriendly(Boolean isFamilyFriendly) {
            super.setIsFamilyFriendly(isFamilyFriendly);
            return this;
        }

        @Override
        public Builder setIsPartOf(CreativeWork isPartOf) {
            super.setIsPartOf(isPartOf);
            return this;
        }

        @Override
        public Builder setKeywords(String keywords) {
            super.setKeywords(keywords);
            return this;
        }

        @Override
        public Builder setLearningResourceType(String learningResourceType) {
            super.setLearningResourceType(learningResourceType);
            return this;
        }

        @Override
        public Builder setLicense(String license) {
            super.setLicense(license);
            return this;
        }

        @Override
        public Builder setLocationCreated(Place locationCreated) {
            super.setLocationCreated(locationCreated);
            return this;
        }

        @Override
        public Builder setMainEntity(Thing mainEntity) {
            super.setMainEntity(mainEntity);
            return this;
        }

        @Override
        public Builder setMainEntityOfPage(String mainEntityOfPage) {
            super.setMainEntityOfPage(mainEntityOfPage);
            return this;
        }

        @Override
        public Builder setMentions(List<Thing> mentions) {
            super.setMentions(mentions);
            return this;
        }

        @Override
        public Builder setName(String name) {
            super.setName(name);
            return this;
        }

        @Override
        public Builder setPosition(String position) {
            super.setPosition(position);
            return this;
        }

        @Override
        public Builder setPublishingPrinciples(String publishingPrinciples) {
            super.setPublishingPrinciples(publishingPrinciples);
            return this;
        }

        @Override
        public Builder setRecordedAt(Event recordedAt) {
            super.setRecordedAt(recordedAt);
            return this;
        }

        @Override
        public Builder setReview(Review review) {
            super.setReview(review);
            return this;
        }

        @Override
        public Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Builder setSchemaVersion(String schemaVersion) {
            super.setSchemaVersion(schemaVersion);
            return this;
        }

        @Override
        public Builder setSourceOrganization(Organization sourceOrganization) {
            super.setSourceOrganization(sourceOrganization);
            return this;
        }

        @Override
        public Builder setText(String text) {
            super.setText(text);
            return this;
        }

        @Override
        public Builder setThumbnailUrl(String thumbnailUrl) {
            super.setThumbnailUrl(thumbnailUrl);
            return this;
        }

        @Override
        public Builder setTypicalAgeRange(String typicalAgeRange) {
            super.setTypicalAgeRange(typicalAgeRange);
            return this;
        }

        @Override
        public Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public Builder setVersion(Number version) {
            super.setVersion(version);
            return this;
        }

        @Override
        public Builder setWorkExample(CreativeWork workExample) {
            super.setWorkExample(workExample);
            return this;
        }

        @Override
        public Article build() {
            return new Article(this);
        }
    }
}
