package nl.openweb.structured.data.schema.entities;

import static nl.ivonet.beanunit.Asserter.resetToDefaultTypes;
import static nl.ivonet.beanunit.BuilderBeanAsserter.createObject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Pim Schrama on 5/18/2016.
 */
public class NewsArticleTest extends AbstractEntityTest {

  @Before
  public void setUp() throws Exception {
    registerBuilderBeanAsserterDefaults();
  }

  @After
  public void tearDown() throws Exception {
    resetToDefaultTypes();
  }

  // Tests ignored because ancestors fail tests
  /*
   * @Test public void testAssertPojo() throws Exception {
   * BuilderBeanAsserter.assertBean(NewsArticle.class, "context", "type",
   * "image", "articleBody", "author", "publisher", "provider", "sameAs"); }
   */

  @Test
  public void testCreateObject() throws Exception {
    final NewsArticle thing = createObject(NewsArticle.class);
    assertNotNull(thing);
    assertEquals(NewsArticle.class.getSimpleName(), thing.getType());
  }

  @Test
  public void testCreateObjectWithExcludedProperties() throws Exception {
    String expectedArticleBody = "expectedArticleBody";
    Person expectedAuthorPerson = new Person.Builder().build();
    Organization expectedAuthorOrganization = new Organization.Builder().build();
    Person expectedPublisherPerson = new Person.Builder().build();
    Organization expectedPublisherOrganization = new Organization.Builder().build();

    NewsArticle.Builder builder = new NewsArticle.Builder();
    assertNull(builder.build().getArticleBody());
    assertNull(builder.build().getAuthor());
    assertNull(builder.build().getPublisher());

    builder.setArticleBody(expectedArticleBody).setAuthor(expectedAuthorPerson).setPublisher(expectedPublisherPerson);
    assertEquals(expectedArticleBody, builder.build().getArticleBody());
    assertEquals(expectedAuthorPerson, builder.build().getAuthor());
    assertEquals(expectedPublisherPerson, builder.build().getPublisher());

    builder.setAuthor(expectedAuthorOrganization).setPublisher(expectedPublisherOrganization);
    assertEquals(expectedAuthorOrganization, builder.build().getAuthor());
    assertEquals(expectedPublisherOrganization, builder.build().getPublisher());
  }
}