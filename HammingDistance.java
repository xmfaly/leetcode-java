public class HammingDistance {

    class Solution {
        public int hammingDistance(int x, int y) {
            int ant = 0;
            for (int i = 0; i < 31; i++) {
                int jduge = (x & (1 << i)) ^ (y & (1 << i));
                if (jduge != 0) {
                    ant ++;
                }
            }
            return ant;
        }
    }
}
