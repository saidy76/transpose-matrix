
package transpose_matrix;
import java.util.Scanner;

public class Transpose_matrix {
   static void  transpose(int[][] m){
        int [][] matrix=m;
        int r=matrix.length;
        int c=matrix[0].length;
        
        int [][]trans=new int[c][r];
        
         for (int i=0;i<c;i++)
        {
            for (int j=0;j<=r-1;j++)
            {
                trans[i][j]=matrix[j][i];
            }
        }
          
        System.out.println("Transpose  matrix :");  
        for (int i=0;i<c;i++)
        {
            for (int j=0;j<=r-1;j++)
            {
                System.out.print(trans[i][j] +"  ");
            }
            System.out.println("");
        }
        
        
        
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
       
        System.out.println("Enter row :");
        int row= sc.nextInt();
      
        System.out.println("Enter column :");
        int column= sc.nextInt();
       
        int[][] matrix = new int [row][column];
        
        System.out.println("Enter values :");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<=column-1;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        
        
        System.out.println("original matrix :");  
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<=column-1;j++)
            {
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println("");
        }

        
 transpose(matrix);


    }
}
