package SensorsandTemperartures;

public interface Sensor {
    boolean isOn();
    void setOn();
    void setOff();
    int read();
}
