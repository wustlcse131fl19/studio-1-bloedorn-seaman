package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap1 = new ArgsProcessor(args);
        ArgsProcessor ap2 = new ArgsProcessor(args);
        double n1 = ap1.nextDouble("Enter first number");
        double n2 = ap2.nextDouble("Enter second number");

        double avg = (n1+n2)/2;

        System.out.println("The average of your two numbers is " + avg);

    }
}
