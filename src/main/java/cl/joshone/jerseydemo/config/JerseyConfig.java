package cl.joshone.jerseydemo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import cl.joshone.jerseydemo.controller.BookController;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        
        register(BookController.class);
    }
}
