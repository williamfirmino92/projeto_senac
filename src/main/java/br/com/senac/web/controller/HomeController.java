package br.com.senac.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Adicionado um bean para informar que é do tipo controller
public class HomeController {

    @GetMapping("/") // Aqui informando que iremos realizar um get para a página raiz
    public String home() {
        return "/home"; // Adicionando o método que vai abrir a página home
    }
}