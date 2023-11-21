package nba.s5_nba_back.controller;

import nba.s5_nba_back.repository.ActionRepository;
import nba.s5_nba_back.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/action")
public class ActionController {
    @Autowired
    ActionRepository actionRepository;

    @Autowired
    ActionService actionService;

    @GetMapping("/{idJoueur}")
    public ResponseEntity<List<Map<String, Object>>> getActionStatistics(@PathVariable Long idJoueur) {
        List<Map<String, Object>> statistics = actionRepository.getActionStatistics(idJoueur);
        return ResponseEntity.ok(statistics);
    }

}
