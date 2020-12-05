


// shape class 
public  class Shape {
 
    // name of shape you wanted . 
    private String shapeName;

     //default conistractor shape class
     public Shape(){
      this.shapeName = "None";
     }

    //conistractor shape class
    public Shape(String shape_name){

        this.shapeName = shape_name;
    }

    //function ... to print shape 
    public void showShape(){
      System.out.println("the shape  is : " + this.shapeName);
    }

}