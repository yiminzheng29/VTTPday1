package myapp.core;

import java.io.Console;

public class Operator {

    // write entry point
    public static void main(String[] args) {
        // Get the console
        Console cons = System.console();

        // Read the inputs from the users

        // opnd0
        String Operand1 = cons.readLine("Operand1 (number): ").trim();

        // opnd1
        String Operand2 = cons.readLine("Operand2 (number): ").trim();

        // Convert String to Integer/float
        int sum = Integer.parseInt(Operand1)+Integer.parseInt(Operand2);
        double divi = Float.parseFloat(Operand1)/Float.parseFloat(Operand2); // another way of conversion: result = (float)Operand1 /Operand2)
        int subt = Integer.parseInt(Operand1)-Integer.parseInt(Operand2);
        int mult = Integer.parseInt(Operand1)*Integer.parseInt(Operand2);

        // oper
        String Operator = cons.readLine("Operator (add, div, sub, mul): ").trim();

        if (Operator.equals("add")) {
            System.out.printf("The answer for %s + %s = ", Operand1, Operand2);
            System.out.print(sum);
        };

        if (Operator.equals("div")) {
            System.out.printf("The answer for %s / %s = ", Operand1, Operand2);
            System.out.printf("%.3f",divi);
        };

        if (Operator.equals("sub")) {
            System.out.printf("The answer for %s - %s = ", Operand1, Operand2);
            System.out.print(subt);
        };

        if (Operator.equals("mul")) {
            System.out.printf("The answer for %s * %s = ", Operand1, Operand2);
            System.out.print(mult);
        }

    
};
}
