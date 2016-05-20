
public class Motorcycle extends AbstractTransport {

    public Motorcycle(String model, String plateNumber) {
        super(model, plateNumber);
    }

    @Override
    public void move() {
        System.out.println("Motorcycle moves.");
    }
}
