import java.util.Scanner;
class arrayasc
{
    public static void main(String[] args)
    {
        System.out.println("Enter the length of your array");
        Scanner scan=new Scanner(System.in);
        int l= scan.nextInt();
        int[] ar=new int[l];

        for(int i=0;i<l;i++)
        {
            System.out.println("Enter a number");
            ar[i]=scan.nextInt();
        }

/*        for(int i=0;i<l;i++)
        {
            System.out.println(ar[i]);
        }*/

        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println();

        System.out.println("Final array is: ");
        for(int i=0;i<l;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
