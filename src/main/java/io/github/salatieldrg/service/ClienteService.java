package io.github.salatieldrg.service;

import io.github.salatieldrg.model.Cliente;
import io.github.salatieldrg.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente();
//        ClienteRepository repository = new ClienteRepository();
        repository.persistir(cliente);
    }

    private void validarCliente() {
        //Valida cliente
    }
}
