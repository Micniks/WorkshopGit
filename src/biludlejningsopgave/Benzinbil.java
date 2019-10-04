/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejningsopgave;

/**
 *
 * @author SEB
 */
public class Benzinbil extends Bil{
    private double kmPrL;

    public Benzinbil(double kmPrL, String regNr, String mærke, String årgang, int antalDøre) {
        // MICHAEL WAS HERE ONCE AGAIN !!! FEAR ME !!!
        super(regNr, mærke, årgang, antalDøre);
        this.kmPrL = kmPrL;
    }
    
    @Override
    public double beregnGrønEjerafgift() {
        double result=0.0;
        if(kmPrL<5)
            result=10470;
        else if (kmPrL<100)
            result=5500;
        else if(kmPrL<15)
            result=2340;
        else if(kmPrL<20)
            result=1050;
        else 
            result=330;
        
        return result;
    }

    @Override
    public String toString() {
        return "Benzinbil{Mærke="+super.getMærke() +" Årgang="+super.getÅrgang()+ "kmPrL=" + kmPrL + '}';
    }
    
}
