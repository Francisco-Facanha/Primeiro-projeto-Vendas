package org.example.Service;

import org.example.Model.Cliente;
import org.example.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {


    private ClienteRepository repository;
    public ClientesService (ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente (Cliente Cliente){
            validadarCiente(Cliente);
        this.repository.persistir(Cliente);
    }
    public void validadarCiente (Cliente Cliente){
//Aplica validações
    }

}
