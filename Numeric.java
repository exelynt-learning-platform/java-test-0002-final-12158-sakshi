package assignment_java;

public class Numeric {


public static void main(String arg[]) {
	
	 int n = 5;

	 // for spaces
     for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= (n - i) * 2; j++) {
             System.out.print(" ");
         }

         // for ascending numbers
         for (int j = 1; j <= i; j++) {
             System.out.print(j + " ");
         }

         // for descending numbers
         for (int j = i - 1; j >= 1; j--) {
             System.out.print(j + " ");
         }

         System.out.println();
     }
}

}


