package br.com.uniderp.poo2.atacado.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uniderp.poo2.atacado.Entities.Subclasse;
import br.com.uniderp.poo2.atacado.Repositories.ISubclasseRepository;

@RestController
@RequestMapping(value = "/api/atacado/subclasses")
public class SubclasseController {
    
    @Autowired
    private ISubclasseRepository repo;

    @GetMapping
    public List<Subclasse> getAll() {
        List<Subclasse> lista = this.repo.findAll();
        return lista;
    }    
}
