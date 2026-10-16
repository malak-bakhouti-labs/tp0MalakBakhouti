package ma.formations.malak.tp0malakbakhouti;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("bb")
@RequestScoped
public class Bb {

    private String nom = "Malak";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
