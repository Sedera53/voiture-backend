package com.example.springsecurity.model;

import com.example.springsecurity.user.User;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idannonce;

    @ManyToOne
    @JoinColumn(name = "idcategorie")
    Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "idmarque")
    Marque marque;

    String modele;

    String matricule;

    Date annee_fabrication;

    String image;

    String detail;
    @Column(columnDefinition = "int default 0")
    int etat;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    User utilisateur;

    @Column(columnDefinition = "int default 0")
    int validation;

    double prix;

    public Annonce() {
    }

    public Annonce(int idannonce, Categorie categorie, Marque marque, String modele, String matricule, Date annee_fabrication, String image, String detail, int etat, User utilisateur, int validation, double prix) {
        this.idannonce = idannonce;
        this.categorie = categorie;
        this.marque = marque;
        this.modele = modele;
        this.matricule = matricule;
        this.annee_fabrication = annee_fabrication;
        this.image = image;
        this.detail = detail;
        this.etat = etat;
        this.utilisateur = utilisateur;
        this.validation = validation;
        this.prix = prix;
    }

    public int getIdannonce() {
        return idannonce;
    }

    public void setIdannonce(int idannonce) {
        this.idannonce = idannonce;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getAnnee_fabrication() {
        return annee_fabrication;
    }

    public void setAnnee_fabrication(Date annee_fabrication) {
        this.annee_fabrication = annee_fabrication;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public User getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(User utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getValidation() {
        return validation;
    }

    public void setValidation(int validation) {
        this.validation = validation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
