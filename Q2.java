import java.util.*;
public class Q2 {
    public int compareVersions(String version1, String version2){
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int i=0;
        while(i<v1.length || i<v2.length){
            int num1 = (i<v1.length)? Integer.parseInt(v1[i]):0;
            int num2 = (i<v2.length)? Integer.parseInt(v2[i]):0;

            if(num1<num2) return -1;
            else if(num1>num2) return 1;
            
            i++;
        }
        return 0;
    }
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Q2 solution = new Q2();

    System.err.print("Enter version1: ");
    String version1= scanner.nextLine();

    System.out.print("Enter version2: ");
    String version2= scanner.nextLine();

    int result = solution.compareVersions(version1, version2);
    System.out.println("Compare result: " + result);
 }   
}
