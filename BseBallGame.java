import java.util.ArrayList;
import java.util.Scanner;

public class BseBallGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String []str=new String[a];
        for(int i=0;i<a;i++){
            str[i]=in.next();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<str.length;i++){

            if(str[i].equals("C")){
                list.remove(i-1);
            }
            else if(str[i].equals("D") ){
                int res=2*(list.get(list.size()-1));
                list.add(res);
            }
            else if(str[i].equals("+")) {
                int res=list.get(list.size()-1)+list.get(list.size()-2);
                list.add(res);
            }
            else {
                list.add(Integer.parseInt(str[i]));
            }

        }
        System.out.println(list);
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        System.out.println(sum);
    }
}
