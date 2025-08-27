# 🌿 Spring Boot Profiles Explained in Hindi 🚀

Welcome to **[Backend Verse](https://www.youtube.com/@BackendVerse)**! 🎥  
In this video, we dive deep into **Spring Boot Profiles** and learn how to manage multiple environments like development, testing, and production without manually changing configurations.

👉 Watch the full tutorial series here:  
[Spring Boot Tutorial Series in Hindi 🌿](https://www.youtube.com/playlist?list=PLdUn31k8Q721HBdMQzyl403o-bUtd31Wb)

---

## ▶ Watch the Tutorial

📺 **[Spring Boot Profiles in Hindi 🚀 | Manage Dev, Test & Prod Config Easily | REST API Tutorial 🌿](https://youtu.be/O5YMlAjJ7VM)**

---

---

## 📝 What You’ll Learn
📌 What are Spring Boot Profiles and why we use them  
⚡ How to configure environment-specific property files  
🏷️ Using `application-dev.properties`, `application-test.properties`, `application-prod.properties`  
🔑 Activating profiles using `spring.profiles.active`  
💡 Real-world example: Switching DB configs (H2 for dev, PostgreSQL for prod)  
🛠️ Using `@Profile` annotation for environment-specific beans  

---

## 🎯 Why Watch This Video?
Profiles help you:  
✅ Keep clean & separate configurations for each environment  
✅ Avoid manual config switching errors  
✅ Deploy production-ready apps with confidence  
✅ Build flexible and scalable backend systems  

---

## 🔧 Tools & Technologies Used
- Java 17  
- Spring Boot  
- Gradle  
- IntelliJ IDEA  
- Postman  

---

## 💻 Real-World Example (Used in this Video)
We implemented **RoleService** with environment-specific logic:

```java
public interface RoleService {
    List<String> getRoles();
}

@Component
@Profile("prod")
public class RoleServiceImplV1 implements RoleService {
    @Override
    public List<String> getRoles() {
        return List.of("V1 Develop Roles");
    }
}

@Profile("dev")
@Component
public class RoleServiceImplV2 implements RoleService {
    @Override
    public List<String> getRoles() {
        return List.of("Testing New Features Role");
    }
}
````

👉 Based on the active profile, Spring Boot automatically loads the right bean.

---

---

## 🔗 Example APIs

Below are some sample `curl` commands you can test directly:

### 1️⃣ API to check the dynamic configuration
```bash
curl --location 'http://localhost:8080/demo'
````

### 2️⃣ API to check the spring boot profile working for different environment as per configuration

```bash
curl --location 'http://localhost:8080/demo/roles'
```

---

## ▶ Watch the Tutorials

📺 **Previous Video:**  
[Spring Boot Interceptor Explained in Hindi 🚀 | Role-Based Auth with Custom Annotation 🌿 REST API](https://youtu.be/U4ehIEkIEtQ)

---

## 📌 What’s Next in This Series?

In the next video, we’ll explore another powerful Spring Boot feature:

🌱 **Spring Boot Configuration** – Manage configs using `@Configuration`, `@ConfigurationProperties`, and externalized property management.

👉 A must-watch to make your backend **clean, maintainable, and production-ready!** 🚀

---

## 📢 Don’t Miss Out!

👍 Like this video
💬 Comment your questions / feedback
🔔 Subscribe to **[Backend Verse](https://www.youtube.com/@BackendVerse)** for more Spring Boot tutorials in Hindi

---