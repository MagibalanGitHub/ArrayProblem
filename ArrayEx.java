import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        int arr[]={1,2,3,4,5};
        int pos1=in.nextInt();
        int pos2=in.nextInt();
        if((pos1<0||pos1>=arr.length)||(pos2<0||pos2>=arr.length)){
            System.out.println("Invalid Index");
        }
        else{
           int temp=arr[pos1];
           arr[pos1]=arr[pos2];
           arr[pos2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
