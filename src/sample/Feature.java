package sample;

/** @author Samuel Njenga. */

/** Feature interface is implemented by ExteriorFeature and InteriorFeature classes. */
public interface Feature {
  /**
   * public interface getter.
   *
   * @return returns a string value.
   */
  public String getFeature();

  /**
   * public interface setter.
   *
   * @param feature receives a string value.
   */
  public void setFeature(String feature);
}
