import java.util.*;

public class Practical6
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

    public static void  Separator(String[] Str1,String Str2)
    {
        int Count=0;
        
        for (int i = 0; i <Str1.length; i++) 
        {
            if(Str1[i].equals(Str2))
            {
                Count++;
            }
        }
        
        int Length = Str1.length - Count;
        
        System.out.print("New Array : ");
        
        for(int i=0;i<Str1.length; i++)
        {
                if(Str1[i].compareTo(Str2) != 0)
                {
                   System.out.print(Str1[i] + " ");
                }
        }
    }
    
    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
    
        System.out.print("Enter length of an Array : ");
        int Size = sobj.nextInt();
        
        System.out.print("Enter Elements of an Array : ");
        
        String Str1[]=new String[Size];
        
        for(int i=0; i<Size; i++)
        {
            Str1[i] = sobj.next();
        }
    
        System.out.print("Enter String : ");
        String Str2 = sobj.next();
        
        Separator(Str1,Str2);
        sobj.close();
        
        System.out.println("\n");
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }
}
