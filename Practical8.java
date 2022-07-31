import java.util.*;

public class Practical8
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - The problem is to write a program that will grade multiple-choice tests. Assume there are eight students and ten questions, and the answers are stored in a two-dimensional array. Each row records a student’s answers to the questions, as shown in the following array.Your program grades the test and displays the result. It compares each student’s answers with the key, counts the number of correct answers, and displays it.

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        String  Array[][]=new String[8][10];
        
        String Key[] = {"D","B","D","C","C","D","A","E","A","D"};
        
        for (int i = 0; i < 8; i++) 
        {
            int Count=0;
            System.out.print("Student " + (i) + " : ");
            
            for (int j = 0; j < 10; j++) 
            {
                Array[i][j]= sobj.next();
            
                if(Array[i][j].equals(Key[j]))
                {
                    Count++;
                }
            }
            
            System.out.println("Count : "+ Count);
        }
        sobj.close();
    
        System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }
}
