import java.util.Scanner;
class strontio
{
    public static void main(String[] args)
    {
        int n,a,b,c;
        System.out.println("Enter a 4 digit number");
        Scanner scan=new Scanner(System.in);

        n=scan.nextInt();
        int l=String.valueOf(n).length();
        if(l!=4)
        {
            System.out.println("Incorrect entry");
        }

        else
        {
            a=n;
            n*=2;
            b=n;
            n%=1000;
            n/=10;
            int fd=n/10;
            int sd=n%10;
            System.out.println("The double of "+a+" is "+b+" Thus, ");

            if(fd==sd)
            {
                System.out.println("It is a strontio number");
            }

            else
            {
                System.out.println("It is not a strontio number");
            }
        }




    }
}
