
package biludlejningsopgave;


public class Dieselbil extends Bil {
    private double kmPrL;
    private boolean harPartikelfilter;

    public Dieselbil(double kmPrL, boolean harPartikelfilter, String regNr, String mærke, String årgang, int antalDøre) {
        super(regNr, mærke, årgang, antalDøre);
        this.kmPrL = kmPrL;
        this.harPartikelfilter = harPartikelfilter;
    }
    
    //Gretha kan ikke lide dieselbiler
    @Override
    public double beregnGrønEjerafgift() {
        double result=0.0;
        if(kmPrL<5)
            result=10470+15260;
        else if (kmPrL<10)
            result=5500+2770;
        else if(kmPrL<15)
            result=2340+1850;
        else if(kmPrL<20)
            result=1050+1390;
        else 
            result=330+130;
        if(!harPartikelfilter)
            result+=1000;
        return result;
    }

    @Override
    public String toString() {
        return "Dieselbil{Mærke="+super.getMærke()+ " Årgang="+super.getÅrgang() + "kmPrL=" + kmPrL + ", harPartikelfilter=" + harPartikelfilter + '}';
    }
    
}
