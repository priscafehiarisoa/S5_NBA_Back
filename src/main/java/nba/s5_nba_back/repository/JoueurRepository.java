package nba.s5_nba_back.repository;

import nba.s5_nba_back.model.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JoueurRepository extends JpaRepository<Joueur,Long> {

    @Query(value = "select j from Joueur j where j.equipe.id_equipe = :equipe")
    List<Joueur> getJoueurByEquipe(Long equipe);

}
