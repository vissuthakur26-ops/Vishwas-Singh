// class Employees{
//     int salary;
//     String name;

//     public int getSalary(){
//         return salary;
//     }

//     public String getName(){
//         return name;

//     }

//     public void setName(String n){
//         name = n;

       
    
//     }
// }

// public class basi_que_oops {
//     public static void main(String[] args) {
        
//          // problem 1

//          Employees Vishwas = new Employees();
//          Vishwas.setName  ("Code is passion");
//         Vishwas.salary=24556;
//         System.out.println( Vishwas.getSalary());
//          System.out.println( Vishwas.getName());
//     }
    
// }


// class cellphone{

//     public void ring(){
//         System.out.println("Ringing.....");
//     }

//     public void vibrate(){
//         System.out.println("Vibrating.....");
//     }
//     public void callfriend(){
//         System.out.println("Calling.....");
// }
// }
// public class basi_que_oops {
//     public static void main(String[] args) {
//         cellphone Asus = new cellphone();
//         Asus.callfriend();
//         Asus.vibrate();
//         Asus.ring();
//     }
// }


// class square{
//     int side;
//     public int area(){
//         return side * side;
//     }

// public int perimeter(){
//     return 4*side;

// }
// }
// public class basi_que_oops {
//      public static void main(String[] args) {

//         square sq=new square();
//         sq.side=4;
//         System.out.println(sq.area());
//         System.out.println(sq.perimeter());
//      }
//     }

// class rectangle{
//     int length;
//     int breadth;
//     public int area(){
//         return length * breadth;
//     }
//        public int perimeter(){
//         return 2*(length + breadth);
// }
// }
// public class basi_que_oops {
//      public static void main(String[] args) {
//         rectangle rec = new rectangle();
//         rec.length=5;
//         rec.breadth=6;
//         System.out.println(rec.area());
//         System.out.println(rec.perimeter());
//      }
//     }

class circle{
    int radius;
    double pi;
    public double area(){
        return pi*(radius*radius);
    }
    public double perimeter(){
        return 2*pi*radius;
    }
}
public class basi_que_oops {
      public static void main(String[] args) {
        circle cir=new circle();
        cir.radius=4;
        cir.pi=3.14;
        System.out.println(cir.area());
        System.out.println(cir.perimeter());
      }
    }
