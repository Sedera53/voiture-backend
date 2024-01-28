package com.example.springsecurity.controller;

import com.example.springsecurity.Service.Annonceservice;
import com.example.springsecurity.model.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Annoncecontroller {
    @Autowired
    private Annonceservice annonceservice;
    @PostMapping("/ajouter_annonce")
    public String insererannonce(@RequestBody Annonce annonce){
        annonceservice.insererannonce(annonce);
        return "new annonce";
    }
    @GetMapping("/liste_annonce")
    public List<Annonce> getallannonce(){
        return annonceservice.getallannonce();
    }

    @GetMapping("/historiques/{idutilisateur}")
    public List<Annonce> getannonce(@PathVariable int idutilisateur){
        return annonceservice.getannonceparutilisateur(idutilisateur);
    }

    @GetMapping("/etatannonce/{etat}")
    public List<Annonce> getetat(@PathVariable int etat){
        return annonceservice.getetat(etat);
    }

    @GetMapping("/validation/{validation}")
    public List<Annonce> getvalidation(@PathVariable int validation){
        return annonceservice.getvalidation(validation);
    }
    @GetMapping("/recherche/{minPrix}/{maxPrix}/{idmarque}/{modele}/{idcategorie}")
    public List<Annonce> rechercheAnnonces(
            @PathVariable double minPrix,
            @PathVariable double maxPrix,
            @PathVariable int idmarque,
            @PathVariable String modele,
            @PathVariable int idcategorie) {
        return annonceservice.recherche(minPrix, maxPrix, idmarque, modele, idcategorie);
    }

    @PatchMapping("/{id}/vendu")
    public ResponseEntity<String> updateEtat(@PathVariable("id") int annonceId, @RequestParam("newEtat") int newEtat) {
        annonceservice.updateEtat(annonceId, newEtat);
        return ResponseEntity.ok("Etat updated successfully");
    }

    @PatchMapping("/{id}/valider")
    public ResponseEntity<String> updatevalidation(@PathVariable("id") int annonceId, @RequestParam("newvalidation") int newvalidation) {
        annonceservice.updatevalidation(annonceId, newvalidation);
        return ResponseEntity.ok("annonce valide!");
    }
}
