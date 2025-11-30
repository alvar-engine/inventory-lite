# Inventory Lite

## Descripción
Inventory Lite es una aplicación de ejemplo desarrollada en **Spring Boot** que permite la gestión de productos mediante una **API REST**.  
El proyecto implementa un CRUD completo (Create, Read, Update, Delete) de productos, siguiendo buenas prácticas de estructura de proyecto y desarrollo modular (Controller → Service → Repository → Model).

---

## Estado del Proyecto
Actualmente el proyecto ha completado las siguientes funcionalidades:

- Configuración inicial del proyecto Spring Boot (Issue 1)
- Implementación del modelo `Product` con campos `id`, `name` y `price` (Issue 2)
- Implementación de los endpoints REST para `Product`:
  - `GET /api/products` → Listar todos los productos (Issue 3)
  - `POST /api/products` → Crear un producto (Issue 4)
  - `GET /api/products/{id}` → Obtener un producto por ID (Issue 5)
  - `PUT /api/products/{id}` → Actualizar un producto existente (Issue 6)
  - `DELETE /api/products/{id}` → Eliminar un producto (Issue 6)
- Pruebas funcionales realizadas mediante **curl** para verificar todos los endpoints
- *Estructura de proyecto organizada en paquetes*:  
```
    src/main/java/com/alvar/demoapp
    ├── controller
    ├── service
    ├── repository
    └── model
```

---

## Tecnologías Utilizadas
- Java 21
- Spring Boot 3.x
- Spring Data JPA
- Jakarta Persistence
- Maven
- Base de datos H2 (para pruebas y desarrollo)

---

## Cómo Ejecutar el Proyecto

**1. Clonar el repositorio**:
```bash
git clone https://github.com/alvar-engine/inventory-lite.git
cd inventory-lite
```

**2. Crear y cambiar a la rama de desarrollo si corresponde**:
```bash
git checkout dev
```

**3. Ejecutar el proyecto con Maven**:
```bash
./mvnw spring-boot:run
```

**4. Verificar que la API está funcionando accediendo a** http://localhost:8080/api/products **o usando curl**:
```bash
# Listar todos los productos
curl -X GET http://localhost:8080/api/products

# Crear un producto
curl -X POST http://localhost:8080/api/products -H "Content-Type: application/json" -d "{\"name\":\"Polera X\",\"price\":12990}"

# Actualizar un producto
curl -X PUT http://localhost:8080/api/products/1 -H "Content-Type: application/json" -d "{\"name\":\"Producto Actualizado\",\"price\":15990}"

# Eliminar un producto
curl -X DELETE http://localhost:8080/api/products/1
```
---

## Buenas Prácticas Aplicadas

- Separación de responsabilidades (Controller, Service, Repository)

- Uso de Optional para manejo seguro de resultados de BD

- Endpoints REST claros y consistentes

- Validación de datos básica

- Historial de commits claro y estructurado con convenciones feat, fix, chore, etc.

- Uso de ramas feature para desarrollo incremental y Pull Requests para integración

---

## Próximas Funcionalidades / To-Do

- Issue 7 → Implementar paginación y filtrado en GET /api/products

- Issue 8 → Validación de datos de entrada más robusta

- Issue 9 → Documentación API con Swagger/OpenAPI

- Issue 10 → Integración con base de datos externa (MySQL/PostgreSQL)

- Issue 11 → Manejo de errores y excepciones globales

- Issue 12 → Pruebas unitarias y de integración

--- 

### Licencia

Este proyecto es para fines educativos y de aprendizaje.

