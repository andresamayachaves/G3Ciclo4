package com.unab.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class IndexController {

	// private static final String USERNAME ="Jhonnyer";
	@Value("${text.indexController.titulo}")
	private String USERNAME;

	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public String getPrueba() {
		System.out.println("La aplicación inicia correctamente");
		return "endpoint is running";
	}

	@GetMapping("/pruebavacia")
	public void getPruebsinRetorno() {
		System.out.println("Prueba vacía");
	}

	@PostMapping("/retornaObjeto")
	public Object getObjecto(@RequestBody Object object) {
		System.out.println("Test Request Body");
		System.out.println(object);
		return object;
	}

	@GetMapping("/parametro/{nombre}")
	public String indexParam(@PathVariable("nombre") String nombre) {
		System.out.println(USERNAME);
		System.out.println("Buenas " + nombre + " bienvenido a nuestra aplicación");
		System.out.println("Test GIT 1 de prueba ");
		System.out.println("Test GIT 2 de prueba");
		System.out.println("Test GIT 3 de prueba");
		return nombre;
	}

}
