# Requerimiento Suplementario: Implementar un sistema de autenticación que requiera credenciales (nombre de usuario y contraseña) para el acceso al sistema (RNF-02)

## Estatus

Propuesto

## Contexto

Para garantizar la seguridad del sistema y proteger la información sensible de los estudiantes, es fundamental implementar un mecanismo de autenticación que restrinja el acceso solo a usuarios autorizados. Este sistema debe verificar la identidad de los usuarios antes de permitirles interactuar con el sistema.

## Requerimiento

El sistema debe implementar un mecanismo de autenticación que requiera credenciales (nombre de usuario y contraseña) para permitir el acceso, verificando la identidad del usuario de forma segura antes de otorgar acceso a las funcionalidades del sistema.

## Justificación

La autenticación es necesaria para:

- Evitar accesos no autorizados que puedan comprometer la integridad y seguridad de la información del sistema.
- Asegurar que solo los usuarios legítimos interactúen con las funciones y datos del sistema.
- Proteger información confidencial y prevenir usos indebidos o modificaciones no permitidas.

## Implicaciones

La implementación de la autenticación:

- Incrementará la seguridad del sistema y protegerá los datos de los usuarios.
- Requerirá el uso de prácticas seguras de manejo de contraseñas y gestión de sesiones.

## Alternativas Consideradas

1. Acceso sin autenticación: Rechazada porque permitiría el acceso de personas no autorizadas y pondría en riesgo la seguridad del sistema.
2. Autenticación mediante terceros (OAuth): Considerada, pero descartada para la fase inicial debido a la simplicidad y control del desarrollo interno.

## Decisión

Se optó por implementar un sistema de autenticación propio en Spring Boot con cifrado de contraseñas y manejo seguro de sesiones.

## Requerimientos funcionales implicados

- CU-01RF-01: Registrar Estudiantes
- CU-01RF-07: Registrar Doctores

## Referencias

- Spring Security Documentation: https://spring.io/projects/spring-security
- OWASP Authentication Cheat Sheet: https://cheatsheetseries.owasp.org/cheatsheets/Authentication_Cheat_Sheet.html

## Documento Preparado Por:

Luis Irola, Wanda F y Jose Montero.

## Fecha:

5-11-2024
