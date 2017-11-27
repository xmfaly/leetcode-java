import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> re = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                int temp = i;
                while ((temp != 0) && (temp % 10 != 0)) {
                    if (i % (temp % 10) != 0) {
                        break;
                    }
                    temp = temp / 10;
                }
                if (temp == 0) {
                    re.add(i);
                }
            }
            return re;
        }
    }
}
