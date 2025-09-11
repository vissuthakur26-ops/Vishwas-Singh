// class Student{
//    private String name;
//    private int id;

// //Constructor automatically invoke ho gya

//    public Student(){
//       name="Your-Name-Here";
//       id=58;
//    }
//    public String getName(){
//     return name;
//    }
//    public void setName(){
//     this.name=n;
//     }
//    public void setId(){
//      this.id=i;
//        }
//    public int getId(){
//      return id;
//      }
// }

// public class constructor {
//    public static void main (String[]args){
//       Student vishwas=new Student();
//       System.out.println(vishwas.getId());
//       System.out.println(vishwas.getName());


//    }
    
// }

//..........................................................................................................................
// passing the argument to the constructor


class Student{
   private String name;
   private int id;

//Constructor automatically invoke ho gya

   public Student(String myName,int myId){
      name= myName;
      id=myId;
   }
   //Example of overloading,,,,,,,,,,,,,,,

  // public Student(){
  //    name= "Avinash";
  //    id=765;
  // }
   public String getName(){return name;}
   public void setName(){this.name=n;}
   public void setId(){this.id=i;}
   public int getId(){return id;}
}

public class constructor {
   public static void main (String[]args){
      Student vishwas=new Student("Code with Vishwas",58);
      //Student vishwas=new Student();
      System.out.println(vishwas.getId());
      System.out.println(vishwas.getName());


   }
    
}
