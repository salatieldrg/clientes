package io.salatieldrg.github.clientes.model.repository;

import io.salatieldrg.github.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
