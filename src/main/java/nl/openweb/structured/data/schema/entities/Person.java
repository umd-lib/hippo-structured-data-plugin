package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;
import java.util.List;

public class Person extends Thing {
    private String additionalName;
    private String address;

    private Organization affiliation;
    private Organization alumniOf;

    private String award;
    private Calendar birthDate;
    private Calendar birthPlace;
    private String brand;

    private List<Person> children;
    private List<Person> colleague;
    private Person contactPoint;
    private Calendar deathDate;
    private Place deathPlace;
    private String duns;
    private String email;
    private String familyName;
    private String faxNumber;
    private List<Person> follows;
    private String gender;
    private String givenName;
    private String globalLocationNumber;
    private OfferCatalog hasOfferCatalog;
    private Place hasPOS;
    private QuantitativeValue height;

    private Place homeLocation;

    private String honorificPrefix;
    private String honorificSuffix;
    private String isicV4;
    private String jobTitle;
    private List<Person> knows;

    private List<Organization> memberOf;

    private String naics;

    private List<Person> parent;
    private List<Event> performerIn;
    private List<Person> relatedTo;
    private List<Person> sibling;
    private Person spouse;
    private String taxID;
    private String telephone;
    private String vatID;
    private QuantitativeValue weight;
    private Place workLocation;

    private List<Organization> worksFor;

