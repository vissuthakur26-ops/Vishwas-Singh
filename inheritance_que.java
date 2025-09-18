// class circle{
//     public int radius;
//     circle (int r){
//         System.out.println("i am a circle parametric");
//         this.radius=r;
//     }
//     public double area(){
//         return Math.PI*this.radius*this.radius;
//     }

//     }
//     class cyclinder1 extends circle{
//          public int height;
//         cyclinder1(int r,int h){
//             super(r);
//             System.out.println("i am a parametric cyclinder");
//             this.height=h;

//         }
    
//         public double volume(){
//             return Math.PI*this.radius*this.radius*this.height;
            
//         }
//     }


// public class inheritance_que {
//     public static void main(String[] args) {
//       //circle cir =new circle(12);
//     cyclinder1 cyc=new cyclinder1(12,57);
        
//     }
// }


//problem no 2....................................................

class area{
   private double pi;
    private int radius;
    public area(int radius,double pi){
     this.radius=radius;
     this.pi=pi;
 
}
    public double getPi(){
        return pi;

    }
    public void setPi(int pi){
        this.pi=pi;
        
    }
     public int getRadius(){
        return radius;

    }
    public void setRadius(int radius){
        this.radius=radius;

    }
}
class  perimeter extends area{
    private double pi;
    private int radius;
     public perimeter(double pi,int radius){
       
        this.pi=pi;
         this.radius=radius;
    
     }
    

    public double getPi(){
        return pi;

    }
    public void setPi(double pi){
        this.pi=pi;
        
    }
     public int getRadius(){
        return radius;

    }
    public void setRadius(int radius){
        this.radius=radius;
    }
}
 public class inheritance_que {
     public static void main(String[] args) {
        perimeter per = new perimeter(10,35);
        System.out.println(per.getRadius());


     }
    }