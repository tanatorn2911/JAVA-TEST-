import java.util.*;

public class Q1{

    public int[] calProfit(int[] prices){
        int maxProfit =0 ;
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        boolean foundMinPrice = false;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
                maxPrice = Integer.MIN_VALUE;
                foundMinPrice = true;
            } else if(foundMinPrice && price > maxPrice){
                maxPrice = price;
                maxProfit = Math.max(maxProfit, maxPrice - minPrice);
            }
        }
        return new int[]{minPrice, maxPrice, maxProfit};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day:");
        int numDays = scanner.nextInt();

        int[] price = new  int[numDays];
        System.out.print("Enter price : ");
        for (int i=0 ; i < numDays ; i++){
            price[i]=scanner.nextInt();
        }
      Q1 solution = new Q1();
      int[] result = solution.calProfit(price);
      int minPrice = result[0];
      int maxPrice = result[1];
      int maxProfit = result[2];

      System.out.println("Minimum price: " + minPrice);
      System.out.println("Maximum price: " + maxPrice);
      System.out.println("Maximum profit: " + maxProfit);
    }
}