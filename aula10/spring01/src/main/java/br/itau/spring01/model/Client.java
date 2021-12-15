package br.itau.spring01.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // indica que esta classe será armazenada no Banco de Dados
@Table(name = "cliente") // nome da tabela no banco de dados
public class Client {

    @Id // indica que este campo será chave primária (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o número será gerado pelo BD sequencialmente (1, 2, 3, 4...)
    private long cod;
    
    @Column(name = "nome", length = 200, nullable = false)
    // length = tamanho máximo em caracteres, nullable = false => campo obrigatório
    private String name;
    
    @Column(name = "email", length = 100, nullable = false, unique = true)
    // unique = não pode ter 2 emails iguais
    private String email;

    @OneToMany(mappedBy = "owner")  // Um Cliente pode ter vários veiculos 
                                    // owner = atributo do veiculo que faz o relacionamento
    @JsonIgnoreProperties("owner")  // quando buscar os veículos, não traga os proprietários
    private List<Vehicle> vehicles;

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    
}
