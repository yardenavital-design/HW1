public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        
        int num_of_summands = Integer.parseInt(args[0]);
        double temp = 1.0;
        for (int i = 0; i < num_of_summands - 1 ; i++) {
            temp = temp + Math.pow(-1, i+1) * (1.0 / (2 *(i+1)+1));
        }
        approxPi = 4 * temp;

        
        System.out.println(approxPi + " " + actualPi);
    }
}
