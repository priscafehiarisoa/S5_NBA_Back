package nba.s5_nba_back.repository;

import nba.s5_nba_back.model.Joueur;
import nba.s5_nba_back.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaisonRepository extends JpaRepository<Saison,Long> {

}
