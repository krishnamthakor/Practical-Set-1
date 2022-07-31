import java.util.*;

public class Practical5
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

    static int StringMatch(String Str1, String Str2) 
    {
        int Length = Math.min(Str1.length(), Str2.length());
        int Count = 0;
    
        for(int i = 0; i < (Length-1); i++)
        {
            String S1 = Str1.substring(i, i+2);
            String S2 = Str2.substring(i, i+2);
            
            if(S1.equals(S2))
            {
                Count++;
            } 
        }
    
    return Count;
    }
     
        
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        String Str1 = new String();
        String Str2 = new String();

        System.out.print("Enter First String : ");
        Str1 = sobj.next();
        System.out.print("Enter Second String : ");
        Str2 = sobj.next();
    
        int Result = StringMatch(Str1,Str2);
        System.out.println(Result);
    
        sobj.close();
        System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }
}
