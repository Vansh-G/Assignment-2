import java.util.Arrays;
import java.util.Scanner;
class anagramcheck
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
            System.out.println("They do not form an anagram");
        }

        else
        {
            char[] st1=s1.toCharArray();
            char[] st2=s2.toCharArray();

            Arrays.sort(st1);
            Arrays.sort(st2);

            if(Arrays.equals(st1,st2))
            {
                System.out.println("They form an anagram");
            }

            else
            {
                System.out.println("They do not form an anagram");
            }
        }
    }
}
