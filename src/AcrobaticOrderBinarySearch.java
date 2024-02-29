public class AcrobaticOrderBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,1,2,3,4,5,6,7,8,9};
        int target = 9;
        int ans = AcrobaticSearch(nums,target);
        System.out.println(ans);

    }

    private static int AcrobaticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAce = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target) {
                return mid; // return index when target is found
            }
            if(isAce) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else
                if(target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }return -1;
    }
}
