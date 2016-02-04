package lab1;

public class Exercise10 {
    public static void main(String[] args) {
        int num = 16777217;
        int big = 2147483647;
        long bigger = big + 1;
        long biggerAlternative = (long)big + 1;
        long biggerSecondAlternative = big + 1L;
        float decimalF = num;
        double decimalD = num;
        int backAgainF = (int)decimalF;
        int backAgainD = (int)decimalD;

        System.out.println("num = " + num);
        System.out.println("num to Double = " + decimalD);
        System.out.println("num to float = " + decimalF);
        System.out.println("num back to int from double = " + backAgainD);
        System.out.println("num back to int from float = " + backAgainF);

        System.out.println("big = \t\t\t\t" + big);
        System.out.println("bigger = \t\t\t" + bigger);
        System.out.println("biggerAlternative = \t\t" + biggerAlternative);
        System.out.println("biggerSecondAlternative = \t" + biggerSecondAlternative);
    }
}
