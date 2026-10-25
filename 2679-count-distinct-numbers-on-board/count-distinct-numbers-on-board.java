// class Solution {
//     public int distinctIntegers(int n) {
//         if(n==1) return 1;
//         return n-1;
//     }
// }
class Solution {
    public int distinctIntegers(int n) {
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        set.add(n);
        q.offer(n);

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i = 1; i <= x; i++) {
                if (x % i == 1 && !set.contains(i)) {
                    set.add(i);
                    q.offer(i);
                }
            }
        }

        return set.size();
    }
}