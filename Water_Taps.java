import java.util.Scanner;
public class Basic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=(a*b)/(a+b);
        System.out.println(c);
    }
}