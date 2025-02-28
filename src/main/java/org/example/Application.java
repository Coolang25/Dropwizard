package org.example;

import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.example.resources.HelloWorld;

public class Application extends io.dropwizard.core.Application<Configuration> {

    public static void main(final String[] args) throws Exception {
        new Application().run(args);
    }

    @Override
    public String getName() {
        return "true";
    }

    @Override
    public void initialize(final Bootstrap<Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Configuration configuration,
                    final Environment environment) {
        // Khai báo resource với jersey thì mới gọi được endpoint
        HelloWorld helloWorld = new HelloWorld();
        environment.jersey().register(helloWorld);
    }

}
