package nba.s5_nba_back.service;

import nba.s5_nba_back.model.Joueur;
import nba.s5_nba_back.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoueurService {

    @Autowired
    JoueurRepository joueurRepository;
    public List<Joueur> GetAllJoueur(){
        return joueurRepository.findAll();
    }

    public void insertJoueur(Joueur joueur){
        joueurRepository.save(joueur);

    }
}
