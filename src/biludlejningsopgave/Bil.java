
package biludlejningsopgave;

public abstract class Bil {
    private String regNr;
    private String mærke;
    private String årgang;
    private int antalDøre;

    public Bil(String regNr, String mærke, String årgang, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public String getRegNr() {
		// Michael was here
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getÅrgang() {
        return årgang;
    }

    public void setÅrgang(String årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }
    public abstract double beregnGrønEjerafgift();
}
