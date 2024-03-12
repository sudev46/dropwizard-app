package jar.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class HelloWorld {

    @GET
    public String getHelloWorld() {
        return "Hello, World!";
    }
}