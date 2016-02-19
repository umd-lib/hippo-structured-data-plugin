package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;
import java.util.List;

public class CreativeWork extends Thing {

    private Thing about;
    private String accessibilityAPI;
    private String accessibilityControl;
    private String accessibilityFeature;
    private String accessibilityHazard;
    private String accountablePerson;
    private String aggregateRating;
    private String alternativeHeadline;
    private Object author;
    private String award;
    private String citation;
    private Comment comment;
    private Integer commentCount;
    private Place contentLocation;
    private String contentRating;
    private Calendar dateCreated;
    private Calendar dateModified;
    private Calendar datePublished;
    private String discussionUrl;
    private String educationalUse;
    private CreativeWork exampleOfWork;
    private String fileFormat;
    private String genre;
    private CreativeWork hasPart;
    private String headline;
    private String inLanguage;
    private String interactionStatistic;
    private String interactivityType;
    private String isBasedOnUrl;
    private Boolean isFamilyFriendly;
    private CreativeWork isPartOf;
    private String keywords;
    private String learningResourceType;
    private String license;
    private Place locationCreated;
    private Thing mainEntity;
    private List<Thing> mentions;
    private String position;
    private Object publisher;
    private String publishingPrinciples;
    private Event recordedAt;
    private Review review;
    private String schemaVersion;
    private Organization sourceOrganization;
    private String text;
    private String thumbnailUrl;
    private String typicalAgeRange;
    private Number version;
    private CreativeWork workExample;

    protected CreativeWork(Builder builder) {
        super(builder);
        this.about = builder.about;
        this.accessibilityAPI = builder.accessibilityAPI;
        this.accessibilityControl = builder.accessibilityControl;
        this.accessibilityFeature = builder.accessibilityFeature;
        this.accessibilityHazard = builder.accessibilityHazard;
        this.accountablePerson = builder.accountablePerson;
        this.aggregateRating = builder.aggregateRating;
        this.alternativeHeadline = builder.alternativeHeadline;
        this.author = builder.author;
        this.award = builder.award;
        this.citation = builder.citation;
        this.comment = builder.comment;
        this.commentCount = builder.commentCount;
        this.contentLocation = builder.contentLocation;
        this.contentRating = builder.contentRating;
        this.dateCreated = builder.dateCreated;
        this.dateModified = builder.dateModified;
        this.datePublished = builder.datePublished;
        this.discussionUrl = builder.discussionUrl;
        this.educationalUse = builder.educationalUse;
        this.exampleOfWork = builder.exampleOfWork;
        this.fileFormat = builder.fileFormat;
        this.genre = builder.genre;
        this.hasPart = builder.hasPart;
        this.headline = builder.headline;
        this.inLanguage = builder.inLanguage;
        this.interactionStatistic = builder.interactionStatistic;
        this.interactivityType = builder.interactivityType;
        this.isBasedOnUrl = builder.isBasedOnUrl;
        this.isFamilyFriendly = builder.isFamilyFriendly;
        this.isPartOf = builder.isPartOf;
        this.keywords = builder.keywords;
        this.learningResourceType = builder.learningResourceType;
        this.license = builder.license;
        this.locationCreated = builder.locationCreated;
        this.mainEntity = builder.mainEntity;
        this.mentions = builder.mentions;
        this.position = builder.position;
        this.publisher = builder.publisher;
        this.publishingPrinciples = builder.publishingPrinciples;
        this.recordedAt = builder.recordedAt;
        this.review = builder.review;
        this.schemaVersion = builder.schemaVersion;
        this.sourceOrganization = builder.sourceOrganization;
        this.text = builder.text;
        this.thumbnailUrl = builder.thumbnailUrl;
        this.typicalAgeRange = builder.typicalAgeRange;
        this.version = builder.version;
        this.workExample = builder.workExample;
    }

    public Thing getAbout() {
        return about;
    }

    public String getAccessibilityAPI() {
        return accessibilityAPI;
    }

    public String getAccessibilityControl() {
        return accessibilityControl;
    }

    public String getAccessibilityFeature() {
        return accessibilityFeature;
    }

    public String getAccessibilityHazard() {
        return accessibilityHazard;
    }

    public String getAccountablePerson() {
        return accountablePerson;
    }

    public String getAggregateRating() {
        return aggregateRating;
    }

    public String getAlternativeHeadline() {
        return alternativeHeadline;
    }

    public Object getAuthor(){
        return author;
    }
    public String getAward() {
        return award;
    }

