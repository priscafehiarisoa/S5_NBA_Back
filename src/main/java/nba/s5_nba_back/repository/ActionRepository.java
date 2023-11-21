package nba.s5_nba_back.repository;

import nba.s5_nba_back.model.Action;
import nba.s5_nba_back.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action,Long> {
}