    protected Person(Builder builder) {
        super(builder);
        this.additionalName = builder.additionalName;
        this.address = builder.address;
        this.affiliation = builder.affiliation;
        this.alumniOf = builder.alumniOf;
        this.award = builder.award;
        this.birthDate = builder.birthDate;
        this.birthPlace = builder.birthPlace;
        this.brand = builder.brand;
        this.children = builder.children;
        this.colleague = builder.colleague;
        this.contactPoint = builder.contactPoint;
        this.deathDate = builder.deathDate;
        this.deathPlace = builder.deathPlace;
        this.duns = builder.duns;
        this.email = builder.email;
        this.familyName = builder.familyName;
        this.faxNumber = builder.faxNumber;
        this.follows = builder.follows;
        this.gender = builder.gender;
        this.givenName = builder.givenName;
        this.globalLocationNumber = builder.globalLocationNumber;
        this.hasOfferCatalog = builder.hasOfferCatalog;
        this.hasPOS = builder.hasPOS;
        this.height = builder.height;
        this.homeLocation = builder.homeLocation;
        this.honorificPrefix = builder.honorificPrefix;
        this.honorificSuffix = builder.honorificSuffix;
        this.isicV4 = builder.isicV4;
        this.jobTitle = builder.jobTitle;
        this.knows = builder.knows;
        this.memberOf = builder.memberOf;
        this.naics = builder.naics;
        this.parent = builder.parent;
        this.performerIn = builder.performerIn;
        this.relatedTo = builder.relatedTo;
        this.sibling = builder.sibling;
        this.spouse = builder.spouse;
        this.taxID = builder.taxID;
        this.telephone = builder.telephone;
        this.vatID = builder.vatID;
        this.weight = builder.weight;
        this.workLocation = builder.workLocation;
        this.worksFor = builder.worksFor;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public String getAddress() {
        return address;
    }

    public Organization getAffiliation() {
        return affiliation;
    }

    public Organization getAlumniOf() {
        return alumniOf;
    }

    public String getAward() {
        return award;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public Calendar getBirthPlace() {
        return birthPlace;
    }

    public String getBrand() {
        return brand;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> getColleague() {
        return colleague;
    }

    public Person getContactPoint() {
        return contactPoint;
    }

    public Calendar getDeathDate() {
        return deathDate;
    }

    public Place getDeathPlace() {
        return deathPlace;
    }

    public String getDuns() {
        return duns;
    }

    public String getEmail() {
        return email;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public List<Person> getFollows() {
        return follows;
    }

    public String getGender() {
        return gender;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public OfferCatalog getHasOfferCatalog() {
        return hasOfferCatalog;
    }

    public Place getHasPOS() {
        return hasPOS;
    }

    public QuantitativeValue getHeight() {
        return height;
    }

    public Place getHomeLocation() {
        return homeLocation;
    }

    public String getHonorificPrefix() {
        return honorificPrefix;
    }

    public String getHonorificSuffix() {
        return honorificSuffix;
    }

    public String getIsicV4() {
        return isicV4;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public List<Person> getKnows() {
        return knows;
    }

    public List<Organization> getMemberOf() {
        return memberOf;
    }

    public String getNaics() {
        return naics;
    }

    public List<Person> getParent() {
        return parent;
    }

    public List<Event> getPerformerIn() {
        return performerIn;
    }

    public List<Person> getRelatedTo() {
        return relatedTo;
    }

    public List<Person> getSibling() {
        return sibling;
    }

    public Person getSpouse() {
        return spouse;
    }

    public String getTaxID() {
        return taxID;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getVatID() {
        return vatID;
    }

    public QuantitativeValue getWeight() {
        return weight;
    }

    public Place getWorkLocation() {
        return workLocation;
    }

    public List<Organization> getWorksFor() {
        return worksFor;
    }

    public static class Builder extends Thing.Builder {
        private String additionalName;
        private String address;
        private Organization affiliation;
        private Organization alumniOf;
        private String award;
        private Calendar birthDate;
        private Calendar birthPlace;
        private String brand;
        private List<Person> children;
        private List<Person> colleague;
        private Person contactPoint;
        private Calendar deathDate;
        private Place deathPlace;
        private String duns;
        private String email;
        private String familyName;
        private String faxNumber;
        private List<Person> follows;
        private String gender;
        private String givenName;
        private String globalLocationNumber;
        private OfferCatalog hasOfferCatalog;
        private Place hasPOS;
        private QuantitativeValue height;
        private Place homeLocation;
        private String honorificPrefix;
        private String honorificSuffix;
        private String isicV4;
        private String jobTitle;
        private List<Person> knows;
        private List<Organization> memberOf;
        private String naics;
        private List<Person> parent;
        private List<Event> performerIn;
        private List<Person> relatedTo;
        private List<Person> sibling;
        private Person spouse;
        private String taxID;
        private String telephone;
        private String vatID;
        private QuantitativeValue weight;
        private Place workLocation;
        private List<Organization> worksFor;

        public Builder setAdditionalName(String additionalName) {
            this.additionalName = additionalName;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAffiliation(Organization affiliation) {
            this.affiliation = affiliation;
            return this;
        }

        public Builder setAlumniOf(Organization alumniOf) {
            this.alumniOf = alumniOf;
            return this;
        }

        public Builder setAward(String award) {
            this.award = award;
            return this;
        }

        public Builder setBirthDate(Calendar birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setBirthPlace(Calendar birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setChildren(List<Person> children) {
            this.children = children;
            return this;
        }

        public Builder setColleague(List<Person> colleague) {
            this.colleague = colleague;
            return this;
        }

        public Builder setContactPoint(Person contactPoint) {
            this.contactPoint = contactPoint;
            return this;
        }

        public Builder setDeathDate(Calendar deathDate) {
            this.deathDate = deathDate;
            return this;
        }

        public Builder setDeathPlace(Place deathPlace) {
            this.deathPlace = deathPlace;
            return this;
        }

        public Builder setDuns(String duns) {
            this.duns = duns;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFamilyName(String familyName) {
            this.familyName = familyName;
            return this;
        }

        public Builder setFaxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }

        public Builder setFollows(List<Person> follows) {
            this.follows = follows;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setGivenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        public Builder setGlobalLocationNumber(String globalLocationNumber) {
            this.globalLocationNumber = globalLocationNumber;
            return this;
        }

        public Builder setHasOfferCatalog(OfferCatalog hasOfferCatalog) {
            this.hasOfferCatalog = hasOfferCatalog;
            return this;
        }

        public Builder setHasPOS(Place hasPOS) {
            this.hasPOS = hasPOS;
            return this;
        }

        public Builder setHeight(QuantitativeValue height) {
            this.height = height;
            return this;
        }

        public Builder setHomeLocation(Place homeLocation) {
            this.homeLocation = homeLocation;
            return this;
        }

        public Builder setHonorificPrefix(String honorificPrefix) {
            this.honorificPrefix = honorificPrefix;
            return this;
        }

        public Builder setHonorificSuffix(String honorificSuffix) {
            this.honorificSuffix = honorificSuffix;
            return this;
        }

        public Builder setIsicV4(String isicV4) {
            this.isicV4 = isicV4;
            return this;
        }

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setKnows(List<Person> knows) {
            this.knows = knows;
            return this;
        }

        public Builder setMemberOf(List<Organization> memberOf) {
            this.memberOf = memberOf;
            return this;
        }

        public Builder setNaics(String naics) {
            this.naics = naics;
            return this;
        }

        public Builder setParent(List<Person> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setPerformerIn(List<Event> performerIn) {
            this.performerIn = performerIn;
            return this;
        }

        public Builder setRelatedTo(List<Person> relatedTo) {
            this.relatedTo = relatedTo;
            return this;
        }

        public Builder setSibling(List<Person> sibling) {
            this.sibling = sibling;
            return this;
        }

        public Builder setSpouse(Person spouse) {
            this.spouse = spouse;
            return this;
        }

        public Builder setTaxID(String taxID) {
            this.taxID = taxID;
            return this;
        }

        public Builder setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder setVatID(String vatID) {
            this.vatID = vatID;
            return this;
        }

        public Builder setWeight(QuantitativeValue weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWorkLocation(Place workLocation) {
            this.workLocation = workLocation;
            return this;
        }

        public Builder setWorksFor(List<Organization> worksFor) {
            this.worksFor = worksFor;
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
        public Builder setPotentialAction(Action potentialAction) {
            super.setPotentialAction(potentialAction);
            return this;
        }

        @Override
        public Builder setSameAs(String sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Thing.Builder setSameAs(String[] sameAs) {
            super.setSameAs(sameAs);
            return this;
        }

        @Override
        public Builder setUrl(String url) {
            super.setUrl(url);
            return this;
        }

        @Override
        public Builder setId(String id) {
            super.setId(id);
            return this;
        }

        @Override
        public Person build() {
            return new Person(this);
        }
    }
}
