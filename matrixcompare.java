import java.util.Scanner;
class matrixcompare
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        boolean fl=true;
        //Input and store Matrix 1

        System.out.println("Enter the number of rows of both the matrices");
        int m=scan.nextInt();
        System.out.println("Enter the number of rows of both the matrices");
        int n= scan.nextInt();

        int f1[][] = new int[m][n];
        System.out.println("Enter the elements of matrix 1");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                f1[i][j]=scan.nextInt();
            }
        }

        //Input and store matrix 2
        int f2[][] = new int[m][n];
        System.out.println("Enter the elements of matrix 2");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                f2[i][j]=scan.nextInt();
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(f1[i][j]!=f2[i][j])
                {
                    fl=false;
                    break;
                }
            }
        }

        if(fl)
        {
            System.out.println("Both the matrices are equal");
        }

        else
        {
            System.out.println("Both the matrices aren't equal");
        }

    }
}
