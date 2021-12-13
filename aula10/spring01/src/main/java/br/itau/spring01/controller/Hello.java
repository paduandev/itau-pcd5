package br.itau.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // indica que esta classe é um controller do tipo REST
@CrossOrigin("*") // aceita requisições de qualquer outro domínio
@RequestMapping("/hello") // nome do recurso que está sendo acessado
public class Hello {

    @GetMapping // este método é acesso por um GET
    public String ola() {
        return "Hello world";
    }

}
