package nba.s5_nba_back.model;

import jakarta.persistence.*;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Match;

    @ManyToOne
    @JoinColumn(name = "id_saison")
    Saison saison;

    @ManyToOne
    @JoinColumn(name = "id_equipe1")
    Equipe equipe1;

    @ManyToOne
    @JoinColumn(name = "id_equipe2")
    Equipe equipe2;

    public Long getId_Match() {
        return id_Match;
    }

    public void setId_Match(Long id_Match) {
        this.id_Match = id_Match;
    }

    public Saison getSaison() {
        return saison;
    }

    public void setSaison(Saison saison) {
        this.saison = saison;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public Match() {
    }

    public Match(Saison saison, Equipe equipe1, Equipe equipe2) {
        this.saison = saison;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public Match(Long id_Match, Saison saison, Equipe equipe1, Equipe equipe2) {
        this.id_Match = id_Match;
        this.saison = saison;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }
}
