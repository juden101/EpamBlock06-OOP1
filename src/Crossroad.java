import java.util.ArrayList;

/**
 * A class is a crossroads.
 * It provides a method to get crossed by a transport,
 * and contain a list of transportsThatCrossed that cross it.
 *
 * @author Andrii Shcavinskyi
 */
public class Crossroad {

    private ArrayList<Transport> transportsThatCrossed;

    public Crossroad() {
        this.transportsThatCrossed = new ArrayList<>();
    }

    public void cross(Transport transport) {
        transportsThatCrossed.add(transport);
    }

    public ArrayList<Transport> getTransportsThatCrossed() {
        return transportsThatCrossed;
    }
}
