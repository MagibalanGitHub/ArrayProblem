import java.util.HashSet;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();


        int arr[]=new int[m];

        for(int i=0;i<m;i++){
            arr[i]=in.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();

        for(int i:arr){
            if(!set.contains(i)){
                set.add(i);
            }
            else{
                set.remove(i);
            }
        }
        for(int str:set){
            System.out.print(str+" ");
        }
    }
}
