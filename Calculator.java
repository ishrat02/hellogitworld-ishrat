public class Calculator {
    char operator;
    double num1,num2;
    public Calculator(){}
    public Calculator(char operator,double num1,double num2){
        this.operator=operator;
        this.num1=num1;
        this.num2=num2;
    }
    public double operation(char op,double num1,double num2){
        // edit from main 
        // does not return anything
        if(op=='+') return num1+num2;
        else if(op=='-') return num1-num2;
        else if(op=='*') return num1*num2;
        else
        {
            if(num2==0)
            {
                System.out.println("Division by zero is not possible");
                return 0;
            }
            else return num1/num2;
        }
        // return result;
    }

    public static void main(String[] args){
        Calculator calculator=new Calculator();
        System.out.println(calculator.operation('+',5,3));
        System.out.println(calculator.operation('-',5,3));  
        System.out.println(calculator.operation('*',5,3));
        System.out.println(calculator.operation('/',5,0));
    }
}
