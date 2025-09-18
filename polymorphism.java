// class sample{
//     public void greet(){
//         System.out.println("Good Morning");
//     }
//     public String name(String Vishwas){
//     return Vishwas;
//     }
// }
// class Sample1 extends sample{
//     public void greet2(){
//         System.out.println("Good Night");
//     }
//     public int time(){
//         return 3;

//     }
// }
// public class polymorphism {
//     public static void main(String[] args) {
//       //  sample sp=new Sample1();
//       Sample1 sp2=new Sample1 ();
//         sp2.greet();
//         sp2.greet2();
//         sp2.time();
//     }
    
// }


//..........................................................................
interface camera{
    void TakeSnap();
    void RecordVideo();
   // default void Record4kVideo(){
     //   System.out.println("Recording ");
    
}
interface wifi{
    String[] getNetwork();
    void Connect(String Network);
}
class Mycellphone{
    void Callphonenumber(int phonenumber){
        System.out.println("Calling"+phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting");
    }
}
class Smartphone extends Mycellphone implements camera,wifi {
    public void TakeSnap(){
        System.out.println("taking snap");
    }
    public void RecordVideo(){
        System.out.println("Record Video");
    }
    public String [] getNetwork(){
        System.out.println("Connecting to List of Network");
        String [] networkList = {"Vishwas","Avinash","Anjani"};
        return networkList;
    

    }
    public void pickcall(){
        System.out.println("Pick Up call");
    }
    
    public void Connect(String Network) {
        System.out.println("Connecting to "+Network);
    }  
         
}
 public class polymorphism {
     public static void main(String[] args) {
         camera cam1 =new Smartphone();
         cam1.TakeSnap();
        // cam1.pickcall.............Not allowed only camera method are allowed

        Mycellphone mphn = new Smartphone();
        mphn.Callphonenumber(56476);



     }
    }