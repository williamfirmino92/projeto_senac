package br.com.senac.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/cargos/cadastrar";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/cargos/listar";
	}
}
