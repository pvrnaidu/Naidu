import java.util.Scanner;

public class SCClass {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a string : ");
    	String s = sc.nextLine();
    	System.out.println(s);
    	sc.close();
    }
}
