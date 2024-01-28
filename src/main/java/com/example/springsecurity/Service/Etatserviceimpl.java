package com.example.springsecurity.Service;

import com.example.springsecurity.model.Etat;
import com.example.springsecurity.repository.Etatrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Etatserviceimpl implements Etatservice {
    @Autowired
    private Etatrepository etatrepository;

    @Override
    public List<Etat> getetat() {
        return etatrepository.findAll();
    }

    @Override
    public Etat addetat(Etat etat) {
        return etatrepository.save(etat);
    }
}
