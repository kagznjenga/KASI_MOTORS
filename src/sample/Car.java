package sample;

import java.util.Date;

/** @author Samuel Njenga. */
public final class Car extends Vehicle {

  /** Class fields. */
  private Feature[] feature = new Feature[10];

  private int carAxle;

  /** Default constructor. */
  public Car() {
    // initialize vehicle
    super();

    // This sets the features and axle
    Feature[] f = {
      new InteriorFeature("No Interior Features"), new ExteriorFeature("No Exterior Features")
    };
    this.feature = f;
    this.carAxle = 2;
  }

  // Constructor for objects of class Vehicle

  /**
   * Overloading constructor.
   *
   * @param vehicleManufacturer receives a string value.
   * @param vehicleManufactureDate receives a date value.
   * @param vehicleMake receives a string value.
   * @param vehicleModel receives a string value.
   * @param vehicleType receives a string value.
   * @param vehicleFrame receives a chassis type value.
   * @param vehicleEngine receives an engine object
   * @param feature receives a Feature array type value.
   * @param carAxle receives an integer value.
   */
  public Car(
      String vehicleManufacturer,
      Date vehicleManufactureDate,
      String vehicleMake,
      String vehicleModel,
      String vehicleType,
      Chassis vehicleFrame,
      Engine vehicleEngine,
      Feature[] feature,
      int carAxle) {

    super(
        vehicleManufacturer,
        vehicleManufactureDate,
        vehicleMake,
        vehicleModel,
        vehicleType,
        vehicleFrame,
        vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;
  }

  /**
   * public getter for exterior features.
   *
   * @return returns a string value.
   */
  public String getExteriorFeatures() {
    String list = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof ExteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else list += "\n" + this.feature[i];
      }
    }
    return list;
  }

  /**
   * public getter for interior features.
   *
   * @return
   */
  public String getInteriorFeatures() {
    String list = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n" + this.feature[i];
        }
      }
    }
    return list;
  }

  /**
   * Override class to string methood
   *
   * @return returns a string value.
   */
  public String toString() {
    String list = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (list.length() == 0) {
        list += this.feature[i];
      } else {
        list += "\n" + this.feature[i];
      }
    }
    return super.toString() + "\n" + "Features : \n" + list + "\n" + "Car Axle      : " + carAxle;
  }

  public static void main(String[] args) {
    Car myCar1 = new Car();
    System.out.println(
        "----------------------------------------------------------------------------------");
    System.out.println(myCar1);

    System.out.println(
        "----------------------------------------------------------------------------------");

    Feature[] myFeature = {
      new InteriorFeature("AM/FM Radio"),
      new ExteriorFeature("Wood Panels"),
      new InteriorFeature("Air Conditioning"),
      new ExteriorFeature("MoonRoof")
    };

    Car myCar2 =
        new Car(
            "Honda",
            new Date(1325599999999L),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive"),
            myFeature,
            2);
    System.out.println(myCar2);

    System.out.println(
        "----------------------------------------------------------------------------------");

    Vehicle myVehicle =
        new Car(
            "Honda",
            new Date(1325599999999L),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            new ManufacturedEngine(
                "Honda", new Date(), "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive"),
            myFeature,
            2);
    System.out.println(((Car) myVehicle).getExteriorFeatures());

    System.out.println(
        "----------------------------------------------------------------------------------");

    System.out.println("Exterior Features : \n" + myCar2.getExteriorFeatures());

    System.out.println(
        "----------------------------------------------------------------------------------");

    System.out.println("Interior Features : \n" + myCar2.getInteriorFeatures());
  }
}
