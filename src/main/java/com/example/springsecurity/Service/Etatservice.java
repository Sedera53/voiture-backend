package com.example.springsecurity.Service;

import com.example.springsecurity.model.Etat;

import java.util.List;

public interface Etatservice {
    public List<Etat> getetat();

    public Etat addetat(Etat etat);
}
