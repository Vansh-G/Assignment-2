import java.util.Scanner;
class stringrotation
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=scan.next();
        System.out.println("Enter string 2");
        String s2=scan.next();

        if(s1.length()!=s2.length())
        {
            System.out.println("2nd string is not a rotation of first");
        }

        else
        {
            s1=s1.concat(s1);

            if(s1.indexOf(s2)!=-1)
                System.out.println("2nd string is a rotation of string 1");
            else
                System.out.println("2nd string is not a rotation of string ");
        }
    }
}
