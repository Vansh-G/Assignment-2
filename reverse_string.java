import java.util.Scanner;
class reverse_string
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your string");
        String s=scan.nextLine();

        String rev="";
        for(int i=s.length();i>0;i--)
        {
            rev=rev+(s.charAt(i-1));
        }

        System.out.println(rev);
    }
}
