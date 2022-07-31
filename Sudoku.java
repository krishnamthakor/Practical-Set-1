public class Sudoku
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - The problem is to check whether a given Sudoku solution is correct.

    static int n = 9;
    
    static boolean SolveSudoku(int Matrix[][], int Row, int Column)
    {
        if(Row == n-1 && Column == n)
        {
            return true;
        }
        
        if(Column == n)
        {
            Row++;
            Column=0;
        }
        
        if(Matrix[Row][Column] != 0)
        {
            return SolveSudoku(Matrix, Row, Column+1);
        }
        
        for(int i = 1; i < 10 ; i++)
        {
            if(IsSafe(Matrix,Row,Column,i))
            {
                Matrix[Row][Column] = i;
                
                if(SolveSudoku(Matrix,Row,Column+1))
                {
                    return true;
                }
            }
            
            Matrix[Row][Column] = 0;
        }
        
        return false;
    }
    
    
    static void ShowMatrix(int[][] Matrix)
    {
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    static boolean IsSafe(int[][] Matrix, int Row, int Column, int Number)
    {
        for(int i=0; i<=8; i++)
        {
            if(Matrix[Row][i] == Number)
            {
                return false;
            }
        }
        
        for(int i=0; i<=8; i++)
        {
            if(Matrix[i][Column] == Number)
            {
                return false;
            }
        }
        
        int StartRow = Row - Row%3;
        int StartColumn = Column - Column%3;
        
        for(int i=0; i<3; i++)
        {
            for(int j=0;j<3; j++)
            {
                if(Matrix[i + StartRow][j + StartColumn] == Number)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static void main(String args[])
    {
        int Matrix[][] = {{5, 3, 0, 0, 7, 0, 0, 0, 0},
                          {6, 0, 0, 1, 9, 5, 0, 0, 0},
                          {0, 9, 8, 0, 0, 0, 0, 6, 0},
                          {8, 0 ,0, 0, 6, 0, 0, 0, 3},
                          {4, 0, 0, 8, 0, 3, 0, 0, 1},
                          {7, 0, 0, 0, 2, 0, 0, 0, 6},
                          {0, 6, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 4, 1, 9, 0, 0, 5},
                          {0, 0, 0, 0, 8, 0, 0, 7, 9}};
        
        System.out.println("Solved Sudoku:");
        System.out.println();
        
        if(SolveSudoku(Matrix,0,0))
        {
            ShowMatrix(Matrix);
        }
        
        else
        {
            System.out.println("No Solution Exists!");
        }
        
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }
}

