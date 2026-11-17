public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        
        int numOdd = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(b);
            if (b % 2 == 1) { 
                numOdd = numOdd +1;
            }
            int next = a+b;
            a = b;
            b = next;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
                
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
