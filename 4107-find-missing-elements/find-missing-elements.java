// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         Set<Integer> set=new HashSet<>();
//         List<Integer> lst=new ArrayList<>();
//         Arrays.sort(nums);
//         int n=nums.length;
//         int lo=nums[0];
//         int hi=nums[n-1];
        
//         for(int ele : nums){
//             set.add(ele);
//         }
//         for(int i=lo;i<=hi;i++){
//             if(!set.contains(i)) lst.add(i);
//         }
//         return lst;
        
//     }
// }
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for(int i = min + 1; i < max; i++) {
            if(!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}