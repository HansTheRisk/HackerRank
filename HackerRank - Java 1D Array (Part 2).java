import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        
        Stack<Integer> stack = new Stack();
        stack.push(0);
        
        while(!stack.empty()) {
            int i = stack.pop();
            if(i > game.length || i == game.length)
                return true;
            
            if(i < 0 || game[i] == 1)
                continue;
        
            game[i] = 1;
            stack.push(i + 1);
            stack.push(i + leap);
            stack.push(i - 1);
            
        }
        
        return false;
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

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
