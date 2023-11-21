package nba.s5_nba_back.service;

import nba.s5_nba_back.model.Equipe;
import nba.s5_nba_back.repository.EquipeRepository;

import java.util.List;

public class EquipeService {
    private final EquipeRepository equipeRepository;

    public EquipeService(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    public List<Equipe> getAllEquipe(){
         return equipeRepository.findAll();
    }

    public void updateEquipe(Equipe equipe, Long id){
        Equipe oldEquipe= equipeRepository.findById(id).orElse(new Equipe());


    }

}
