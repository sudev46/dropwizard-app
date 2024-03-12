package jar;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import jar.resources.HelloWorld;

public class iamApplication extends Application<iamConfiguration> {

    public static void main(final String[] args) throws Exception {
        new iamApplication().run(args);
    }

    @Override
    public String getName() {
        return "iam";
    }

    @Override
    public void initialize(final Bootstrap<iamConfiguration> bootstrap) {

    }

    @Override
    public void run(final iamConfiguration configuration,
                    final Environment environment) {
        // Register the HelloWorldResource
        environment.jersey().register(new HelloWorld());
    }

}
