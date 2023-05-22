import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Driver {
    private String name;
    private Transport transport;


    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void startTheCar() {
        System.out.println(name + " сел(а) в " + transport);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
