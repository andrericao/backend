package br.com.digitalhouse.projetointegrador.domain.repository;

import br.com.digitalhouse.projetointegrador.domain.entity.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DentistaRepository extends JpaRepository<Dentista, UUID> {
    List<Dentista> findByNomeStartingWith(String termo);
}
