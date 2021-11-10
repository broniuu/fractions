public class Main {
    public static void main(String[] args) {
        Fraction firstFraction = new Fraction(1, 3);
        Fraction secondFraction = new Fraction(1, 2);
        firstFraction.shorten();
        System.out.println(firstFraction.toString());
        Fraction thirdFraction = Fraction.addTwoFractions(firstFraction, secondFraction);
        System.out.println(thirdFraction.toString());
    }
}
