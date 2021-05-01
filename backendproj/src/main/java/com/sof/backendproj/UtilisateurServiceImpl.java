package com.sof.backendproj;
import com.sof.backendproj.UtilisateurInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;





@Service

public class UtilisateurServiceImpl implements UtilisateurInterface{

    @Autowired
    private UtilisateurRepository utilisateurRepo;
    @Override
    public Utilisateur saveUser(Utilisateur utilisateur){
        return utilisateurRepo.save(utilisateur);
    }

    @Override
    public Utilisateur updateUser(Utilisateur utilisateur) {
        return utilisateurRepo.save(utilisateur);
    }

    @Override
    public List<Utilisateur> findAllUsers() {
        return (List<Utilisateur>) utilisateurRepo.findAll();
    }

    @Override
    public void deleteUser(int id) {
        utilisateurRepo.deleteById(id);
    }
}
