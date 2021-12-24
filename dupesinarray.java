import java.util.Scanner;
class dupesinarray
{
    public static void main(String[] args)
    {
        System.out.println("Enter the length of your array");
        Scanner scan=new Scanner(System.in);
        int l;
        l = scan.nextInt();
        int [] a=new int[l];

        for(int i=0;i<l;i++)
        {
                System.out.println("Enter a number");
                a[i]=scan.nextInt();

        }

        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
