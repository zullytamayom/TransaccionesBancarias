# Sistema de Transacciones Bancarias 🏦

Este proyecto es una aplicación backend diseñada para gestionar transacciones bancarias de manera segura y eficiente. Desarrollado como parte de un proceso de fortalecimiento técnico y preparación para entornos financieros (como BBVA), el sistema permite la administración de cuentas y el procesamiento de movimientos financieros como depósitos, retiros y transferencias.

## 🚀 Características Principales

* **Gestión de Cuentas:** Creación y consulta de cuentas bancarias asociadas a un usuario.
* **Procesamiento de Transacciones:**
    * **Depósitos:** Incremento de saldo de forma segura.
    * **Retiros:** Validación de fondos suficientes antes de procesar la salida.
    * **Transferencias:** Movimientos entre cuentas propias o de terceros con integridad transaccional.
* **Validaciones de Negocio:** Verificación de saldo, existencia de cuentas y estados de cuenta activos.
* **Historial de Movimientos:** Registro detallado de cada operación para auditoría y consulta del usuario.
* **Seguridad:** Implementación de mejores prácticas para la protección de datos financieros.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17+
* **Framework:** Spring Boot (Spring Web, Spring Data JPA, Spring Security)
* **Base de Datos:** PostgreSQL / H2 (para pruebas)
* **Gestor de Dependencias:** Maven
* **Herramientas:** Git, Docker (para Oracle)

## 📋 Requisitos Previos

Antes de comenzar, asegúrate de tener instalado:
* Java JDK 17 o superior.
* Maven 3.6+.
* Una instancia de PostgreSQL (o configurar H2 en el perfil de desarrollo).

## 🔧 Instalación y Configuración

1.  **Clonar el repositorio:**

    git clone [https://github.com/zullytamayom/TransaccionesBancarias.git](https://github.com/zullytamayom/TransaccionesBancarias.git)
    cd TransaccionesBancarias

2.  **Configurar las variables de entorno:**
    Ajusta el archivo `src/main/resources/application.properties` con tus credenciales de base de datos.

3.  **Compilar el proyecto:**
    ```bash
    mvn clean install
    ```

4.  **Ejecutar la aplicación:**
    ```bash
    mvn spring-boot:run
    ```



| 