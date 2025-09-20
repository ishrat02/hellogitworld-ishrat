public class Calculator {

    public Calculator() {}

    // Optional constructor if you want to store numbers and operator
    public Calculator(char operator, double num1, double num2) {
        // Not used in this example
    }

    public double operation(char op, double num1, double num2) {
        switch(op) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/':
                if(num2 == 0) {
                    System.out.println("Division by zero is not possible");
                    return 0; // could also throw an exception
                }
                return num1 / num2;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.operation('+', 5, 3));  // 8.0
        System.out.println(calculator.operation('-', 5, 3));  // 2.0
        System.out.println(calculator.operation('*', 5, 3));  // 15.0
        System.out.println(calculator.operation('/', 5, 0));  // Division by zero is not possible, prints 0.0
        System.out.println(calculator.operation('/', 5, 2));  // 2.5
    }
}
