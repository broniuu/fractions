import java.io.IOException;

public class Fraction implements Comparable<Fraction>{
    private Integer numerator;
    private Integer denominator;

    Fraction(Integer numerator, Integer denominator) {
        setNumerator(numerator);
        if (denominator == 0) {
            throw new ZeroDenominator();
        } else {
            setDenominator(denominator);
        }
        this.shorten();
    }
    public void setDenominator(int denominator) {

        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {

        this.numerator = numerator;
    }

    public int getDenominator() {

        return denominator;
    }

    public int getNumerator() {

        return numerator;
    }

    public Fraction add(Fraction secondFraction){

        if (this.denominator == secondFraction.denominator) {
            this.numerator = this.numerator + secondFraction.numerator;
            denominator = secondFraction.denominator;
        } else {
            this.numerator = this.numerator * secondFraction.denominator +
                    secondFraction.numerator * this.denominator;
            this.denominator = this.denominator * secondFraction.denominator;
        }
        return this.shorten();
  }

    public Fraction substract(Fraction secondFraction){
        if(this.denominator == secondFraction.denominator){
            this.numerator = this.numerator - secondFraction.numerator;
            this.denominator = secondFraction.denominator;
        }
        else{
            this.numerator = this.numerator * secondFraction.denominator -
                    secondFraction.numerator * this.denominator;
            this.denominator = this.denominator * secondFraction.denominator;
        }
        return this.shorten();
    }

    public Fraction shorten() {
        Finder finder = new Finder();
        Integer greatestDivisor = 0;
        try {
            greatestDivisor = finder.findGreatestCommonDivisor(this.numerator, this.denominator);
        } catch (IOException exception){
            exception.printStackTrace();
        }
        this.numerator = this.numerator / greatestDivisor;
        this.denominator = this.denominator / greatestDivisor;
        return this;
    }

    @Override
    public String toString() {
            return numerator + "/" + denominator ;
    }
    static Fraction addTwoFractions(Fraction firstFraction, Fraction secondFraction){
        Integer numerator = 0;
        Integer denominator = 0;
        if (firstFraction.denominator == secondFraction.denominator) {
            numerator = firstFraction.numerator + secondFraction.numerator;
            denominator = secondFraction.denominator;
        } else {
            numerator = firstFraction.numerator * secondFraction.denominator +
                    secondFraction.numerator * firstFraction.denominator;
            denominator = firstFraction.denominator * secondFraction.denominator;
        }
        return new Fraction(numerator,denominator).shorten();
    }
    static Fraction substractTwoFractions(Fraction firstFraction, Fraction secondFraction){
        Integer numerator = 0;
        Integer denominator = 0;
        if(firstFraction.denominator == secondFraction.denominator){
            numerator = firstFraction.numerator - secondFraction.numerator;
            denominator = secondFraction.denominator;
        }
        else{
            numerator = firstFraction.numerator * secondFraction.denominator -
                    secondFraction.numerator * firstFraction.denominator;
            denominator = firstFraction.denominator * secondFraction.denominator;
        }
        return new Fraction(numerator,denominator).shorten();
    }

    public int compareTo(Fraction fraction){
        return Fraction.substractTwoFractions(this, fraction).numerator;
    }
}
