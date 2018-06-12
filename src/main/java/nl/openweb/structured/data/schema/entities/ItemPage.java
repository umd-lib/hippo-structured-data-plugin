package nl.openweb.structured.data.schema.entities;

public class ItemPage extends WebPage {
  protected ItemPage(Builder builder) {
    super(builder);
  }

  public static class Builder extends WebPage.Builder {
    @Override
    public ItemPage build() {
      return new ItemPage(this);
    }
  }
}
