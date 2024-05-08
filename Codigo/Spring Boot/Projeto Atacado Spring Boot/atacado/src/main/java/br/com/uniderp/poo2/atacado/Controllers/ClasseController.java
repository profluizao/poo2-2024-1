package br.com.uniderp.poo2.atacado.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uniderp.poo2.atacado.Entities.Classe;
import br.com.uniderp.poo2.atacado.Repositories.IClasseRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api/atacado/classes")
public class ClasseController {

    @Autowired
    private IClasseRepository repo;

    @GetMapping
    public List<Classe> getAll() {
        List<Classe> lista = this.repo.findAll();
        return lista;
    }
}
