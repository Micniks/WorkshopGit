/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejningsopgave;

import java.util.ArrayList;

/**
 *
 * @author SEB
 */
public class Garage {
    private ArrayList<Bil> garage = new ArrayList<>();
    private String navn;

    public Garage(String navn) {
        this.navn = navn;
    }
    
    public void tilføjBil(Bil bil){
        garage.add(bil);
    }

    @Override
    public String toString() {
        return "Garage{" + "garage=" + garage + ", navn=" + navn + '}';
    }
    
    public double beregnGrønEjerAfgiftForBilpark(){
        double result = 0.0;
        for(Bil bil: garage){
            result += bil.beregnGrønEjerafgift();
        }
        return result;
    }
}
