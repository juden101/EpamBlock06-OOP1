
public abstract class AbstractTransport implements Transport {

    private String model;
    private String plateNumber;

    public AbstractTransport(String model, String plateNumber) {
        this.model = model;
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

}
