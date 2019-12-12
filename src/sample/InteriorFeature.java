package sample;

/** @author Samuel Njenga. */

/** @class InteriorFeature implements the feature interface. */
public class InteriorFeature implements Feature {

  /** Class field. */
  private String interiorFeature;

  /** Default constructor. */
  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  /**
   * Overloading constructor.
   *
   * @param interiorFeature receives a String value.
   */
  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  /**
   * public getter.
   *
   * @return String as a value.
   */
  public String getFeature() {
    return this.interiorFeature;
  }

  /**
   * * public setter
   *
   * @param feature receives a string value.
   */
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  /**
   * Override toString method.
   *
   * @return String as a value.
   */
  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }

  public static void main(String[] args) {
    InteriorFeature interior1 = new InteriorFeature();
    System.out.println(interior1);

    System.out.println(
        "----------------------------------------------------------------------------------");

    InteriorFeature interior2 = new InteriorFeature("Climate Control");
    System.out.println(interior2);
  }
}
