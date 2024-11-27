package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
     public String listarBSMs() {
        return "Orientação ao futuro, Persistência, Responsabilidade Pessoal, Mentalidade de Crescimento."
        		+ "\nComunicação, Proatividade, Orientação ao Detalhe, Trabalho em equipe";
    }

    @GetMapping("/objetivos")
    public String listarObjetivos() {
        return
            "SQL Avançado, "
            + "\nIntrodução ao desenvolvimento web com o uso de Java e Spring Boot, "
            + "\nInjeção de dependências com Spring Framework, "
            + "\nSpring Data JPA, "
            + "\nREST API com Spring Boot";
    }
	
}
