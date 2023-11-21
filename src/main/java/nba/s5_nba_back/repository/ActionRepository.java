package nba.s5_nba_back.repository;

import nba.s5_nba_back.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ActionRepository extends JpaRepository<Action,Long> {
    //@Query
//    @Query("SELECT ta.nom_action AS type_action, COUNT(a.id_action) AS total_actions, AVG(CAST(a.resultat AS DECIMAL(3, 2))) AS taux_reussite " +
//            "FROM TypeAction ta " +
//            "LEFT JOIN Action a ON ta.id_type_action = a.id_action AND a.id_joueur = :idJoueur " +
//            "GROUP BY ta.nom_action")

    @Query(value = "SELECT ta.nom_action AS type_action, COUNT(a.id_action) AS total_actions, AVG(CAST(a.resultat AS DECIMAL(3, 2))) AS taux_reussite " +
            "FROM type_action ta " +
            "LEFT JOIN Action a ON ta.id_type_action = a.id_type_action AND a.id_joueur = :idJoueur " +
            "GROUP BY ta.nom_action", nativeQuery = true)
    List<Map<String, Object>> getActionStatistics(@Param("idJoueur") Long idJoueur);
}
