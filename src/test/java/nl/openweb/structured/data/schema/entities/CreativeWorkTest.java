package nl.openweb.structured.data.schema.entities;

import static nl.ivonet.beanunit.Asserter.resetToDefaultTypes;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreativeWorkTest extends ThingTest {

  @Override
  @Before
  public void setUp() throws Exception {
    registerBuilderBeanAsserterDefaults();
  }

  @Override
  @After
  public void tearDown() throws Exception {
    resetToDefaultTypes();
  }

  @Test
  public void testTemporalCoverage() throws Exception {
    String expectedTemporalCoverage = "1985-present";
    CreativeWork.Builder builder = new CreativeWork.Builder();
    builder.setTemporalCoverage(expectedTemporalCoverage);
    assertEquals(expectedTemporalCoverage, builder.build().getTemporalCoverage());
  }

}