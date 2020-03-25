package micronaut.hello.world.controller;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Validated
@Controller("/api/hello")
public class HelloController {
	
    @Get
    @ApiResponse(description = "Provides a simple OK back to the user")
    public HttpStatus index() {
    	System.out.println("Teste");
    	return HttpStatus.OK;
    }
}