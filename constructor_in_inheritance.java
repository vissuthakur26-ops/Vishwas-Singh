
// class base1{
//     base1(){
//         System.out.println("I am a constructor");
//     }
    
//     }
//     class derived1 extends base1 {
//         derived1(){
//             System.out.println("I am derived class constructor");

//         }

    
//     }
// public class constructor_in_inheritance {
//     public static void main(String[] args) {
//        //base1 b = new base1 ();
//        derived1 d = new derived1 ();
//     }
// }

//Example of calling over loaded constructor using inheritance........................

class base1{
    base1(){
        System.out.println("I am a constructor");
    }
    base1(int x){
        System.out.println("I am a overloaded  constructor"+x);
    }
    }
    class derived1 extends base1 {
        derived1(){
           // super(0);
            System.out.println("I am derived class constructor");

        }
        derived1(int x,int y){
            super(x);
            System.out.println("I am a overloaded  constructor of derived class with value y as:"+y);
    }
}
class grandchild extends derived1{
    grandchild(){
        System.out.println("i am a constructor of grandchild");
    }
    grandchild(int x,int y, int z){
        super(x,y);
        System.out.println("I am a overloaded  constructor of derived class with value z as:"+z);

}}
    
public class constructor_in_inheritance {
    public static void main(String[] args) {
       //base1 b = new base1 ();
       //derived1 d = new derived1 ();
      // derived1 d = new derived1 (14,35);
     // grandchild gc = new grandchild();
       grandchild gc = new grandchild(12,19,35);
    }
}