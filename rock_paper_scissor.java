import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //0 for rock
        //1 for paper
        //2 for scissor

        System.out.println("Enter 0 for Rock,1 for Paper,2 for Scissor");
        int userInput = sc.nextInt();

        Random random=new Random();
        int computerInput = sc.nextInt();

        if (userInput==computerInput){
            System.out.println("Draw");

        }
        else if (userInput==0 && computerInput==2 &&  userInput==1 && computerInput==0 || userInput==2 && computerInput == 1 ){
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        System.out.println("Computer Chioce :"+ computerInput);
    }
    }
    

