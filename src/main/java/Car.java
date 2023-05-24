import javax.annotation.PostConstruct;
import java.util.Objects;

public class Car extends Transport {


    public Car(String model) {
        super(model);
    }


    public void start() {
        System.out.println("Машина" +getModel()+" готова к работе");
    }
    @PostConstruct
    private void init(){
        System.out.println("Машина готова к работе");
    }


}
