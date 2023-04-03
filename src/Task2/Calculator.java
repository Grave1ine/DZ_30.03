package Task2;

public class Calculator {

    public void SumInt(int a, int b){
        System.out.println(a + b);
    }

    public void SumDouble(double a, double b){
        System.out.println(a + b);
    }

    public void SumLong(long a, long b){
        System.out.println(a + b);
    }

    public void DifferenceInt(int a, int b){
        System.out.println(a - b);
    }

    public void DifferenceDouble(double a, double b){
        System.out.println(a - b);
    }

    public void DifferenceLong(long a, long b){
        System.out.println(a - b);
    }

    public void MultiplicationInt(int a, int b){
        System.out.println(a * b);
    }

    public void MultiplicationDouble(double a, double b){
        System.out.println(a * b);
    }

    public void MultiplicationLong(long a, long b){
        System.out.println(a * b);
    }

    public void DivisionInt(int a, int b){
        if(a == 0 || b == 0){
            System.out.println("error");
        } else {
            System.out.println(a / b);
        }
    }

    public void DivisionDouble(double a, double b){
        if(a == 0 || b == 0){
            System.out.println("error");
        } else {
            System.out.println(a / b);
        }
    }

    public void DivisionLong(long a, long b){
        if(a == 0 || b == 0){
            System.out.println("error");
        } else {
            System.out.println(a / b);
        }
    }




}
