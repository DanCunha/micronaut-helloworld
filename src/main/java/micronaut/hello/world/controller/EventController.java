package micronaut.hello.world.controller;

import java.util.Date;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import micronaut.hello.world.dto.EventDTO;

@Validated
@Controller("/api/event")
public class EventController {

	@Get
	@ApiResponse(description = "Show Event")
	public EventDTO getEvent() {
		EventDTO dto = new EventDTO();
		dto.setId(1l);
		dto.setNome("Campus Party");
		dto.setStatus(true);
		dto.setDtEvento(new Date());
		dto.setDescricao("Evento Top");
		
		return dto;
	}

}
