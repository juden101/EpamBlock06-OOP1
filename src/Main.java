import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        // initialize crossroad
        Crossroad crossroad = new Crossroad();

        // initialize start transports
        Transport[] startTransport = {
                new CargoCar("ZAZ", "WE 420-00 D"),
                new CargoCar("MAN", "KE 880-05 K"),
                new Motorcycle("YAMAHA", "СА 234-34 В"),
                new Motorcycle("SUZUKI", "WT 192-33 F")
        };

        // cross crossroad by each start transport
        for (Transport transports: startTransport) {
            crossroad.cross(transports);
        }

        // get transports that cross the crossroad
        ArrayList<Transport> transports = crossroad.getTransportsThatCrossed();
        System.out.println("Total transport count that crossed the crossroad: " + transports.size());

        int cargoCarsCount = 0;

        // motorcycle that need to find
        Motorcycle requiredMotorcycle = new Motorcycle("YAMAHA", "СА 234-34 В");
        boolean isMotoFound = false;

        for (Transport transport : transports) {

            // count cargo cars
            if (transport.getClass() == CargoCar.class) {
                cargoCarsCount++;
            }

            // find required motorcycle
            if (transport.getClass() == Motorcycle.class) {
                Motorcycle motorcycle = (Motorcycle) transport;
                if (motorcycle.getModel().equals(requiredMotorcycle.getModel())
                        && motorcycle.getPlateNumber().equals(requiredMotorcycle.getPlateNumber())) {
                    isMotoFound = true;
                }
            }
        }

        // print results
        System.out.println("Cargo cars count that cross the crossroad: " + cargoCarsCount);
        if (isMotoFound) {
            System.out.println(requiredMotorcycle.getModel() + " motorcycle, that cross the crossroad, with '"
                    + requiredMotorcycle.getPlateNumber() + "' plate number was found!");
        }

    }

}
