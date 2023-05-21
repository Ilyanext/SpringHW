import javax.annotation.PostConstruct;
import java.util.Objects;

public abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        System.out.println("Машина готова к работе");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}