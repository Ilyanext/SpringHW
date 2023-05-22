import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("BMW");
    }


    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("Audi");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("Mers");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Вася",getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Петя", getPickupBean());
    }
    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Nikola", getBusBean());
    }
}
