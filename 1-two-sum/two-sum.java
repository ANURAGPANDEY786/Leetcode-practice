// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int a[]={};
//         for (int i = 0; i < nums.length; i++) {
//        for (int j = i+1; j < nums.length; j++) {
//         if (nums[i] + nums[j] == target) {
//              a=new int[]{i, j};
//         }
//     }

//     }
//     return a;
// }
// }
class Solution {
    public int[] twoSum(int[] nums, int target){
HashMap<Integer,Integer> map = new HashMap<>();
int a[]={};

for(int i=0;i<nums.length;i++){

    int targetNeed = target - nums[i];

    if(map.containsKey(targetNeed)){
        a= new int[]{map.get(targetNeed),i};
    }

    map.put(nums[i],i);
}
return a;
    }
}