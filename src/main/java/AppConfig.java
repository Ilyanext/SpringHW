import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "BMW")
    public Transport getBmwBean() {
        return new Car("BMW");
    }


    @Bean(name = "Audi")
    public Transport getAudiBean() {
        return new Pickup("Audi");
    }

    @Bean(name = "Mers")
    public Transport getMersBean() {
        return new Bus("Mers");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Вася",getBmwBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Петя", getAudiBean());
    }
    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Nikola", getMersBean());
    }
}
