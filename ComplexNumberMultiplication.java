public class ComplexNumberMultiplication {

    class Solution {
        public String complexNumberMultiply(String a, String b) {
            String a1 = a.split("\\+")[0];
            String a2 = a.split("\\+")[1].split("i")[0];

            String b1 = b.split("\\+")[0];
            String b2 = b.split("\\+")[1].split("i")[0];

            int aa = Integer.valueOf(a1) * Integer.valueOf(b1) - Integer.valueOf(a2) * Integer.valueOf(b2);
            int bb = Integer.valueOf(a1) * Integer.valueOf(b2) + Integer.valueOf(a2) * Integer.valueOf(b1);

            return String.valueOf(aa) + "+" + String.valueOf(bb) + "i";

        }
    }

}
