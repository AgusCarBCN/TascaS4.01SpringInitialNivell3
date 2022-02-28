package carnerero.agustin.s401.nivell3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllers {
	/*
	 * Crea una petició GET amb direcció a "/" que com a resposta retorni un
	 * "HELLO WORLD".
	 */
	
	
	@GetMapping(value = "/")
	public String hello() {
		return "hello World";
	}

	/*
	 * Modifica la petició anterior perquè accepte una variable per path, que sigua
	 * un nom, construint “Hello, <NOM>”.
	 */
	@GetMapping(path = "/{nom}")
	public String HelloWord(@PathVariable String nom) {
		return "Hello " + nom;
	}
}