    public String getCitation() {
        return citation;
    }

    public Comment getComment() {
        return comment;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public Place getContentLocation() {
        return contentLocation;
    }

    public String getContentRating() {
        return contentRating;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public Calendar getDatePublished() {
        return datePublished;
    }

    public String getDiscussionUrl() {
        return discussionUrl;
    }

    public String getEducationalUse() {
        return educationalUse;
    }

    public CreativeWork getExampleOfWork() {
        return exampleOfWork;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public String getGenre() {
        return genre;
    }

    public CreativeWork getHasPart() {
        return hasPart;
    }

    public String getHeadline() {
        return headline;
    }

    public String getInLanguage() {
        return inLanguage;
    }

    public String getInteractionStatistic() {
        return interactionStatistic;
    }

    public String getInteractivityType() {
        return interactivityType;
    }

    public String getIsBasedOnUrl() {
        return isBasedOnUrl;
    }

    public Boolean getFamilyFriendly() {
        return isFamilyFriendly;
    }

    public CreativeWork getIsPartOf() {
        return isPartOf;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getLearningResourceType() {
        return learningResourceType;
    }

    public String getLicense() {
        return license;
    }

    public Place getLocationCreated() {
        return locationCreated;
    }

    public Thing getMainEntity() {
        return mainEntity;
    }

    public List<Thing> getMentions() {
        return mentions;
    }

    public String getPosition() {
        return position;
    }

    public Object getPublisher() {
        return publisher;
    }

    public String getPublishingPrinciples() {
        return publishingPrinciples;
    }

    public Event getRecordedAt() {
        return recordedAt;
    }

    public Review getReview() {
        return review;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public Organization getSourceOrganization() {
        return sourceOrganization;
    }

    public String getText() {
        return text;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getTypicalAgeRange() {
        return typicalAgeRange;
    }

    public Number getVersion() {
        return version;
    }

    public CreativeWork getWorkExample() {
        return workExample;
    }

    public static class Builder extends Thing.Builder {
        private Thing about;
        private String accessibilityAPI;
        private String accessibilityControl;
        private String accessibilityFeature;
        private String accessibilityHazard;
        private String accountablePerson;
        private String aggregateRating;
        private String alternativeHeadline;
        private Object author;
        private String award;
        private String citation;
        private Comment comment;
        private Integer commentCount;
        private Place contentLocation;
        private String contentRating;
        private Calendar dateCreated;
        private Calendar dateModified;
        private Calendar datePublished;
        private String discussionUrl;
        private String educationalUse;
        private CreativeWork exampleOfWork;
        private String fileFormat;
        private String genre;
        private CreativeWork hasPart;
        private String headline;
        private String inLanguage;
        private String interactionStatistic;
        private String interactivityType;
        private String isBasedOnUrl;
        private Boolean isFamilyFriendly;
        private CreativeWork isPartOf;
        private String keywords;
        private String learningResourceType;
        private String license;
        private Place locationCreated;
        private Thing mainEntity;
        private List<Thing> mentions;
        private String position;
        private String publishingPrinciples;
        private Event recordedAt;
        private Review review;
        private String schemaVersion;
        private Organization sourceOrganization;
        private String text;
        private String thumbnailUrl;
        private String typicalAgeRange;
        private Number version;
        private CreativeWork workExample;
        private Object publisher;

        public Builder setAbout(Thing about) {
            this.about = about;
            return this;
        }

        public Builder setAccessibilityAPI(String accessibilityAPI) {
            this.accessibilityAPI = accessibilityAPI;
            return this;
        }

        public Builder setAccessibilityControl(String accessibilityControl) {
            this.accessibilityControl = accessibilityControl;
            return this;
        }

        public Builder setAccessibilityFeature(String accessibilityFeature) {
            this.accessibilityFeature = accessibilityFeature;
            return this;
        }

        public Builder setAccessibilityHazard(String accessibilityHazard) {
            this.accessibilityHazard = accessibilityHazard;
            return this;
        }

        public Builder setAccountablePerson(String accountablePerson) {
            this.accountablePerson = accountablePerson;
            return this;
        }

        public Builder setAggregateRating(String aggregateRating) {
            this.aggregateRating = aggregateRating;
            return this;
        }

        public Builder setAlternativeHeadline(String alternativeHeadline) {
            this.alternativeHeadline = alternativeHeadline;
            return this;
        }

        public Builder setAuthor(Person author){
            this.author = author;
            return this;
        }

        public Builder setAuthor(Organization author){
            this.author = author;
            return this;
        }

        public Builder setAward(String award) {
            this.award = award;
            return this;
        }

        public Builder setCitation(String citation) {
            this.citation = citation;
            return this;
        }

        public Builder setComment(Comment comment) {
            this.comment = comment;
            return this;
        }

        public Builder setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
            return this;
        }

        public Builder setContentLocation(Place contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        public Builder setContentRating(String contentRating) {
            this.contentRating = contentRating;
            return this;
        }

        public Builder setDateCreated(Calendar dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder setDateModified(Calendar dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        public Builder setDatePublished(Calendar datePublished) {
            this.datePublished = datePublished;
            return this;
        }

        public Builder setDiscussionUrl(String discussionUrl) {
            this.discussionUrl = discussionUrl;
            return this;
        }

        public Builder setEducationalUse(String educationalUse) {
            this.educationalUse = educationalUse;
            return this;
        }

        public Builder setExampleOfWork(CreativeWork exampleOfWork) {
            this.exampleOfWork = exampleOfWork;
            return this;
        }

        public Builder setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setHasPart(CreativeWork hasPart) {
            this.hasPart = hasPart;
            return this;
        }

        public Builder setHeadline(String headline) {
            this.headline = headline;
            return this;
        }

        public Builder setInLanguage(String inLanguage) {
            this.inLanguage = inLanguage;
            return this;
        }

        public Builder setInteractionStatistic(String interactionStatistic) {
            this.interactionStatistic = interactionStatistic;
            return this;
        }

        public Builder setInteractivityType(String interactivityType) {
            this.interactivityType = interactivityType;
            return this;
        }

        public Builder setIsBasedOnUrl(String isBasedOnUrl) {
            this.isBasedOnUrl = isBasedOnUrl;
            return this;
        }

        public Builder setIsFamilyFriendly(Boolean isFamilyFriendly) {
            this.isFamilyFriendly = isFamilyFriendly;
            return this;
        }

        public Builder setIsPartOf(CreativeWork isPartOf) {
            this.isPartOf = isPartOf;
            return this;
        }

        public Builder setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder setLearningResourceType(String learningResourceType) {
            this.learningResourceType = learningResourceType;
            return this;
        }

        public Builder setLicense(String license) {
            this.license = license;
            return this;
        }

        public Builder setLocationCreated(Place locationCreated) {
            this.locationCreated = locationCreated;
            return this;
        }

        public Builder setMainEntity(Thing mainEntity) {
            this.mainEntity = mainEntity;
            return this;
        }

        public Builder setMentions(List<Thing> mentions) {
            this.mentions = mentions;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder setPublisher(Organization publisher){
            this.publisher = publisher;
            return this;
        }

        public Builder setPublisher(Person publisher){
            this.publisher = publisher;
            return this;
        }

        public Builder setPublishingPrinciples(String publishingPrinciples) {
            this.publishingPrinciples = publishingPrinciples;
            return this;
        }

        public Builder setRecordedAt(Event recordedAt) {
            this.recordedAt = recordedAt;
            return this;
        }

        public Builder setReview(Review review) {
            this.review = review;
            return this;
        }

        public Builder setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        public Builder setSourceOrganization(Organization sourceOrganization) {
            this.sourceOrganization = sourceOrganization;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public Builder setTypicalAgeRange(String typicalAgeRange) {
            this.typicalAgeRange = typicalAgeRange;
            return this;
        }

        public Builder setVersion(Number version) {
            this.version = version;
            return this;
        }

        public Builder setWorkExample(CreativeWork workExample) {
            this.workExample = workExample;
            return this;
        }

        @Override
        public Builder setAdditionalType(String additionalType) {
            super.setAdditionalType(additionalType);
            return this;
        }

        @Override
        public Builder setAlternateName(String alternateName) {
            super.setAlternateName(alternateName);
            return this;
        }

        @Override
        public Builder setDescription(String description) {
            super.setDescription(description);
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
        public Builder setImage(ImageObject image) {
            super.setImage(image);
            return this;
        }

        @Override
        public Builder setMainEntityOfPage(String mainEntityOfPage) {
            super.setMainEntityOfPage(mainEntityOfPage);
            return this;
        }

        @Override
        public Builder setName(String name) {
            super.setName(name);
            return this;
        }

        @Override
        public Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public CreativeWork build() {
            return new CreativeWork(this);
        }
    }
}
