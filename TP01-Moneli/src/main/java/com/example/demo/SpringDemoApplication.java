package main.java.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Application Spring Boot - TP01 HelloWorld
 * 
 * @SpringBootApplication = l'app démarre via Spring
 * @RestController = les méthodes retournent du contenu REST (pas des pages HTML)
 */
@SpringBootApplication
@RestController
public class SpringDemoApplication {

    /**
     * Point d'entrée de l'application
     * Spring lance tout ici
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

    /**
     * Endpoint simple - http://localhost:8080/hello
     * Retourne un simple message de bienvenue
     */
    @GetMapping("/hello")
    public String hello() {
        return "Bonjour Moneli! 👋 Bienvenue dans mon TP01 Spring Boot!";
    }

    /**
     * Endpoint avec paramètre optionnel
     * http://localhost:8080/greet
     * http://localhost:8080/greet?name=Jean
     * 
     * Par défaut dit bonjour à Moneli, sinon au paramètre passé
     */
    @GetMapping("/greet")
    public String greet(@RequestParam(required = false, defaultValue = "Moneli") String name) {
        if (name.equals("Moneli")) {
            return "Salut Moneli! 🚀 C'est ton TP01!";
        }
        return "Bonjour " + name + "! Bienvenue chez Moneli AGAMAKA! 🎉";
    }

    /**
     * Endpoint info - http://localhost:8080/info
     * Affiche les infos du projet
     */
    @GetMapping("/info")
    public String info() {
        return "TP01 - Spring Boot HelloWorld par Moneli AGAMAKA IRA2026";
    }

    /**
     * Endpoint qui retourne du JSON
     * http://localhost:8080/user
     * 
     * Spring convertit automatiquement l'objet en JSON
     */
    @GetMapping("/user")
    public User user() {
        return new User("Moneli", "AGAMAKA", 26);
    }

    /**
     * Classe simple pour représenter un utilisateur
     * Spring la convertira en JSON automatiquement
     */
    public static class User {
        public String firstName;
        public String lastName;
        public int age;

        public User(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }
}