import java.util.*;

public class Q3 {
    public int climStairs(int n){
        if(n<=1){
            return 1;
        }
        int []dp = new int [n+1];
        dp[0]=1;
        dp[1]=1;

        for (int i =2;i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q3 solution = new Q3();

        System.out.print("Enter the number step stairs : ");
        int n = scanner.nextInt();

        int distinctWay = solution.climStairs(n);
        System.out.println("Distinct ways to climb " + n + " steps: " + distinctWay);
    }
}
