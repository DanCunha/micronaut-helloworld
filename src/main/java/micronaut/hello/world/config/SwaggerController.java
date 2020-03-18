package micronaut.hello.world.config;

import javax.inject.Inject;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import io.swagger.v3.oas.annotations.Hidden;

@Hidden
@Controller("/api")
public class SwaggerController {

    @Inject
    SwaggerConfig config;

    @View("swagger/index")
    @Get
    public SwaggerConfig index() {
        return config;
    }
}