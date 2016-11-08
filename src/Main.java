public class Main {

    public static void main(String[] args) {
        Fibonaci(20);
        System.out.println("FibonaciRec  using the method - recursion - №20 = " + FibonaciRec(20));
        FibonaciWhile(20);
    }
    private static void Fibonaci(int number)    {
        int result = 0, firstValue = 0, secondValue = 1;
        System.out.println("0: " + firstValue);
        System.out.println("1: " + secondValue);
        for (int n = 2; n <= number; n++)    {
            result = firstValue + secondValue;
            System.out.println(n + ": " + result);
            firstValue = secondValue;
            secondValue = result;
        }
        System.out.println("Fibonaci using the method - for -  №20 = " + result);
    }
    private static int FibonaciRec(int number) {
        if (number == 0 || number == 1) {
            return number;
        }   else    {
            return (FibonaciRec(number - 1) + FibonaciRec(number - 2));
        }
    }
    private static void FibonaciWhile(int number)    {
        int n = 2, result = 0, firstValue = 0, secondValue = 1;
        System.out.println("0: " + firstValue);
        System.out.println("1: " + secondValue);
        while (n <= number)    {
            result = firstValue + secondValue;
            System.out.println(n + ": " + result);
            firstValue = secondValue;
            secondValue = result;
            n++;
        }
        System.out.println("Fibonaci using the method - while - №20 = " + result);
    }
}
