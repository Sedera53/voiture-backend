package com.example.springsecurity.Service;

import com.example.springsecurity.model.Annonce;

import java.util.List;

public interface Annonceservice {
    public List<Annonce> getallannonce();

    public Annonce insererannonce(Annonce annonce);

    public List<Annonce> getannonceparutilisateur(int utilisateur);
    public List<Annonce> getetat(int etat);

    public List<Annonce> getvalidation(int validation);

    public List<Annonce> recherche(double minPrix,double maxPrix,int idmarque,String modele,int idcategorie);

    public void updateEtat(int annonceId, int newEtat);

    public void updatevalidation(int annonceId, int newvalidation);
}
