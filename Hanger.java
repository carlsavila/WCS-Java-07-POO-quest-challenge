package quest07.Challenge;

import java.util.ArrayList;

public class Hanger {
    public static void main(String[] args) {

        Boat monBateau = new Boat("Marque à moi", 100000);
        Car monCaisse = new Car("Quelle caisse", 500000);

        ArrayList<Vehicule> listVehicules = new ArrayList<>();
        listVehicules.add(new Car("Toyota", 0));
        listVehicules.add(new Boat("Bateau", 0));
        listVehicules.add(monCaisse);
        listVehicules.add(monBateau);

     for (Vehicule vehicule : listVehicules) {
        System.out.println(vehicule.doStuff());
     }   

    }
}
