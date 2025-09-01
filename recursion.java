public class recursion {
    //factorial (0)=1
    //factorial(n)=n*(n-1)*.......1
    //factorial(n)=n*factorial(n-1)



   //static int factorial(int n){
    //  if(n==0 || n==1) {
     //       return 1 ;
    //    }
     //   else{
    //        return n*factorial(n-1);
    //    }
    //    }
    //    public static void main(String[]args){

        
    //    int n=4;
    //    System.out.println("the factorial is:"+factorial(n));
//    }
    
//}


//to print fibannco series...............
static int fibannaco(int n){
      if(n==0 ) {
            return 0 ;
      }
            else if(n==1){
                return 1;
            
        }
        else{
            return +fibannaco(n-1)+fibannaco(n-2);
        }
        }
        public static void main(String[]args){
            int term=10;
            System.out.println("the fibannaco upto"+ term + "term:");
            for(int i=0;i<term;i++){
                System.out.print(fibannaco(i) + " ");
            }
        }
    }
