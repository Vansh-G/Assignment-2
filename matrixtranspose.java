import java.util.Arrays;
import java.util.Scanner;
class matrixtranspose
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows and cols");
        int m= scan.nextInt();
        int n= scan.nextInt();

        int f[][]=new int[m][n];

        System.out.println("Start entering the elements of your matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int c=i+1,d=j+1;
                System.out.println("["+c+","+d+"] -");
                f[i][j]= scan.nextInt();
            }
        }

        System.out.println("The input matrix was: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }
        //System.out

        int tf[][]=new int[n][m];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                tf[i][j]=f[j][i];
            }
        }

        System.out.println("The final matrix is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(tf[i][j]+" ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(tf));
    }
}
