# 🦷 Clínica Odontológica

Bienvenido al proyecto **Clínica Odontológica**, una aplicación web desarrollada en **Java Web** usando **Servlets** y **JSP**.

---

## 🚀 ¿Cómo usar el sistema?

- Levantar el servidor (por ejemplo, Apache Tomcat).
- Acceder en el navegador a:

http://localhost:8081/clinica/loguin.jsp


- Usuario de prueba para ingresar:

- **Usuario**: `dolo`
- **Contraseña**: `123`

✅ Si los datos son correctos, redirige a `index.jsp`.

❌ Si se intenta entrar directamente a `index.jsp` sin hacer login, redirige a `errorLogin.jsp`.

---

## 🛠️ Tecnologías utilizadas

- Java Web (Servlets + JSP)
- HTML5
- CSS3
- Bootstrap
- NetBeans IDE

---

## 📂 Estructura principal del proyecto

clinica/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── config/         # Configuraciones generales
│   │   │   ├── persistencia/   # Controladores JPA (manejo de entidades)
│   │   │   ├── models/         # Clases de entidades como Paciente, etc.
│   │   │   ├── repositories/   # DAOs o conexiones a la base de datos
│   │   │   ├── servlets/       # Todos los servlets como SVLogin, SVPaciente
│   │   │   └── logica/         # Lógica de negocio (puede fusionarse con servicios)
│   │   └── resources/
│   │       ├── application.properties # Configuraciones de base de datos, etc.
│   └── webapp/
│       ├── login.jsp
│       ├── index.jsp
│       ├── errorLogin.jsp
│       ├── componentes/        # Head, header, body, footer, etc.
├── docs/                       # Documentación 
└── pom.xml                     # Dependencias Maven


---

## 👨‍💻 Autor

- **María Dolores Parral** - Proyecto académico

---

## 🎯 Objetivo

Desarrollar una aplicación de gestión de pacientes para una clínica odontológica, con autenticación básica de usuarios y administración de datos.

---
