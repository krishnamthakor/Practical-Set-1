import java.util.*;

public class Practical2
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"yields "oz".

    static void StartOZ(String Sname)
    {
        if(Sname.charAt(0)=='o')
        {
            System.out.print("o");
        }
        
        if(Sname.charAt(1)=='z')
        {
            System.out.print("z");
        }
        
        else
        {
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        String Sname;
        
        System.out.print("Enter String : ");
        Sname = sobj.next();
        StartOZ(Sname);
    
        sobj.close();
        
        System.out.println("\n");
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }   
}
