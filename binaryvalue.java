import java.util.Scanner;

public class binaryvalue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String t=in.nextLine();
        int a=Integer.parseInt(s,2);
        int b=Integer.parseInt(t,2);
        System.out.println(a);
        System.out.println(b);
        int sum=a+b;
        String res="";
        while(sum>0){
            int rev=sum%2;
            res=rev+res;
            sum/=2;
        }
        System.out.println(res);
    }
}
