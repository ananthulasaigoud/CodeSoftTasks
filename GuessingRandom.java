import java.util.Random;
import java.util.Scanner;
public class GuessingRandom{
    public static void main(String[] args){
        Random random = new Random();    
        Scanner Input_Scanner = new Scanner(System.in);
        boolean Guessing_State=true;
       
        while (Guessing_State) {  //This is the while condition to check the Guessing state
            int min=1,max=100;
            int randomnumber = random.nextInt(max-min+1)+min;
            int NumberOfAttempts = 3;
            boolean guessed_correctly=false;    //tracking the guess state of the user input
            
           for(int i = 0 ; i<NumberOfAttempts;i++){
                System.out.print("Enter the Guessing number : ");
                int UserInput = Input_Scanner.nextInt();
                if(UserInput==randomnumber){
                    System.out.println("Random input is :"+randomnumber);
                    System.out.println("You are correct......");
                    guessed_correctly=true;     //it marks as true when the user enters correct input
                    break;
                }else if(UserInput<randomnumber){
                    System.out.println("Random input is :"+randomnumber);
                    System.out.println("Too low....");
                }else if(UserInput>randomnumber){
                    System.out.println("Random input is :"+randomnumber);
                    System.out.print("Too High....");
                }else{
                    System.out.println("Please enter the correct input....");
                }
           }

           if(!guessed_correctly){      //it exicutes if the number of attempts are exceeds
            System.out.println("Ooops you are exceeds the number of attempts......");
           }
           
            //Asking the user to Continue the game or Exit the game
            System.out.println("Do you want to play again");
            System.out.println("1.YES\n2.NO");
            int Option = Input_Scanner.nextInt();
            if(Option==1){
                Guessing_State=true;
            }
            else{
                System.out.println("Thank you Try again next time");
                Guessing_State=false;
            }
           
            
        }
    }
}
