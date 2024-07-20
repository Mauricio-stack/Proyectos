package com.utp.servidor.controller;

import com.utp.servidor.entidad.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/Cliente")
public class ClienteController {
    private static final List<Cliente> CLIENTES = List.of(
            new Cliente(1L, "Jose", "Paredes", "Fernandez", "77000231", "Masculino", "Trujillo"),
            new Cliente(2L, "Angel", "Paucara", "Calderon","27232313", "Masculino", "Ica"),
            new Cliente(3L, "Luis", "Cerna", "Serviz", "77030731", "Masculino", "Piura"),
            new Cliente(4L, "Jesus", "Valdez", "Palomares", "77220241", "Masculino", "Chiclayo"),
            new Cliente(5L, "Mario", "Balderon", "Espinoza", "77320251", "Masculino", "Huaral")
    );

    @GetMapping
    public List<Cliente> findAllClientes(){
        return CLIENTES;
    }
}