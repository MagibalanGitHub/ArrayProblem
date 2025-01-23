import java.util.Scanner;

public class Trapizium {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int count =0;
        int count1=0;
        for(int i=a;i>0;i--){
            for(int j=1;j<=a-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                count +=1;
                System.out.print(count+"*");
            }

            for(int j=1;j<=i;j++){
                System.out.print(++count1+i*i);
                if(i!=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
