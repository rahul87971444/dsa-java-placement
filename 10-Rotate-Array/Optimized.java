import java.util.Arrays;

public class Optimized {

    static void reverse(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.out.println(Arrays.toString(nums));
    }

}
