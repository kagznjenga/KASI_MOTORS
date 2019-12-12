package sample;

/** @author Samuel Njenga. */
public class ExteriorFeature implements Feature {

  /** Class Fields. */
  private String exteriorFeature;

  /** Default constructor. */
  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  /**
   * Overloaded constructor.
   *
   * @param exteriorFeature receives a string as an argument.
   */
  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  /**
   * Public getter for exterior feature.
   *
   * @return returns a string value.
   */
  public String getFeature() {
    return this.exteriorFeature;
  }

  /**
   * Public setter for exterior feature.
   *
   * @param feature receives a string value.
   */
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  /**
   * Overrides class to string method.
   *
   * @return returns a string.
   */
  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }

  public static void main(String[] args) {
    ExteriorFeature extFeat1 = new ExteriorFeature();
    System.out.println(extFeat1);

    System.out.println(
        "----------------------------------------------------------------------------------");
    ExteriorFeature extFeat2 = new ExteriorFeature("Fog Lamps");
    System.out.println(extFeat2);
  }
}
