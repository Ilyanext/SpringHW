import javax.annotation.PostConstruct;
import java.util.Objects;

public class Bus extends Transport{

    public Bus(String model) {
        super(model);
    }


    public void start() {
        System.out.println("Машина" +getModel()+" готова к работе");
    }

    @PostConstruct
    private void init(){
        System.out.println("Aвтобус готов к работе");
    }
}
