import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3};
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        System.out.println(set.size());
    }

}
