package nba.s5_nba_back.controller;

import nba.s5_nba_back.model.Equipe;
import nba.s5_nba_back.repository.EquipeRepository;
import nba.s5_nba_back.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    EquipeRepository equipeRepository;

    @Autowired
    EquipeService equipeService;

    @GetMapping
    public List<Equipe> getAllequipe(){
        return equipeService.getAllEquipe();
    }

    @PostMapping
    @Transactional
    public void insert(@RequestBody Equipe equipe) throws Exception {
        equipeService.insertEquipe(equipe);
    }

}
