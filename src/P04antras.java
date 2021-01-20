public class P04antras {

    public static void main(String[] args) {
        for ( int i = 1; i <= 1000; i++) {

            // ar skaicius i yra tobulas
            if (arTobulasSkaicius(i)) {
                System.out.println("tobulas skaicius: " + i);
            }

        }
    }

    static boolean arTobulasSkaicius(int skaicius) {
        // surasti skaiciaus daliklius ir patikrinti ar ju suma lygi tam skaiciui
        int suma = 0;
        for (int d = 1; d <= skaicius / 2; d++) {
            if (skaicius % d == 0) {
                suma += d;
            }
        }
        return  suma == skaicius;
    }
}
