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
public class ProductTest extends AbstractEntityTest{

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
        BuilderBeanAsserter.assertBean(Product.class, "context", "type", "image");
    }

    @Test
    public void testCreateObject() throws Exception {
        final Product thing = createObject(Product.class);
        assertNotNull(thing);
        assertEquals(Product.class.getSimpleName(), thing.getType());
    }

}