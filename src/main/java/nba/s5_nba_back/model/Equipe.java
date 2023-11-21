package nba.s5_nba_back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serial;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_equipe;
    String nomEquipe;

    public Equipe() {
    }

    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Equipe(Long id, String nomEquipe) {
        this.id_equipe = id;
        this.nomEquipe = nomEquipe;
    }

    public Long getId() {
        return id_equipe;
    }

    public void setId(Long id) {
        this.id_equipe = id;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }
}
