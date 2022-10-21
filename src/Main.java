import java.util.*;

public class Main {
    public static void main(String[] args) {
        Fraction array[] = {new Fraction(3, 5),
                new Fraction(1, 5),
                new Fraction(4, 5)
        };
        List<Fraction> list = new ArrayList<>();
                list.add(new Fraction(3, 7));
                list.add(new Fraction(1, 7));
                list.add(new Fraction(4, 7));

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
