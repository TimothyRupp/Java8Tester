package com.timothy_g;

public class Java8Tester {

    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with type declaration
        MathOperation subtraction = (int a, int b) -> a - b;

        //with return statement along with curly brackets
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));

    }

    interface MathOperation{
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
