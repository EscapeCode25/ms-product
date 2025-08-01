# 🛍️ Microservicio: Productos

Este microservicio forma parte de la arquitectura de SCAPE y se encarga de gestionar el catálogo de productos. Está desarrollado con **Spring Boot 3.5.4**, persiste datos en **MongoDB** y expone su documentación mediante **Swagger (Springdoc OpenAPI v2)**.

![Estado](https://img.shields.io/badge/estado-beta-blueviolet?style=for-the-badge)

---

## 🚀 Tecnologías

- Java 17
- Spring Boot 3.5.4
- Spring Data MongoDB
- Springdoc OpenAPI (Swagger UI)
- Docker & Docker Compose
- Maven

---

## 📦 Estructura del Proyecto

![Estado](https://img.shields.io/badge/estado-pendiente-orange?style=for-the-badge)


---

## 🐳 Ejecución con Docker Compose (local por microservicio)

### ▶️ ¿Qué levanta este archivo?

- Contenedor de MongoDB con base `productdb` y usuario `product_user`
- Microservicio `ms-product` con el perfil `docker` activo
- Ambos conectados en una red Docker compartida
### 🚀 Comando para ejecutarlo:

Desde la carpeta `ms-product/`:

```bash
docker compose up --build
```

## 🧪 Endpoints disponibles

Una vez en ejecución, accede a la documentación Swagger aquí:

👉 [http://localhost:9000/swagger-ui.html](http://localhost:9000/swagger-ui.html)