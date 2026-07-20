import java.util.Arrays;
public class BruteForce {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int temp[] = new int[nums.length];
        int index = 0;
        for(int num : nums){
            if(num != 0){
                temp[index++] = num;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

}
