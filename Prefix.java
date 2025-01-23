import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String arr[]=new String[a];
        in.nextLine();
        for(int i=0;i<a;i++){
            arr[i]=in.nextLine();
        }
        String prefix=arr[0];
        for(int i=0;i<a;i++){
            while(!arr[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println("");
                    break;
                }
            }
        }
        System.out.println("The prefix String is "+prefix);
    }
}
