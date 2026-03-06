package com.pizzaria.pizzaria_backend.controller;

import com.pizzaria.pizzaria_backend.model.Cliente;
import com.pizzaria.pizzaria_backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO dados) {
        Optional<Cliente> cliente = repository.findByEmail(dados.getEmail());

        if (cliente.isPresent() && cliente.get().getSenha().equals(dados.getSenha())) {
            // Em produção, aqui geramos um Token JWT
            return ResponseEntity.ok(cliente.get());
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas");
    }
}

// DTO para login
class LoginDTO {
    private String email;
    private String senha;

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}