package nba.s5_nba_back.repository;

import nba.s5_nba_back.model.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur,Long> {
}
