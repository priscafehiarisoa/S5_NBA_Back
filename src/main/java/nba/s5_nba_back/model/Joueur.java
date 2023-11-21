package nba.s5_nba_back.model;

import jakarta.persistence.*;
import org.springframework.jmx.export.annotation.ManagedMetric;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_joueur;
    String Nom;

    String Poste;

    public String getPoste() {
        return Poste;
    }

    public void setPoste(String poste) {
        Poste = poste;
    }

    public Joueur(Long id_joueur, String nom, String poste, Equipe equipe) {
        this.id_joueur = id_joueur;
        Nom = nom;
        Poste = poste;
        this.equipe = equipe;
    }

    @ManyToOne
    @JoinColumn(name = "id_equipe")
    Equipe equipe;


    public Long getId() {
        return id_joueur;
    }

    public void setId(Long id) {
        this.id_joueur = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Joueur() {
    }

    public Joueur(String nom, Equipe equipe) {
        Nom = nom;
        this.equipe = equipe;
    }

    public Joueur(Long id, String nom, Equipe equipe) {
        this.id_joueur = id;
        Nom = nom;
        this.equipe = equipe;
    }

}
