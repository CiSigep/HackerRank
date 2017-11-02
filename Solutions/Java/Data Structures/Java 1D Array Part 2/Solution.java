import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game, int place) {
        if (place < 0 || game[place] == 1) {
            return false;
        } else if (place + 1 >= game.length || place + leap >= game.length) {
            return true;
        }
        
        game[place] = 1;
        return canWin(leap, game, place + leap) || 
               canWin(leap, game, place + 1) || 
               canWin(leap, game, place - 1);
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}
