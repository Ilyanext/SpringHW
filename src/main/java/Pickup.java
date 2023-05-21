import javax.annotation.PostConstruct;
import java.util.Objects;

public class Pickup  extends Transport{

    public Pickup(String model) {
        super(model);
    }
    public void start() {
        System.out.println("Машина" +getModel()+" готова к работе");
    }
    @PostConstruct
    private void init(){
        System.out.println("Пикап готов к работе");
    }
}
