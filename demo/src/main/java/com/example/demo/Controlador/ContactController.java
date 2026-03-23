package com.example.demo.Controlador;

import com.example.demo.Modelo.ContactoModelo;
import com.example.demo.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController

public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/Contacto")

    public List<ContactoModelo> obtenerContacto() {
        return contactService.obtenerContactos();
    }

    // Buscar por ID
    @GetMapping("Contacto/id/{id}")
    public ContactoModelo buscarPorId(@PathVariable int id) {
        return contactService.buscarPorId(id);
    }

    // Buscar por nombre
    @GetMapping("Contacto/nombre/{nombre}")
    public List<ContactoModelo> buscarPorNombre(@PathVariable String nombre) {
        return contactService.buscarPorNombre(nombre);
    }

    // Buscar por teléfono
    @GetMapping("Contacto/telefono/{telefono}")
    public ContactoModelo buscarPorTelefono(@PathVariable long telefono) {
        return contactService.buscarPorTelefono(telefono);
    }
}







