
public class CargoCar extends AbstractTransport {

    public CargoCar(String model, String plateNumber) {
        super(model, plateNumber);
    }

    @Override
    public void move() {
        System.out.println("Cargo car moves.");
    }

}
