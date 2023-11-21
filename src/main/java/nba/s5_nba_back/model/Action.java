package nba.s5_nba_back.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_action;

    @ManyToOne
    @JoinColumn(name = "id_joueur")
    Joueur joueur;

    @ManyToOne
    @JoinColumn(name = "id_match")
    Match match;

    @ManyToOne
    @JoinColumn(name = "id_TypeAction")
    TypeAction typeAction;

    int resultat; //si reussi 1 sinon 0

    Timestamp heure;

    public Action() {
    }

    public Action(Joueur joueur, Match match, TypeAction typeAction, int resultat, Timestamp heure) {
        this.joueur = joueur;
        this.match = match;
        this.typeAction = typeAction;
        this.resultat = resultat;
        this.heure = heure;
    }

    public Action(Long id_action, Joueur joueur, Match match, TypeAction typeAction, int resultat, Timestamp heure) {
        this.id_action = id_action;
        this.joueur = joueur;
        this.match = match;
        this.typeAction = typeAction;
        this.resultat = resultat;
        this.heure = heure;
    }

    public Long getId_action() {
        return id_action;
    }

    public void setId_action(Long id_action) {
        this.id_action = id_action;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public TypeAction getTypeAction() {
        return typeAction;
    }

    public void setTypeAction(TypeAction typeAction) {
        this.typeAction = typeAction;
    }

    public int getResultat() {
        return resultat;
    }

    public void setResultat(int resultat) {
        this.resultat = resultat;
    }

    public Timestamp getHeure() {
        return heure;
    }

    public void setHeure(Timestamp heure) {
        this.heure = heure;
    }
}
