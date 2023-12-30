import java.util.Scanner;
public class gradecalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n: : : WELCOME : : :\n");
        System.out.println("CALCULATE THE STUDENT GRADE:\n");
        System.out.print(":ENTER STUDENT NAME:- ");
        String name = sc.nextLine();
        System.out.print("\n:ENTER THE NUMBER OF SUBJECTS:- ");
        int sub = sc.nextInt();
        boolean playAgain=true;
        int total=0;
        int marks;
        while(playAgain){
            for(int i=1;i<=sub;i++){
                System.out.println();
                System.out.print(+i+":SUBJECT MARKS- ");
                marks=sc.nextInt();
                total=total+marks;
            }
            float perc = total/sub;
            System.out.println("\nYOUR PERCENTAGE OF YOUR SUBJECTS MARKS:- "+perc+"\n");
            if(perc<=70){
                System.out.println("YOU PASS IN YOUR EXAM AT FIRST DEVISION 'A' GRADE\n");
            }
            else if(perc<=50 || perc>=70){
                System.out.println("YOU PASS IN YOUR EXAM AT SECOND DEVISION 'B' GRADE\n");
            }
            else{
                System.out.println("YOU PASS IN YOUR EXAM AT THIRD DEVISION 'C' GRADE\n");
            }
            System.out.print("DO YOU WANT TO CALCULATE AGAIN THE MARKS-(yes/no)->>");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("yes");
        }
    }
}
