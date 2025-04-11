# 🍴 Restaurant Review Platform  

Welcome to the **Restaurant Review Platform** — a cutting-edge web application that revolutionizes how food enthusiasts discover and share dining experiences. Built with modern technologies, our platform combines intuitive design with powerful search capabilities to connect diners with perfect restaurants.

<p align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
  <img src="https://img.shields.io/badge/Next.js-000000?style=for-the-badge&logo=next.js&logoColor=white">
  <img src="https://img.shields.io/badge/Elasticsearch-005571?style=for-the-badge&logo=elasticsearch&logoColor=white">
  <img src="https://img.shields.io/badge/Keycloak-2C7FBF?style=for-the-badge&logo=keycloak&logoColor=white">
</p>

---

## 📋 Table of Contents

- [🍽️ Project Summary](#️-project-summary)
- [🌟 Features](#-features)
- [🏗️ Architecture Overview](#-architecture-overview)
- [🧰 Tech Stack](#-tech-stack)

---

## 🍽️ Project Summary

The **Restaurant Review Platform** empowers users to:

- 📍 **Discover** local restaurants using location-aware search
- 🍜 **Read** trusted reviews from real diners
- ✏️ **Share** their own experiences with detailed reviews and ratings
- 📸 **Upload** images of meals and restaurant ambiance

Whether you're craving sushi, pizza, or a hidden brunch spot, our platform helps foodies find the right place to eat — with community insights and smart technology.

---

## 🌟 Features

| 🍱 Feature                  | 🍴 Description                                                                 |
|----------------------------|------------------------------------------------------------------------------|
| 🔐 Authentication           | Secure login/logout via Keycloak with OAuth 2 & OpenID Connect               |
| 🗺️ Geospatial Search         | Find nearby restaurants using GPS-based queries                              |
| 🧠 Fuzzy Search              | Smart search that handles typos and suggests relevant results                 |
| 📷 Image Upload             | Let users showcase dishes and dining moments with photos                     |
| 📝 Review Management        | Add, update, or delete reviews with titles, ratings, and more                |
| ⭐ Rating System            | 5-star review system for honest, detailed ratings                             |
| 🍳 Sorting & Filtering       | Filter by category, cuisine, price, ratings, and more                        |
| 🧾 Business Logic           | Handles user permissions, validations, and moderation                        |

---

## 🏗️ Architecture Overview

The platform consists of four core components:

### 🧁 Frontend — **Next.js**
- 🖥️ Built with React and Tailwind CSS
- Responsive UI and SSR (Server-Side Rendering)
- Communicates via RESTful APIs

### 🧩 Backend — **Spring Boot**
- ⚙️ Central business logic hub
- Manages data flow, review validation, and permissions
- Secured via Spring Security and integrated with Keycloak

### 🗃️ Data Store — **Elasticsearch**
- 🔍 Serves as the primary database
- Supports geospatial, full-text, and fuzzy searches
- Indexes restaurants and reviews for fast access

### 🧑‍🍳 Authentication — **Keycloak**
- 🛡️ Handles user sign-up, login, and role-based access
- Implements OAuth 2.0 and OpenID Connect standards
- Integrates directly with Spring Security

---

## 🧰 Tech Stack

| 🔧 Layer     | 🚀 Technology                                                                 |
|-------------|-------------------------------------------------------------------------------|
| 🌐 Frontend | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/nextjs/nextjs-original.svg" width="20" height="20"> Next.js, <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/react/react-original.svg" width="20" height="20"> React, <img src="https://upload.wikimedia.org/wikipedia/commons/9/95/Tailwind_CSS_logo.svg" width="80" height="20"> Tailwind CSS |
| 🔙 Backend  | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" width="20" height="20"> Spring Boot, <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" width="20" height="20"> Java |
| 🔐 Auth     | <img src="https://upload.wikimedia.org/wikipedia/commons/b/b4/Logo_of_Keycloak.svg" width="60" height="20"> Keycloak, OAuth2, OpenID Connect |
| 💽 Database | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/elasticsearch/elasticsearch-original.svg" width="20" height="20"> Elasticsearch |
| ⚙️ DevOps   | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-original.svg" width="20" height="20"> Docker, Docker Compose |

---

⭐ **Star this repo** if you love food and great code! Got questions or ideas? Feel free to open issues or pull requests.
