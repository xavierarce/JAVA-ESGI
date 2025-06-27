package Bibliotheque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Decouvertes {

    public static void main(String[] arg) {

        // découvertes des Listes
        List<String> fruits = new ArrayList<>();
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Orange");

        // Accès par index
        String premier = fruits.get(0);
        fruits.set(1, "Poire");

        // Parcours
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Avec un stream
        fruits.stream()
                .filter(f -> f.startsWith("Po"))
                .forEach(System.out::println);

        System.out.println("---------------------- Ensembles -----------------------");
        // découverte des ensembles
        System.out.println("---------------------- HashSet -----------------------");
        Set<Integer> nombres = new HashSet<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(1); // Ignoré car déjà présent
        // Vérification d'appartenance
        if (nombres.contains(2)) {
            System.out.println("2 est présent");
        }
        // itération dans le hashset pour afficher les valeurs
        for (Integer integer : nombres) {
            System.out.println("test: ");
            System.out.println(integer);
        }

        // Union d'ensembles
        Set<Integer> autres = Set.of(3, 4, 5);
        nombres.addAll(autres);

        System.out.println("---------------------- HashMap -----------------------");

        // HashMap
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 100);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);
        // Accès aux valeurs
        int scoreAlice = scores.get("Alice");

        // Parcours des paires clé-valeur
        scores.forEach((nom, score) -> System.out.println(nom + " : " + score));

    }
}
