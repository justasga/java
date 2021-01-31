package P08.turnyras;

public class pora extends zaidejas{

    private zaidejas a;
    private zaidejas b;

    @Override
    public String vardas() {
        return a.vardas() + " zaidzia su " + b.vardas() ;
    }
}
