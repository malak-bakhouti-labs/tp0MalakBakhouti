package ma.formations.malak.tp0malakbakhouti.service;

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;

/**
 * Classe de service pour les modificateurs de question.
 * Un modificateur de question prend en entrée une question et retourne
 * la question modifiée.
 */
@Dependent // Portée CDI pour rendre la classe injectable par CDI dans les autres classes.
// Portée Dependent : l'instance sera supprimée quand la classe qui l'a injectée sera supprimée.
public class GenerateurReponse implements Serializable { // Car CDI peut mettre l'instance en mémoire secondaire.
    /**
     * Compte le nombre de mots dans la question de l'utilisateur.
     *
     * @param question La question saisie.
     * @param roleSysteme Le rôle système, conservé pour la compatibilité.
     * @return La question et son nombre de mots.
     */
    public String genererReponse(String question, String roleSysteme) {
        String texte = question.trim();

        int nombreMots = texte.isEmpty()
                ? 0
                : texte.split("\\s+").length;

        return "Question : " + question
                + "\nNombre de mots : " + nombreMots;
    }
}
