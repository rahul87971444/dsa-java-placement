import java.util.Arrays;
public class Optimized {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3};
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println("Length = " + (i+1));
        System.out.println(Arrays.toString(nums));

    }

}
