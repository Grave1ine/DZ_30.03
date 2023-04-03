package Task2;

public class task2 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.DivisionInt(8,5);
        calculator.DifferenceDouble(5.98,7.684);
        calculator.MultiplicationInt(84845,656);
        calculator.SumLong(454515151,54544545);

    }
}

//  Создать класс Calculator. У него должны быть методы:
//      1. Сумма
//      2. Деление
//      3. Умножение
//      4. Вычитание
//      Все методы должны быть перегружены и работать с тремя типами - double, long и int.
//      Т.е. должны быть, к примеру, по 3 метода суммы: int add(int a, int b), double add(double a, double b) и long add(long a, long b).