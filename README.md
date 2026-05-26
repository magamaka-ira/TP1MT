# 🚀 TP01 - Spring Boot HelloWorld REST API

> **Application REST simple avec Spring Boot** - Moneli AGAMAKA | IRA2026

---

## 🎯 Objectif

Créer une application Spring Boot exposant 4 endpoints REST simples.

---

## 📡 Endpoints

| Endpoint | Réponse |
|----------|---------|
| `/hello` | `Bonjour Moneli! 👋 Bienvenue dans mon TP01 Spring Boot!` |
| `/greet` | `Salut Moneli! 🚀 C'est ton TP01!` |
| `/info` | `TP01 - Spring Boot HelloWorld par Moneli AGAMAKA IRA2026` |
| `/user` | `{"firstName":"Moneli","lastName":"AGAMAKA","age":26}` |

---

## 🚀 Lancer l'Application

```bash
cd TP01-Moneli
mvn spring-boot:run
```

Puis ouvrir navigateur:
```
http://localhost:8080/hello
```

---

## 📁 Structure

```
TP01-Moneli/
├── pom.xml
├── README.md
├── .gitignore
└── src/main/
    ├── java/com/example/demo/
    │   └── SpringDemoApplication.java
    └── resources/
        └── application.properties
```

---

## 💻 Technologies

- **Spring Boot 3.1.5** - Framework
- **Java 17** - Langage
- **Maven** - Build

---

## 📚 Concepts

✅ @SpringBootApplication - Démarre l'app Spring Boot  
✅ @RestController - Expose les endpoints REST  
✅ @GetMapping - Mappe les requêtes HTTP GET  
✅ @RequestParam - Récupère les paramètres  
✅ JSON Auto-Conversion - Spring convertit automatiquement  

---

## 📤 Push sur GitHub

```bash
git init
git add .
git commit -m "TP01: Spring Boot HelloWorld - Moneli AGAMAKA"
git remote add origin https://github.com/YOUR_USERNAME/TP01-Moneli.git
git branch -M main
git push -u origin main
```

---


## Mon test à moi :) 

<img width="879" height="180" alt="image" src="https://github.com/user-attachments/assets/5b177dd3-505a-46d4-9749-0d40c9294cc4" />
