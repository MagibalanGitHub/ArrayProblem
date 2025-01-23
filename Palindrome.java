import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        String res = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev="";
        for(int i=res.length()-1;i>=0;i--){
            char ch=res.charAt(i);
            rev+= ch;
        }
        System.out.println(res);
        System.out.println(rev);
        System.out.println(res.equals(rev));
    }
}
