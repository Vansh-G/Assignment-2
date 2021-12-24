import java.util.Scanner;
class pallindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter the word/number to check");
        Scanner scan=new Scanner(System.in);
        String s= scan.next();
        int i;

        String rev = "";
        for(i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            rev=x+rev;
        }

        if(rev.equalsIgnoreCase(s))
        {
            System.out.println("It is a pallindrome");
        }

        else
        {
            System.out.println("It is not a pallindrome");
        }
    }
}
