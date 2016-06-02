package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;

/**
 * An action performed by a direct agent and indirect participants upon a direct
 * object. Optionally happens at a location with the help of an inanimate
 * instrument. The execution of the action may produce a result. Specific action
 * sub-type documentation specifies the exact expectation of each argument/role.
 * <p>
 * Thing > Action
 *
 * @author Texelz (by Onhate)
 */
public class Action extends Thing {

    private Organization agent;
    private Calendar endTime;
    private Thing instrument;
    private PostalAddress location;
    private Thing object;
    private Organization participant;
    private Thing result;
    private Calendar startTime;

    public Action(Builder builder) {
        super(builder);
        agent = builder.agent;
        endTime = builder.endTime;
        instrument = builder.instrument;
        location = builder.location;
        object = builder.object;
        participant = builder.participant;
        result = builder.result;
        startTime = builder.startTime;
    }

    /**
     * The direct performer or driver of the action (animate or inanimate). e.g.
     * *John* wrote a book.
     *
     * @see Organization
     * @see Person
     */
    public Organization getAgent() {
        return this.agent;
    }


    /**
     * When the Action was performed: end time. This is for actions that span a
     * period of time. e.g. John wrote a book from January to *December*.
     */
    public Calendar getEndTime() {
        return this.endTime;
    }


    /**
     * The object that helped the agent perform the action. e.g. John wrote a
     * book with *a pen*.
     */
    public Thing getInstrument() {
        return this.instrument;
    }

    /**
     * The location of the event, organization or action.
     *
     * @see Place
     * @see PostalAddress
     */
    public PostalAddress getLocation() {
        return this.location;
    }

    /**
     * The object upon the action is carried out, whose state is kept intact or
     * changed. Also known as the semantic roles patient, affected or undergoer
     * (which change their state) or theme (which doesn't). e.g. John read *a
     * book*.
     */
    public Thing getObject() {
        return this.object;
    }

    /**
     * Other co-agents that participated in the action indirectly. e.g. John
     * wrote a book with *Steve*.
     *
     * @see Organization
     * @see Person
     */
    public Organization getParticipant() {
        return this.participant;
    }

    /**
     * The result produced in the action. e.g. John wrote *a book*.
     */
    public Thing getResult() {
        return this.result;
    }

    /**
     * When the Action was performed: start time. This is for actions that span
     * a period of time. e.g. John wrote a book from *January* to December.
     */
    public Calendar getStartTime() {
        return this.startTime;
    }


    public static class Builder extends Thing.Builder {
        private Organization agent;
        private Calendar endTime;
        private Thing instrument;
        private PostalAddress location;
        private Thing object;
        private Organization participant;
        private Thing result;
        private Calendar startTime;

        /**
         * @param agent The direct performer or driver of the action (animate or inanimate). e.g.
         *              *John* wrote a book. Can be an {@link Organization} or {@link Person}
         */
        public Builder setAgent(Organization agent) {
            this.agent = agent;
            return this;
        }

        /**
         * @param endTime When the Action was performed: end time. This is for actions that span a
         *                period of time. e.g. John wrote a book from January to *December*.
         */
        public Builder setEndTime(Calendar endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * @param instrument The object that helped the agent perform the action. e.g. John wrote a
         *                   book with *a pen*.
         */
        public Builder setInstrument(Thing instrument) {
            this.instrument = instrument;
            return this;
        }

        /**
         * @param location The location of the event, organization or action.
         * @see Place
         * @see PostalAddress
         */
        public Builder setLocation(PostalAddress location) {
            this.location = location;
            return this;
        }

        /**
         * The object upon the action is carried out, whose state is kept intact or
         * changed. Also known as the semantic roles patient, affected or undergoer
         * (which change their state) or theme (which doesn't). e.g. John read *a
         * book*.
         */
        public Builder setObject(Thing object) {
            this.object = object;
            return this;
        }

        /**
         * @param participant Other co-agents that participated in the action indirectly. e.g. John
         *                    wrote a book with *Steve*.
         * @see Organization
         * @see Person
         */
        public Builder setParticipant(Organization participant) {
            this.participant = participant;
            return this;
        }

        /**
         * @param result The result produced in the action. e.g. John wrote *a book*.
         */
        public Builder setResult(Thing result) {
            this.result = result;
            return this;
        }

        /**
         * When the Action was performed: start time. This is for actions that span
         * a period of time. e.g. John wrote a book from *January* to December.
         */
        public Builder setStartTime(Calendar startTime) {
            this.startTime = startTime;
            return this;
        }

        /*
                Following lines override the Parent Thing Builder
                 */
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
        public Action build() {
            return new Action(this);
        }
    }
}
