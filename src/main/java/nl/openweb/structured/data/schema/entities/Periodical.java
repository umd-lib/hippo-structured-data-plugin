package nl.openweb.structured.data.schema.entities;

public class Periodical extends CreativeWorkSeries {

  protected Periodical(Builder builder) {
    super(builder);
  }

  public static class Builder extends CreativeWorkSeries.Builder {

    @Override
    public Periodical build() {
      return new Periodical(this);
    }
  }

}
