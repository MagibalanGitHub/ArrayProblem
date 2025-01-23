import java.util.Scanner;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
         int map1[]=new int[256];
         int map2[]=new int[256];

         if(a.length()!=b.length()){
             System.out.println(" Not a Isomorphic");

         }

         for(int i=0;i<a.length();i++){
             char c1=a.charAt(i);
             char c2=b.charAt(i);

             if(map1[c1]==0 && map2[c2]==0){
                 map1[c1]=c2;
                 map2[c2]=c1;
             }
             else if(map1[c1]!=c2 ||map2[c2]!=c1){
                 System.out.println(" Not a isomorphic");
                 break;
             }
         }
         System.out.println("Isomorphic");
    }
}
