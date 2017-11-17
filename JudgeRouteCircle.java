public class JudgeRouteCircle {

    class Solution {
        public boolean judgeCircle(String moves) {
            int x=0, y=0;
            char[] moveschar = moves.toCharArray();
            for (int i = 0; i < moveschar.length; i++) {
                if (moveschar[i] == 'U') y++;
                else if (moveschar[i] == 'D') y--;
                else if (moveschar[i] == 'R') x++;
                else if (moveschar[i] == 'L') x--;
            }
            if (x != 0 || y != 0) {
                return false;
            }
            return true;
        }
    }
}
