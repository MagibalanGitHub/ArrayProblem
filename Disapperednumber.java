import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Disapperednumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int arr[]=new int[a];
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        List<Integer>res=new ArrayList<>();
        System.out.println(list);
        for(int i=1;i<=arr.length;i++){
            if(!list.contains(i)){
                res.add(i);
            }

        }
        System.out.println(list);
    }
}
