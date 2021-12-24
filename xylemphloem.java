import java.util.Scanner;
class xylemphloem
{
    public static void main(String[] args)
    {
        int n,a,b,sum=0;
        System.out.println("enter your number");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int l=String.valueOf(n).length();

        int lastdig=n%10;
        n/=10;
//        System.out.println(lastdig);

        for(int i=0;i<l-2;i++)
        {
            b=n%10;
            sum+=b;
            n/=10;
        }
        int fdig=n;
//        System.out.println(fdig);
//        System.out.println("sum="+sum);

        int exsum=fdig+lastdig;
//        System.out.println("exsum="+exsum);
        if(sum==exsum)
        {
            System.out.println("It is a Xylem Number");
        }

        else
        {
            System.out.println("It is a Phloem number");
        }
    }
}
