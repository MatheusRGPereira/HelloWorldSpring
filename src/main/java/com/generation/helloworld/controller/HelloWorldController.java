package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("hello-world")
public class HelloWorldController {

	
	@GetMapping 
	public String helloworld() {
		return "Hello World";
	}
	
	

	@GetMapping("/bsm")
	public String bsms() {
		return "----MENTALIDADES----\n"
				+ "\n---Orientação ao futuro\n"
				+ "---Responsabilidade pessoal\n"
				+ "---Mentalidade de crescimento\n"
				+ "---Persistencia\n"
				+ "\n----HABILIDADES----\n"
				+ "\n---Trabalho em equipe\n"
				+ "---Atenção aos detalhes\n"
				+ "--Proatividade\n"
				+ "--Comunicação";
	
	}
	
	@GetMapping("/objetivos")
	public String aprendendo() {
		return	 "--SpringBoot\n"
				+ "--Organização Projeto integreador\n"
				+ "--Unificação de BD e Spring\n";
		
	}
}
