package br.com.uniderp.poo2.atacado.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uniderp.poo2.atacado.Entities.Classe;

public interface IClasseRepository 
    extends JpaRepository<Classe, Long> {
    
}
