import java.util.*;

public class Practical3
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %10 is 7.

    static void LastDigit(int Number1,int Number2)
    {
        if(Number1 % 10 == Number2 % 10)
        {
            System.out.println("True");
        }
        
        else
        {
            System.out.println("False");
        }
    }
    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int Number1,Number2;
        
        System.out.print("Enter First Number : ");
        Number1=sobj.nextInt();
        
        System.out.print("Enter Second Number : ");
        Number2=sobj.nextInt();
        
        LastDigit(Number1,Number2);
        sobj.close();
    
        System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }   
}
