package br.itau.spring01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring01.model.Vehicle;
import br.itau.spring01.repository.VehicleRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/vehicle")
public class VehicleController {
    
    @Autowired
    private VehicleRepo repo;

    @GetMapping
    public List<Vehicle> listarVeiculos() {
        List<Vehicle> list = (List<Vehicle>) repo.findAll();

        return list;
    }
    
}
