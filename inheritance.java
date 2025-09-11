// class base{
//     public int x;

//     public int getX(){
//         return x;
//     }
//         public void setX(int x){
//             System.out.println("I am in base and setting x");
//             this.x=x;
//         }
//         public void printMe(){
//             System.out.println("I am a constructor");
//         }
//     }

//     // Inheriting the parent class using extends............

//     class derived extends base {
//         public int y;

//     public int getX(){
//         return y;
//     }
//         public void setX(int y){
//             this.y=y;
//         }

//     }
// public class inheritance {
//     public static void main(String[] args) {
//         base b=new base();
//         b.setX(32);
//         System.out.println(b.getX());

//         derived d=new derived();
//         d.setX(45);
//         System.out.println(d.getX());
        
//     }
    
// }

//PROBLRM NO 2.............
class dog{
    public String puppy;
    public String getPuppy(){
        return puppy;
    }
    public void setPuppy(String puppy){
        System.out.println("It is domestic animal");
        this.puppy=puppy;
    }
}
class animal extends dog{
    public String lion;
    public String getLion(){
        return lion;
    }
    public void setLion(String lion){
        System.out.println("It is wild animal");
        this.lion=lion;
    }

}
public class inheritance{
    public static void main(String[] args) {
        dog d=new dog ();
        d.setPuppy("bark");
        System.out.println(d.getPuppy());

        animal a =new animal ();
        a.setLion("Roar");
         System.out.println(a.getLion());


    }
}