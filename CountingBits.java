public class CountingBits {

    public class Solution {
        public int[] countBits(int num) {
            int[] res = new int[num + 1];
            res[0] = 0;

            int base = 1;
            while(base <= num){
                int next = base * 2;
                for(int i = base;i<next && i<=num;i++){
                    res[i] = res[i-base]+1;
                }
                base = next;
            }
            return res;
        }
    }
}
