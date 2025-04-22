# 📝 Simple Task Manager – Spring Boot

Ovo je jednostavna REST API aplikacija za upravljanje zadacima (taskovima), napravljena kao edukativni projekat za učenje osnova Spring Boot-a, kao što su:

- Spring Core (IoC, Dependency Injection, Bean management)
- REST API sa `@RestController`
- Upravljanje podacima u memoriji bez baze podataka

## 📦 Tehnologije i alati

- Java 24
- Spring Boot
- Maven
- IntelliJ IDEA
- Postman (za testiranje API-ja)

## 📚 Arhitektura

Aplikacija je organizovana u tri glavna sloja:

- **Model** – `Task.java`: Predstavlja entitet zadatka sa poljima `id`, `title` i `completed`.
- **Service** – `TaskService.java`: Sadrži poslovnu logiku – dodavanje, brisanje i ažuriranje taskova.
- **Controller** – `TaskController.java`: REST API sloj koji prihvata HTTP zahteve i koristi servisni sloj za obradu.

Podaci se čuvaju u memoriji pomoću `HashMap`, bez upotrebe baze podataka.

## 🚀 Kako pokrenuti projekat

1. Kloniraj repozitorijum:
   ```bash
   git clone https://github.com/ime/prezime/simple-task-manager.git
