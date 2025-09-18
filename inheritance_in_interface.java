interface sample{
    void math1();
    void math2();
}
interface childsample extends sample{
    void math3();
    void math4();
}
class Mychildsample implements childsample{

   public void math1(){
    System.out.println("Rectangle");
    }
    public void math2(){
        System.out.println("Square");   
    }
    public void math3(){
        System.out.println("Surface area");
    }
    public void math4(){
        System.out.println("Area");
    }
}

public class inheritance_in_interface {
    public static void main(String[]args){
        Mychildsample obj = new Mychildsample();
        obj.math1();
        obj.math2();
        obj.math3();
        obj.math4();

    }
    
}
