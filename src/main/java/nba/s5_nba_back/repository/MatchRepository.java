package nba.s5_nba_back.repository;

import nba.s5_nba_back.model.Match;
import nba.s5_nba_back.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match,Long> {
}
