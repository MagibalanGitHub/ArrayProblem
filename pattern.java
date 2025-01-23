import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){

                if(j==0||j==a-1){
                    System.out.print("* ");
                }


                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
