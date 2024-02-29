public class FirstandLastPosition {
    public static void main(String[] args) {

    }
    public int[] SearchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = Search(nums,target,true);
        int end =Search(nums,target,false);
        ans[0] = start;
        ans [1] = end;
    }
    int[]search(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
    }
    int[] Search(int[] nums,int target,boolean findStartIndeax){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
               ans =  mid;
               if(findStartIndeax){
                   end = mid - 1;
               }
               else{
                  start = mid + 1;
               }
            }
        }
        return ans;

    }
}
