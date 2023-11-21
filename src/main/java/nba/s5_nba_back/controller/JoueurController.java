package nba.s5_nba_back.controller;

import nba.s5_nba_back.model.Joueur;
import nba.s5_nba_back.repository.JoueurRepository;
import nba.s5_nba_back.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/Joueur")
public class JoueurController {
    @Autowired
    JoueurRepository joueurRepository;

    @Autowired
    JoueurService joueurService;

    @GetMapping("/{id}")
    public List<Joueur> getJoueursbyequipe(@PathVariable Long id){
        return joueurRepository.getJoueurByEquipe(id);
    }

    @PostMapping
    public void insert(@RequestBody Joueur joueur){
        joueurService.insertJoueur(joueur);
    }

    @GetMapping("AllJoueur/")
    public List<Joueur> getAlljoueurs(){
        return joueurService.GetAllJoueur();
    }
}
