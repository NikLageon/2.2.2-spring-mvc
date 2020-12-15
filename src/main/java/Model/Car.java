package Model;

public class Car {
    private String model;
    private String color;
    private int serias;

    public Car() {}

    public Car(String model, String color, int serias) {
        this.model = model;
        this.color = color;
        this.serias = serias;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerial() {
        return serias;
    }

    public void setSerial(int serial) {
        this.serias = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serial=" + serias +
                '}';
    }
}
