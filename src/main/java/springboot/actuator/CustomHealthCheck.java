package springboot.actuator;

import java.util.Random;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator{

    @Override
    public Health health() {
    	
    	Random random = new Random();
        int num = random.nextInt(10);
        if (num >= 5) {
        	return Health.down().withDetail("Number is higher than 4", num )
        			.withDetail("Can to better", "Yes").build();
        }

        return Health.up().withDetail("Number is lower that 5", num )
        		.withDetail("Can to better", "Yes").build();
    }
}
