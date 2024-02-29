public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3,4,3,5,7,8,8};
        int target = 6;
        int ans = ceiling( nums, target);
        System.out.println(ans);
    }
//    ceiling number smallest number grater than or equal(>=)target number
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid])
            {
                end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }return start;

    }
}
