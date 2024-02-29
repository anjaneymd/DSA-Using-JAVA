import static java.util.Collections.swap;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,6};

        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;

        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index){
                return index;
            }
            
        }return nums.length;
    }
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}