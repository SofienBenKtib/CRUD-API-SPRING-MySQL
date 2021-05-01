package com.sof.backendproj;

import java.util.List;

public interface UtilisateurInterface {
    //to save a new user
    public Utilisateur saveUser(Utilisateur utilisateur);

    //to update a user
    public Utilisateur updateUser(Utilisateur utilisateur);

    //to fetch all users from db
    public List<Utilisateur> findAllUsers();

    //to delete a user
    public void deleteUser (int id);


}
