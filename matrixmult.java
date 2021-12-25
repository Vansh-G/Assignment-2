import java.util.Arrays;
import java.util.Scanner;
class matrixmult
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix 1");
        int m=scan.nextInt();
        System.out.println("Enter the number of cols for matrix 1");
        int n= scan.nextInt();

        int f1[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int c=i+1,d=j+1;
                System.out.println("Enter the elements of your matrix 1");
                System.out.println("["+c+","+d+"] - ");
                f1[i][j]= scan.nextInt();
            }
        }

        System.out.println("Enter the number of rows for matrix 2");
        int a=scan.nextInt();
        System.out.println("Enter the number of cols for matrix 2");
        int b= scan.nextInt();

        int f2[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                int c=i+1,d=j+1;
                System.out.println("Enter the elements of your matrix 2");
                System.out.println("["+c+","+d+"] - ");
                f2[i][j]= scan.nextInt();
            }
        }

        if(m!=b)
        {
            System.out.println("These matrices cannot be multiplied");
        }

        else
        {
            int mult[][] = new int[m][b];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < b; j++) {
                    for (int k = 0; k < a; k++) {
                        mult[i][j] = mult[i][j] + f1[i][k] * f2[k][j];
                    }
                }
            }
 //           System.out.println(Arrays.deepToString(mult));
            System.out.println("The final matrix is: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<b;j++)
                {
                    System.out.print(mult[i][j]+" ");
                }
                System.out.println();
            }
        }


    }
}
