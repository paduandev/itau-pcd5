package br.itau.spring01.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.spring01.model.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle, Long> {
    
}
