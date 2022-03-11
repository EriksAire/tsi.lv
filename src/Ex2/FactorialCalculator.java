package Ex2;

public class FactorialCalculator {
    public static void main(String[] Args){
        var calculator = new FactorialCalculator();

        System.out.println(calculator.FactorialLoop(4));
        System.out.println(calculator.FactorialRecursive(4));
    }

    public int FactorialRecursive(int number){
        if(number>1)
             number *= FactorialRecursive(number-1);

        return  number;
    }

    public int FactorialLoop(int number){
        int result = 1;

        for(int i=number; i>1; i--){
            result *= i;
        }

        return result;
    }
}
