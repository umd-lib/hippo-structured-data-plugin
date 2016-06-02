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
public class IntangibleTest extends AbstractEntityTest{

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
        BuilderBeanAsserter.assertBean(Intangible.class, "context", "type", "image");
    }

    @Test
    public void testCreateObject() throws Exception {

        final Thing thing = createObject(Intangible.class, "context", "type", "image");
        assertNotNull(thing);
        assertEquals(Intangible.class.getSimpleName(), thing.getType());
    }


}