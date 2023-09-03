class Calculator {

    public static int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public static int substract(int n1, int n2)
    {
        return n1 > n2 ? n1-n2 : n2 - n1;
    }

    public static int multiply(int n1, int n2)
    {
        return n1 * n2;
    }

    public static int divide(int n1, int n2)
    {
        return n1 > n2 ? n1/n2 : n2/n1;
    }

}

class Calc
{

    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 10;
        Calculator addition = new Calculator();
        Calculator substraction = new Calculator();
        Calculator multiplication = new Calculator();
        Calculator division = new Calculator();

        int result = addition.add(num1, num2);
        int result2 = multiplication.multiply(num1, num2);
        int result3 = substraction.substract(num1, num2);
        int result4 = division.divide(num1, num2);

        System.out.println("Add: " + result);
        System.out.println("Substract: " + result3);
        System.out.println("Multiply: " + result2);
        System.out.println("Divide: " + result4);

    }
}

