package springboot.actuator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;
/**
 * See http://www.javabeat.net/spring-boot-actuator/
 *
 */
@Component
public class ShowEndpoints extends AbstractEndpoint<List<Endpoint>>{
 
    private List<Endpoint> endpoints;

    @Autowired
    public ShowEndpoints(List<Endpoint> endpoints) {
        super("showEndpoints");
        this.endpoints = endpoints;
    }
 
    public List<Endpoint> invoke() {
        return this.endpoints;
    }
}
