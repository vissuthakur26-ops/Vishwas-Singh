class  MainEmployees{
    private int id;
    private String name;
    
    public String getName() {
        return name ;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
}
}

public class access_modifier {
    public static void main(String[] args) {
        MainEmployees Vishwas = new MainEmployees();
        Vishwas.setId(57);
        Vishwas.setName("code is my passion");
        System.out.println(Vishwas.getName());
        System.out.println(Vishwas.getId());
    }
    
}
