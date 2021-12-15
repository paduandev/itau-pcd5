package br.itau.spring01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring01.model.Client;
import br.itau.spring01.repository.ClientRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/client")
public class ClientController {

    @Autowired // injeção de dependência = cria classe, escreve os métodos, e cria um objeto
               // para uso
    private ClientRepo repo;

    @GetMapping("/all")
    public List<Client> listarTodos() {
        List<Client> list = (List<Client>) repo.findAll(); // findAll retorna todos os itens no BD

        return list;
    }

    @GetMapping("/list")
    public Page<Client> listarTodosPaginado(Pageable pageable) {
        Page<Client> list = repo.findAll(pageable); // findAll retorna todos os itens no BD

        return list;
    }

    @GetMapping("/{codigo}") // {indica uma variável}
    public ResponseEntity<Client> buscarCliente(@PathVariable long codigo) {
        // busca um cliente, e se não encontrar retorna null
        Client clientFound = repo.findById(codigo).orElse(null);

        if (clientFound != null) { // achou o cliente no BD
            return ResponseEntity.ok(clientFound); // retorna o cliente com status 200
        }

        return ResponseEntity.notFound().build(); // retorna status 404 sem corpo (cliente)
    }

    @PostMapping
    public ResponseEntity<Client> inserirCliente(@RequestBody Client client) {
        Client newClient = repo.save(client);

        return ResponseEntity.ok(newClient);
    }


    @PutMapping
    public ResponseEntity<Client> atualizarCliente(@RequestBody Client client) {
        if(client.getCod() > 0){
            Client newClient = repo.save(client);

            return ResponseEntity.ok(newClient);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> apagarCliente(@PathVariable long codigo) {

        // antes de apagar, verifica se este cliente existe
        Client clienteEncontrado = repo.findById(codigo).orElse(null);

        if (clienteEncontrado != null) { // achou o cliente no BD
            try{
                repo.deleteById(codigo);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }

        

        return ResponseEntity.notFound().build();

    }

    @PostMapping("/email")
    public ResponseEntity<Client> buscarPorEmail(@RequestBody Client cliente) {
        Client clienteEncontrado = repo.findByEmail(cliente.getEmail());

        if (clienteEncontrado != null) { // achou o cliente no BD
            return ResponseEntity.ok(clienteEncontrado); // retorna o cliente com status 200
        }

        return ResponseEntity.notFound().build();
    }
    
}
