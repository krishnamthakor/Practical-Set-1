import java.util.*;

public class Practical4
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

    static void CheckSequence(int[] Array)
    {
        int Flag=0;
        
        for(int i=0; i<(Array.length-2); i++)
        {
            if(Array[i]==1 && Array[i+1]==2 && Array[i+2]==3)
            {
                Flag=1;
                break;
            }
            
            else
            {
                Flag=0;
            }
        }
        
        if(Flag==1)
        {
            System.out.println("true");
        }
        
        else
        {
            System.out.println("false");
        }
    }
    
   public static void main(String args[])
   {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter Size of an Array : ");
        int Size = sobj.nextInt();
        
        int Array[] = new int[Size];

        System.out.print("Enter Elements of an Array : ");
        
        for(int i=0; i<Size ;i++)
        {
            Array[i]=sobj.nextInt();
        }
        
        CheckSequence(Array);
        sobj.close();
        
        System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
   }
}
 
