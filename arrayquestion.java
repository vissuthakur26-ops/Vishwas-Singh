public class arrayquestion {
    public static void main(String[]args) {
        //sum of floating number..........................
      // float [] marks = {100.4f, 136.5f, 134.3f ,102.4f, 134.5f};
      // float sum=0;
      //  for(float element:marks){
      //      sum=sum+element;

      //  }
      //  System.out.println("the sum of float num is "+sum);
        

   // }
    
//}
    //Average of the number in array........................
    //   float [] marks = {100.4f, 136.5f, 134.3f ,102.4f, 134.5f};
    //   float sum=0;
    //    for(float element:marks){
    //      sum=sum+element;

    //    }
    //   System.out.println("the sum of float num is "+sum/marks.length);
        

 //   }
    
//}



    //Add two matrices of size 2x3.................................
//    int [] [] mat1 = {{1,2,3},
  //                    {4,5,6}};
//
 //   int [] [] mat2 = {{2,6,13},
  //                    {3,7,1}};
  //  int [] [] result = {{0,0,0},
    //                    {0,0,0}};


      //                  for(int i=0;i<mat1.length;i++){
        //                    for(int j=0;j<mat1[i].length;j++){
          //                      System.out.format("Setting valur for i=%d and j=%d\n",i,j);
          //                      result[i][j]=mat1[i][j] + mat2[i][j];
          //                  }
           //             }

             //           for(int i=0;i<mat1.length;i++){
               //             for(int j=0;j<mat1[i].length;j++){
               //                 System.out.print(result[i][j]+" ");
                //                result[i][j]=mat1[i][j] + mat2[i][j];
                 //           }
                 //           System.out.println("");

                 //       }
               //     }
            //    }

//REVERSE A ARRAY...............................................
//int [] arr ={12,23,45,34,37};
//int l=arr.length;
//int n= Math.floorDiv(l,2);
//int temp;
//for (int i=0;i<n;i++){
     // swapping............
    // temp=arr[i];
    // arr[i]=arr[l-i-1];
    // arr[l-i-1]=temp;

//}
//for (int element:arr){
  //  System.out.print(element+"  ");

//}
  //  }
//}

//TO PRINT MAXIMUM NUMBER IN ARRAY.................

//int [] arr ={12,23,45,34,37};
//int max=0;
//for(int element:arr){
//    if(element>max){
//        max = element;

//    }
//}
//System.out.println("the value is maximum is: "+ max);
 //   }
//
//}
//TO PRINT THE MINIMUM VALUE IN THA ARRAY........................

//int [] arr ={12,23,45,34,37};
//int max=Integer.MIN_VALUE;
//for(int element:arr){
  //  if(element<max){
  //      max=element;
  //  }
//}
//System.out.println(Integer.MIN_VALUE);
  //  }
//}


//PROGRAM TO PRINT ARRAY IS SORTE OR NOT..........

boolean isSorted=true;
int [] arr ={1,2,3,5,67,98};
for(int i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
     isSorted=false;
     break;
    }
    }
    if(isSorted){

    System.out.println("the array is sorted");
    }
    else{
        System.out.println("the array is not sorted ");
    }

    }
    }