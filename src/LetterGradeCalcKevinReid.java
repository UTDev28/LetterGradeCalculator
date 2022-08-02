
import java.util.Scanner;

public class LetterGradeCalcKevinReid
{

    public static void main(String[] args)
    {

     Scanner keyboard = new Scanner(System.in); 
       
        
        //The final grade is calculated on a straight scale: 90% and above is an “A”, less than 90% to 80% is a B, etc
        
       
        int score1,Score2,Score3,Score4; 
        
       
      //Collecting student info.
        System.out.println("please enter the students name" + studentsname + "Students ID")
        
        //Collect the scores
        System.out.println("Please enter the score for Quiz 1");
        input = keyboard.nextLine();
        score1 = IntegerparseInt(input); 
        
       
        if (score < 0 || score > 100)
        {
            System.out.println("Invalid score");
            return;
        }
        if (score >= 90.0)
        {
            System.out.print('A');
        }
        else if(score >= 80.0)
        {
            System.out.print('B');
        }
        else if(score >= 70.0)
        {
            System.out.print('C'); 
        }
        else if (score >= 60.0)
        { 
            System.out.print('D');
        }
        else
        {
            System.out.print('F'); 
        }
        
       System.out.print(" The students grade is"+ getGrade( 78.5));
       System.out.print("\nThe grade is" + getGrade(59.5));
    }

}
