// class cyclinder{
// private int radius;
// private int height;

// public int getRadius(){
//     return radius;
// }
// public void setRadius(int radius){
//     this.radius=radius;
// }
// public int getHeight(){
//     return height;
// }
// public void setHeight(int height){
//     this.height=height;
// }
// }
// public class constructor_que {
//     public static void main(String[] args) {
//         cyclinder myCyclinder=new cyclinder();
//         myCyclinder.setHeight(12);
//         System.out.println(myCyclinder.getHeight());
//          myCyclinder.setRadius(9);
//         System.out.println(myCyclinder.getRadius());
//     }
// }


//problem no 2..........................

//  class cyclinder{
// private int radius;
// private int height;

// public int getRadius(){
//     return radius;
// }
// public void setRadius(int radius){
//     this.radius=radius;
// }
// public int getHeight(){
//     return height;
// }
// public void setHeight(int height){
//     this.height=height;
// }

// public double surfaceArea(){
//     return 2* Math.PI* radius * radius + 2*Math.PI * radius *height;
// }}
//     public class constructor_que {

//     public static void main(String[] args) {
//         cyclinder myCyclinder=new cyclinder();
//         myCyclinder.setHeight(12);
//         System.out.println(myCyclinder.getHeight());
//          myCyclinder.setRadius(9);
//         System.out.println(myCyclinder.getRadius());
//         System.err.println(myCyclinder.surfaceArea());


// }
//     }

//SOLVE PROBLEM 2 USING CONSTRUCTOR..............................

//  class cyclinder{
// private int radius;
// private int height;

// public cyclinder(int radius,int height){
//     this.radius=radius;
//     this.height=height;
// }

// public int getRadius(){
//     return radius;
// }
// public void setRadius(int radius){
//     this.radius=radius;
// }
// public int getHeight(){
//     return height;
// }
// public void setHeight(int height){
//     this.height=height;
// }

// }
//     public class constructor_que {

//     public static void main(String[] args) {
//         cyclinder myCyclinder=new cyclinder(14,20);
//         System.out.println(myCyclinder.getHeight());
//         System.out.println(myCyclinder.getRadius());
    


// }
//     }


//CONSTRUCTOR OVERLOADING..............................................

class cyclinder{
private int radius;
private int height;

public cyclinder(int radius,int height){
    this.radius=radius;
    this.height=height;
}

public int getRadius(){
    return radius;
}
public void setRadius(int radius){
    this.radius=radius;
}
public int getHeight(){
    return height;
}

public void setHeight(int height){
    this.height=height;
}
}
class Rectangle{
private int length;
private int breadth;
public Rectangle(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
}
public int getLength(){
    return length;
}
public void setLength(int length){
    this.length=length;
}
public int getBreadth(){
    return breadth;
}

public void setBreadth(int breadth){
    this.breadth=breadth;
}
}

    public class constructor_que {

    public static void main(String[] args) {
        cyclinder myCyclinder=new cyclinder(14,20);
        Rectangle myrectangle=new Rectangle(20,20);
        System.out.println(myCyclinder.getHeight());
        System.out.println(myCyclinder.getRadius());
        System.out.println(myrectangle.getLength());
        System.out.println(myrectangle.getBreadth());
    


}
    }