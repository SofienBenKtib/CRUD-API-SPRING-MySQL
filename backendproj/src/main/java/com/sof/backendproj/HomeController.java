package com.sof.backendproj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin("*")
public class HomeController {
    @Autowired
    private UtilisateurServiceImpl utilisateurServIm;

    //calling save method or to save a new user
    @PostMapping(value = "saveUser")
    public Utilisateur saveUser(@RequestBody Utilisateur utilisateur){
        System.out.println("User save works perfectly !");
        utilisateurServIm.saveUser(utilisateur);
        return utilisateur;
    }

    //finding all users in the db
    @GetMapping(value = "getAllUsers")
    public List<Utilisateur> findAllUsers(){
        return utilisateurServIm.findAllUsers();
    }

    //updating user
    @PutMapping("updateUser")
    public Utilisateur updateUser(@RequestBody Utilisateur utilisateur){
        return utilisateurServIm.updateUser(utilisateur);
    }

    //deleting user
    @DeleteMapping("deleteUser")
    public String deleteUser(@RequestParam int id){
        utilisateurServIm.deleteUser(id);
        return ("User deleted !");
    }
}
