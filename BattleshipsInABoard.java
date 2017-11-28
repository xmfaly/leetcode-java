import java.util.BitSet;

public class BattleshipsInABoard {

    class Solution {
        public int countBattleships(char[][] board) {
            int ans = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == '.' || (i > 0 && board[i - 1][j] == 'X') || (j > 0 && board[i][j - 1] == 'X')) {
                        continue;
                    } else {
                        ans++;
                    }
                }
            }
            return ans;
        }
    }


//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        char[][] board = {{'X', 'X', 'X'}};
//        System.out.println(solution.countBattleships(board));
//    }

    public static void main(String[] args) {

    }
}
