import java.util.Scanner;
class peterson_num
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int p=scan.nextInt();
        int n=p;
        int l=String.valueOf(p).length();
        int sum=0,fact=1;
        //System.out.println(l);
        for(int i=0;i<l;i++)
        {
            int temp;
            temp=n%10;
            n=n/10;
            for(int j=1;j<=temp;j++)
            {
                fact=fact*j;
            }
            sum=sum+fact;
            fact=1;
        }

        if(sum==p)
        {
            System.out.println("It is a peterson number");
        }

        else
        {
            System.out.println("It is not a peterson number");
        }
    }
}
