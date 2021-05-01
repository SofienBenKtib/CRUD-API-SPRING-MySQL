package com.sof.backendproj;


import javax.persistence.*;

@Entity
@Table(name= "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String motdepasse;
    public Utilisateur(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public Utilisateur(int id, String nom, String prenom, String email, String motdepasse){
        super();
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.motdepasse=motdepasse;
    }
}
