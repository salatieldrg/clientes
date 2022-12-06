package io.salatieldrg.github.clientes.model.repository;

import io.salatieldrg.github.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
