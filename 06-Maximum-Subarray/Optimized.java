public class Optimized {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int currentSum = 0;
        int maxSum = arr[0];
        for(int num : arr){
            currentSum += num;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println(maxSum);

    }

}
