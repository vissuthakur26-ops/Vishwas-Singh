interface camera{
    void TakeSnap();
    void RecordVideo();
    default void Record4kVideo(){
        System.out.println("Recording ");
    }
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
 public class default_in_interface {
     public static void main(String[] args) {
         Smartphone phn =new Smartphone();
         phn.Record4kVideo();
       String[] arr= phn.getNetwork();
       for(String item:arr){
        System.out.println(item);
       }



     }
    }
