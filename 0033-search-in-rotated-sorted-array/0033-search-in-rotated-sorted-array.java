class Solution {
   
    public   int search(int[] nums, int target) {

        // [0,1,2,4,5,6,7]
        // [4,5,6,7,0,1,2]

        int l = 0 , r  =nums.length -1 ;

        if(r==0 && nums[0]==target)
            return 0 ;

        while(l<=r) {

            int mid  = (l+r) /2 ;
        //    System.out.println(" l ="+ l+" r = " + r + "  mid = " + mid + " , "+nums[mid]);
            if(nums[mid]==target)
                return mid;


            if(nums[l] <= nums[mid]) {

                if(target> nums[mid] || target < nums[l]) {
                    l = mid+1;
                }
                else r = mid -1;
            }
            else {
                if(target < nums[mid] || target > nums[r])
                    r= mid-1;
                else
                    l = mid +1;
            }
        }

        return -1;
    }
}