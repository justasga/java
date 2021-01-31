package P04;

public class P04Pirmas {

    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        int suma1 = 0;
        for (int e : a) { // for( e of a)
            suma1 += e;
        }
        double vidurkis1 = (double) suma1/ a.length;
        System.out.println("a vidurkis = " + vidurkis1);

        int suma2 = 0;
        for (int e : b) { // for( e of a)
            suma2 += e;
        }
        double vidurkis2 = (double) suma2/ b.length;
        System.out.println("b vidurkis = " + vidurkis2);

        System.out.println("skaiciu skirtumas  = " + ( vidurkis1 - vidurkis2));
    }
}