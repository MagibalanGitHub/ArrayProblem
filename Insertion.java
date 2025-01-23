import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        //int b=in.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);

        ArrayList<Integer>list=new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<a;i++){
            if(arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        if(list.size()<=3){
            System.out.println(list.get(0));
        }
        else{
            System.out.println(list.get(list.size()-3));
        }


    }
}
