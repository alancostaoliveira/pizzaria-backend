package com.pizzaria.pizzaria_backend.repository;

import com.pizzaria.pizzaria_backend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Método extra para o futuro sistema de login
    Optional<Cliente> findByEmail(String email);
}