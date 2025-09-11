class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void On(){
        System.out.println("Turning on phone");
    }
}
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("Welcome");
    }
    public void On(){
        System.out.println("Smartphone Turning On");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
       // Phone ph = new Phone();   //Allowed 
       // Smartphone sph = new Smartphone ():
      //  ph.On();

      //...Dynamic Method
      Phone ph = new Smartphone();
      ph.On();
    
    }
    
}
