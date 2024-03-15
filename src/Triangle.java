public class Triangle extends Shape{
  protected Double side1;
  protected Double side2;
  protected Double side3;

  public Triangle (String name, Double side1, Double side2, Double side3) {
    this.name = name;
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.calculateArea();
  }

  protected void calculateArea() {
    double halfperimeter = (side1 + side2 + side3) / 2;
    super.area = Math.sqrt(
        halfperimeter
        *(halfperimeter - side1)
        *(halfperimeter - side2)
        *(halfperimeter - side3)        
        );
  }
    
  public void getInfo() {
    System.out.println("Triangle" + name+"info");
    System.out.println("area" + super.area);
    System.out.println("wiht sides" + side1);
    System.out.println("," + side2);
    System.out.println("," + side3);
    System.out.println();
  }
}
