import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    
     Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);

    }
    void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        

    }
    boolean isCorrectNumber(){
        noOfGuesses++;

    if (inputNumber==number){
        System.out.format("Yes you guessed it right,it was %d\n You guessed it in %d attempts",number,noOfGuesses);
        return true;
    }
    else if(inputNumber<number){
        System.out.println("too less..");
    }
    else if(inputNumber>number){
        System.out.println("too high..");
    }
    return false;
}
}
public class guss_the_no_game {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b=false;
        while(!b){

        g.takeUserInput();
        b=g.isCorrectNumber();
        System.out.println(b);

    }
}
    
}    

