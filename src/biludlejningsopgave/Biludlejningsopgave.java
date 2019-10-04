
package biludlejningsopgave;

public class Biludlejningsopgave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bil el1 = new Elbil(3.4, "38459","Volvo", "1999",5);
        Bil diesel1 = new Dieselbil(10.5, true, "68477","Saab", "2015",5);
        Bil benzin1 = new Benzinbil(9.9, "77789","Ford", "2008",4);
        Garage garage = new Garage("Willys biludlejning");
        garage.tilføjBil(el1);
        garage.tilføjBil(diesel1);
        garage.tilføjBil(benzin1);
        System.out.println("Samlet grøn ejerafgift:"+garage.beregnGrønEjerAfgiftForBilpark());
    }
    
}
