import java.util.Arrays;
import java.util.Scanner;
class arrayrightshift
{
    public static void main(String[] args)
    {
        System.out.println("Enter the length of your array");
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();

        int[] a=new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.println("Enter a number");
            a[i]=scan.nextInt();
        }

        System.out.println("Your array is:");
        System.out.println(Arrays.toString(a));
        System.out.println("By how many cells do you want to shift it?");
        int n=scan.nextInt();
//      System.out.println(a[]);

        for(int j=0;j<n;j++)
        {
            int last=a[l-1];
            for(int i=l-1;i>0;i--)
            {
                a[i]=a[i-1];
            }
            a[0]=last;
        }



        System.out.println(Arrays.toString(a));
    }
}
