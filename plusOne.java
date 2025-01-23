import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int nums[] = new int[a];
        for (int i = 0; i < a; i++) {
            nums[i] = in.nextInt();
        }
        int min =nums[0];

        int res=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                res=nums[i]-min;
            }
            max=Math.max(max,res);
            min=Math.min(min,nums[i]);
        }
        System.out.println(max);

        // another method
        int profit=0;
        int min1=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min1){
                min1=nums[i];
            }
            else if(nums[i]-min1>profit){
                profit=nums[i]-min1;
            }
        }
        System.out.println(profit);
    }
}
