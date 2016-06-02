package nl.openweb.structured.data.schema.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import nl.ivonet.beanunit.BuilderBeanAsserter;


import static nl.ivonet.beanunit.Asserter.resetToDefaultTypes;
import static nl.ivonet.beanunit.BuilderBeanAsserter.createObject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Pim Schrama on 5/18/2016.
 */
public class ThingTest extends AbstractEntityTest{

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
        BuilderBeanAsserter.assertBean(Thing.class, "context", "type", "image");
    }

    @Test
    public void testCreateObjectWithImageObject() throws Exception {

        final Thing thing = createObject(Thing.class, "context", "type", "image");
        assertNotNull(thing);
        assertEquals("http://schema.org", thing.getContext());
        assertEquals(Thing.class.getSimpleName(), thing.getType());
        assertNotNull( thing.getImage());
    }

    @Test
    public void testCreateObjectWithoutImageObject() throws Exception {
        String expectedImageAsString = "dit is een image";
        ImageObject expectedImage = new ImageObject.Builder().build();
        Thing.Builder builder = new Thing.Builder();

        builder.setImage(expectedImageAsString);
        assertEquals(expectedImageAsString, builder.build().getImage());

        builder.setImage(expectedImage);
        assertEquals(expectedImage, builder.build().getImage());

    }


}