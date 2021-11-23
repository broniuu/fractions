import java.util.*;

public class Main {
    public static void main(String[] args) {
        Fraction firstFraction = new Fraction(1, 3);
        Fraction secondFraction = new Fraction(1, 2);
        Fraction array[] = {new Fraction(2, 4),
                new Fraction(4, 5),
                new Fraction(4, 9)
        };
        List<Fraction> list = new ArrayList<>();
                list.add(new Fraction(1, 5));
                list.add(new Fraction(1, 8));
                list.add(new Fraction(1, 7));

        for (Fraction fraction : array) {
            System.out.println(fraction.toString());
        }
        for (Fraction fraction : list) {
            System.out.println(fraction.toString());
        }
        Arrays.sort(array);
        Collections.sort(list);

        System.out.println("");
        for (Fraction fraction : array) {
            System.out.println(fraction.toString());
        }
        for (Fraction fraction : list) {
            System.out.println(fraction.toString());
        }

    }


}
