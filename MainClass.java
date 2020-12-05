
/**
 * MainClass
 */

public class MainClass {
    
    
    // Function polymorphism and concepte .
   public static void printShape(Polygon polygon){
      polygon.showShape();
     }
     
   public static void main(String[] args) {
    
    // defined  object from Circle class .
    Circle circle = new Circle("cricle");
    circle.showShape();

        
    // defined  object from Ellipse class .
    Ellipse ellipse = new Ellipse();
    ellipse.showShape();

    // polymorphism  concepte .
    Rectangle rectangle = new Rectangle();
    printShape(rectangle);

    //  polymorphism  concepte .
    Square square = new Square();
    printShape(square);
   } 

}