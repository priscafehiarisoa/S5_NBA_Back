package nba.s5_nba_back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
public class Saison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_saison;

    Timestamp dateDebut;
    Timestamp datdeFin;

    public Saison() {
    }

    public Saison(Timestamp dateDebut, Timestamp datdeFin) {
        this.dateDebut = dateDebut;
        this.datdeFin = datdeFin;
    }

    public Saison(Long id_saison, Timestamp dateDebut, Timestamp datdeFin) {
        this.id_saison = id_saison;
        this.dateDebut = dateDebut;
        this.datdeFin = datdeFin;
    }

    public Long getId_saison() {
        return id_saison;
    }

    public void setId_saison(Long id_saison) {
        this.id_saison = id_saison;
    }

    public Timestamp getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Timestamp dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Timestamp getDatdeFin() {
        return datdeFin;
    }

    public void setDatdeFin(Timestamp datdeFin) {
        this.datdeFin = datdeFin;
    }
}
