package com.sof.backendproj;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sof.backendproj.Utilisateur;
@Repository
public interface UtilisateurRepository extends CrudRepository <Utilisateur, Integer>{
}
