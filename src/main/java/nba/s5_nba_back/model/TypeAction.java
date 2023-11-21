package nba.s5_nba_back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TypeAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_TypeAction;
    String NomAction;
    double points;

    public TypeAction() {
    }

    public TypeAction(String nomAction, double points) {
        NomAction = nomAction;
        this.points = points;
    }

    public TypeAction(Long id_TypeAction, String nomAction, double points) {
        this.id_TypeAction = id_TypeAction;
        NomAction = nomAction;
        this.points = points;
    }

    public Long getId_TypeAction() {
        return id_TypeAction;
    }

    public void setId_TypeAction(Long id_TypeAction) {
        this.id_TypeAction = id_TypeAction;
    }

    public String getNomAction() {
        return NomAction;
    }

    public void setNomAction(String nomAction) {
        NomAction = nomAction;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
}
