package br.com.fiap.gs1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.gs1.model.Nave;

@Repository
public interface NaveRepository extends JpaRepository<Nave, Long>{

}
