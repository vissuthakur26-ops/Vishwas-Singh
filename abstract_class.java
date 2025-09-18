abstract class Parent{
    public Parent(){
        System.out.println("I am a coctructor of parent");
    }
     public void sayHello(){
        System.out.println("Hello");
     }
     abstract void greet();
     abstract void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Night");
    }

}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am Good");
    }
}


public class abstract_class {
    public static void main(String[]args){
        //Parent p = new Parent(); ...... not allow because abstract kabhi object nahi ban sakta 
        Child ch =new Child();
        
    
        // Child2 ch2 = new Child2(); .........not allowed
      //  Parent vishwas = new Child();  // ALLOWED

    }
    
}
