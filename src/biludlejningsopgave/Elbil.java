
package biludlejningsopgave;


public class Elbil extends Bil {
    private double whPrKm;
    private final double DIVISIONSFAKTOR=91.25;

    public Elbil(double whPrKm, String regNr, String mærke, String årgang, int antalDøre) {
        super(regNr, mærke, årgang, antalDøre);
        this.whPrKm = whPrKm;
    }
    
    
    @Override
    public double beregnGrønEjerafgift() {
        double result=0.0;
        double kmPrL=omregnWhPrKmTilKmPrL();
        if(kmPrL<5)
            result=10470;
        else if (kmPrL<10)
            result=5500;
        else if(kmPrL<15)
            result=2340;
        else if(kmPrL<20)
            result=1050;
        else 
            result=330;
        
        return result;
    }
    private double omregnWhPrKmTilKmPrL(){
        double temp = whPrKm/DIVISIONSFAKTOR;
        return 100/temp;
        
    }

    @Override
    public String toString() {
        return "Elbil{Mærke="+super.getMærke()+ " Årgang"+super.getÅrgang() + "whPrKm=" + whPrKm + ", DIVISIONSFAKTOR=" + DIVISIONSFAKTOR + '}';
    }
    
}
