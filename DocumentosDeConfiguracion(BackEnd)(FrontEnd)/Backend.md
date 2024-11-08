# Guía de configuración para Backend

## Introducción

### Propósito
Este documento describe los pasos necesarios para configurar el entorno de desarrollo del backend en el proyecto. El objetivo es asegurar que todos los miembros del equipo puedan ejecutar el backend de manera uniforme en sus entornos locales, facilitando la colaboración y manteniendo la consistencia en el desarrollo del proyecto.
### Alcance
Este documento se enfoca exclusivamente en la configuración del backend del proyecto. Incluye la instalación de dependencias, configuración de bases de datos, variables de entorno y otros ajustes necesarios para la ejecución y desarrollo del backend.
### Requisitos Previos

**Paso 1:** Instalar Java Development Kit (JDK) 21
1. **Descargar JDK 21**
    - Descarga JDK 21 desde Oracle o utiliza una versión de código abierto como OpenJDK desde AdoptOpenJDK.
2. **Instalar JDK 21**
    - **Windows**: Ejecuta el instalador `.exe` y sigue los pasos en pantalla.
    - **MacOS**: Utiliza un administrador de paquetes como Homebrew (`brew install openjdk@21`) o descarga el archivo `.dmg`.
    - **Linux**: Instala OpenJDK usando tu gestor de paquetes. Por ejemplo, en Ubuntu ejecuta:
      ```bash
      sudo apt install openjdk-21-jdk
      ```
3. **Configurar la variable de entorno JAVA_HOME**
    - Asegúrate de que `JAVA_HOME` apunte a la ruta de instalación del JDK.
    - Agrega el binario de Java al `PATH` para que el sistema lo reconozca.

4. **Verificar la instalación**
   ```bash
   java -version
     ```

**Paso 2:** Instalar Maven (versión 3.6 o superior)

**Paso 3:** Instalar Node.js (versión 18 o superior) y npm

**Paso 4:** Instalar PostgreSQL

## Configuración


### Paso 1: Clonar el proyecto desde GitHub

Copiar la URL del repositorio https://github.com/IF-6100-2024/citas-backend
Abrir la terminal y navegar al directorio donde se desea clonar el repositorio
Escribir en la terminal
git clone https://github.com/IF-6100-2024/citas-backend

## Paso 2: Configurar PostgreSQL
Anotar las credenciales necesarias (nombre de usuario, contraseña, nombre de la base de datos y puerto), recomendamos utilizar pgAdmin 4 para visualizar la base de datos, nada mas para conectarse ingresan sus credenciales que configuraron anteriormente.
Deben crear una base de datos por lo cual le dan Click derecho en su servidor de Database (PostgreSQL 17), create y luego crean la base de datos llamada "citas", esto antes de iniciar el proyecto 
## Paso 3: Crear el archivo `.env`
En la raíz del proyecto, agregar un archivo `.env` con las siguientes variables:
  ```env
  DB_HOST=localhost
  DB_PORT=5432
  DB_NAME=jdbo:postgresql://localhost:5432/citas
  DB_USER=postgres
  DB_PASSWORD=1234
```
## Paso 4: Crear carpetas en el proyecto

`java/ucr/ac/ProyectoCitas`: Este es el paquete raíz del proyecto en Java. Se crearán las siguientes subcarpetas dentro de esta ruta:

- `api`: Aquí se almacenan los controladores RESTful.
- `exceptions`: Aquí se encuentran las clases relacionadas con la gestión de excepciones específicas del proyecto.
- `handlers`: Esta carpeta contiene los componentes que gestionan las operaciones principales del negocio. Se subdivide en:
    - `commands/impl`: Incluye las implementaciones de los comandos específicos del dominio.
    - `queries`: Contiene las clases de consultas que permiten realizar búsquedas o recuperar datos específicos de la base de datos.
- `jpa`: Almacena las entidades JPA (Java Persistence API) y repositorios que representan y gestionan los modelos de datos de la base de datos.

## Paso 5: Inicialización del Proyecto

Después de crear todas las carpetas, es necesario asegurarse de que estén presentes los archivos necesarios antes de compilar el proyecto. Verificar que los archivos de configuración (`application.properties` o `application.yml`) estén correctamente configurados en `src/main/resources` para que el proyecto se conecte a la base de datos.

