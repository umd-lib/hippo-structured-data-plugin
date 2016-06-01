package nl.openweb.structured.data.schema.entities;

import nl.ivonet.beanunit.BuilderBeanAsserter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static nl.ivonet.beanunit.Asserter.resetToDefaultTypes;
import static nl.ivonet.beanunit.BuilderBeanAsserter.createObject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Pim Schrama on 5/18/2016.
 */
public class RatingTest extends AbstractEntityTest{

    @Before
    public void setUp() throws Exception {
        registerBuilderBeanAsserterDefaults();
    }

    @After
    public void tearDown() throws Exception {
        resetToDefaultTypes();
    }

    @Test
    public void testAssertPojo() throws Exception {
        BuilderBeanAsserter.assertBean(Rating.class, "context", "type", "image","bestRating","worstRating");
    }

    @Test
    public void testCreateObject() throws Exception {
        final Rating thing = createObject(Rating.class);
        assertNotNull(thing);
        assertEquals(Rating.class.getSimpleName(), thing.getType());
    }

    @Test
    public void testCreateObjectWithRating() throws Exception {
        String expectedWorstRating = "worstRating";
        String expectedBestRating = "bestRating";
        Number expectedNumber = 44;

        Rating.Builder builder = new Rating.Builder();
        builder.setBestRating(expectedNumber).setWorstRating(expectedNumber);
        assertEquals(expectedNumber, builder.build().getBestRating());
        assertEquals(expectedNumber, builder.build().getWorstRating());

        builder.setBestRating(expectedBestRating).setWorstRating(expectedWorstRating);
        assertEquals(expectedBestRating, builder.build().getBestRating());
        assertEquals(expectedWorstRating, builder.build().getWorstRating());


    }
}