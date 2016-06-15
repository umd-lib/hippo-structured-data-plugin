package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;
import java.util.List;

public class Organization extends Thing {

    private Object address;
    private List<Person> alumni;
    private Object areaServed;
    private String award;
    private List<ContactPoint> contactPoint;
    private Organization department;
    private Calendar dissolutionDate;
    private String duns;
    private String email;
    private List<Person> employee;
    private List<Event> event;
    private String faxNumber;
    private Person founder;
    private Calendar foundingDate;
    private Place foundingLocation;
    private String globalLocationNumber;
    private OfferCatalog hasOfferCatalog;
    private Place hasPOS;
    private String isicV4;
    private String legalName;
    private Object location;
    private Object logo;
    private List<Thing> member;
    private Organization memberOf;
    private String naics;
    private QuantitativeValue numberOfEmployees;
    private Organization parentOrganization;
    private List<Review> review;
    private Organization subOrganization;
    private String taxID;
    private String telephone;
    private String vatID;

    protected Organization(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.alumni = builder.alumni;
        this.areaServed = builder.areaServed;
        this.award = builder.award;
        this.contactPoint = builder.contactPoint;
        this.department = builder.department;
        this.dissolutionDate = builder.dissolutionDate;
        this.duns = builder.duns;
        this.email = builder.email;
        this.employee = builder.employee;
        this.event = builder.event;
        this.faxNumber = builder.faxNumber;
        this.founder = builder.founder;
        this.foundingDate = builder.foundingDate;
        this.foundingLocation = builder.foundingLocation;
        this.globalLocationNumber = builder.globalLocationNumber;
        this.hasOfferCatalog = builder.hasOfferCatalog;
        this.hasPOS = builder.hasPOS;
        this.isicV4 = builder.isicV4;
        this.legalName = builder.legalName;
        this.location = builder.location;
        this.logo = builder.logo;
        this.member = builder.member;
        this.memberOf = builder.memberOf;
        this.naics = builder.naics;
        this.numberOfEmployees = builder.numberOfEmployees;
        this.parentOrganization = builder.parentOrganization;
        this.review = builder.review;
        this.subOrganization = builder.subOrganization;
        this.taxID = builder.taxID;
        this.telephone = builder.telephone;
        this.vatID = builder.vatID;
    }

    public Object getAddress() {
        return address;
    }

    public List<Person> getAlumni() {
        return alumni;
    }

    public Object getAreaServed() {
        return areaServed;
    }

    public String getAward() {
        return award;
    }

    public List<ContactPoint> getContactPoint() {
        return contactPoint;
    }

    public Organization getDepartment() {
        return department;
    }

    public Calendar getDissolutionDate() {
        return dissolutionDate;
    }

    public String getDuns() {
        return duns;
    }

    public String getEmail() {
        return email;
    }

    public List<Person> getEmployee() {
        return employee;
    }

    public List<Event> getEvent() {
        return event;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public Person getFounder() {
        return founder;
    }

    public Calendar getFoundingDate() {
        return foundingDate;
    }

    public Place getFoundingLocation() {
        return foundingLocation;
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

    public String getIsicV4() {
        return isicV4;
    }

    public String getLegalName() {
        return legalName;
    }

    public Object getLocation() {
        return location;
    }

    public Object getLogo() {
        return logo;
    }

    public List<Thing> getMember() {
        return member;
    }

    public Organization getMemberOf() {
        return memberOf;
    }

    public String getNaics() {
        return naics;
    }

    public QuantitativeValue getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public Organization getParentOrganization() {
        return parentOrganization;
    }

    public List<Review> getReview() {
        return review;
    }

    public Organization getSubOrganization() {
        return subOrganization;
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

    public static class Builder extends Thing.Builder {
        private Object address;
        private List<Person> alumni;
        private Object areaServed;
        private String award;
        private List<ContactPoint> contactPoint;
        private Organization department;
        private Calendar dissolutionDate;
        private String duns;
        private String email;
        private List<Person> employee;
        private List<Event> event;
        private String faxNumber;
        private Person founder;
        private Calendar foundingDate;
        private Place foundingLocation;
        private String globalLocationNumber;
        private OfferCatalog hasOfferCatalog;
        private Place hasPOS;
        private String isicV4;
        private String legalName;
        private Object location;
        private Object logo;
        private List<Thing> member;
        private Organization memberOf;
        private String naics;
        private QuantitativeValue numberOfEmployees;
        private Organization parentOrganization;
        private List<Review> review;
        private Organization subOrganization;
        private String taxID;
        private String telephone;
        private String vatID;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(PostalAddress address) {
            this.address = address;
            return this;
        }

        public Builder setAlumni(List<Person> alumni) {
            this.alumni = alumni;
            return this;
        }

        public Builder setAreaServed(String areaServed) {
            this.areaServed = areaServed;
            return this;
        }

        public Builder setAreaServed(Place areaServed) {
            this.areaServed = areaServed;
            return this;
        }

        public Builder setAward(String award) {
            this.award = award;
            return this;
        }

        public Builder setContactPoint(List<ContactPoint> contactPoint) {
            this.contactPoint = contactPoint;
            return this;
        }

        public Builder setDepartment(Organization department) {
            this.department = department;
            return this;
        }

        public Builder setDissolutionDate(Calendar dissolutionDate) {
            this.dissolutionDate = dissolutionDate;
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

        public Builder setEmployee(List<Person> employee) {
            this.employee = employee;
            return this;
        }

        public Builder setEvent(List<Event> event) {
            this.event = event;
            return this;
        }

        public Builder setFaxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }

        public Builder setFounder(Person founder) {
            this.founder = founder;
            return this;
        }

        public Builder setFoundingDate(Calendar foundingDate) {
            this.foundingDate = foundingDate;
            return this;
        }

        public Builder setFoundingLocation(Place foundingLocation) {
            this.foundingLocation = foundingLocation;
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

        public Builder setIsicV4(String isicV4) {
            this.isicV4 = isicV4;
            return this;
        }

        public Builder setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(Place location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(PostalAddress location) {
            this.location = location;
            return this;
        }

        public Builder setLogo(String logo) {
            this.logo = logo;
            return this;
        }

        public Builder setLogo(ImageObject logo) {
            this.logo = logo;
            return this;
        }

        public Builder setMember(List<Thing> member) {
            this.member = member;
            return this;
        }

        public Builder setMemberOf(Organization memberOf) {
            this.memberOf = memberOf;
            return this;
        }

        public Builder setNaics(String naics) {
            this.naics = naics;
            return this;
        }

        public Builder setNumberOfEmployees(QuantitativeValue numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public Builder setParentOrganization(Organization parentOrganization) {
            this.parentOrganization = parentOrganization;
            return this;
        }

        public Builder setReview(List<Review> review) {
            this.review = review;
            return this;
        }

        public Builder setSubOrganization(Organization subOrganization) {
            this.subOrganization = subOrganization;
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
        public Organization build() {
            return new Organization(this);
        }

    }

}
