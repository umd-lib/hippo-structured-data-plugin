package nl.openweb.structured.data.schema.entities;

import java.util.Calendar;

import static nl.ivonet.beanunit.Asserter.registerTypeAndDefaultArgument;

/**
 * Created by Pim Schrama on 5/30/2016.
 */
public class AbstractEntityTest {
    protected void registerBuilderBeanAsserterDefaults() {
        registerTypeAndDefaultArgument(Thing.class, new Thing.Builder().build());
        registerTypeAndDefaultArgument(Action.class, new Action.Builder().build());
        registerTypeAndDefaultArgument(ImageObject.class, new ImageObject.Builder().build());
        registerTypeAndDefaultArgument(AggregateRating.class, new AggregateRating.Builder().build());
        registerTypeAndDefaultArgument(Audience.class, new Audience.Builder().build());
        registerTypeAndDefaultArgument(Organization.class, new Organization.Builder().build());
        registerTypeAndDefaultArgument(Product.class, new Product.Builder().build());
        registerTypeAndDefaultArgument(Review.class, new Review.Builder().build());
        registerTypeAndDefaultArgument(QuantitativeValue.class, new QuantitativeValue.Builder().build());
        registerTypeAndDefaultArgument(AdministrativeArea.class, new AdministrativeArea.Builder().build());
        registerTypeAndDefaultArgument(PostalAddress.class, new PostalAddress.Builder().build());
        registerTypeAndDefaultArgument(Comment.class, new Comment.Builder().build());
        registerTypeAndDefaultArgument(CreativeWork.class, new CreativeWork.Builder().build());
        registerTypeAndDefaultArgument(Place.class, new Place.Builder().build());
        registerTypeAndDefaultArgument(Event.class, new Event.Builder().build());
        registerTypeAndDefaultArgument(Person.class, new Person.Builder().build());

        registerTypeAndDefaultArgument(Calendar.class, Calendar.getInstance());
        registerTypeAndDefaultArgument(Double.class, 33.33);
        registerTypeAndDefaultArgument(Number.class, 33);
    }
}
