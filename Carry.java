import java.util.Scanner;

public class Carry {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        int count =0;
        int val=0;
        if(a>b){
        while(a>0)
        {
            int res1=a%10 +val;
            int res2=b%10;
            int sum=res1+res2;
            val=0;
            if(sum>9)
            {
                count ++;
                val+=1;
            }
            a/=10;
            b/=10;
        }
        }
        else if(a<b){

            while(b>0) {

                int res1=a%10 +val;
                int res2=b%10;
                int sum=res1+res2;
                val=0;
                if(sum>9){
                    count ++;
                    val+=1;
                }
                a/=10;
                b/=10;
            }
        }
        System.out.println(count);

    }
}
