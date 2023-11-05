Lo que yo podría considerar y basandome en la experiencia de guías estos son los puntos que rescatamos para una infraestructura de paneles solares siguiendo el OWASP Top 10:

1. Autenticación y Control de Acceso: Implementa autenticación segura y control de acceso adecuado, incluyendo hashing y salting de contraseñas y roles de usuario.

2. Seguridad de Datos: Encripta datos confidenciales y restringe el acceso solo a personal autorizado.

3. Prevención de Inyección de SQL: Utiliza consultas seguras y ORM para evitar inyecciones de SQL.

4. Prevención de XSS: Escapa y valida datos de entrada para evitar ataques XSS, considera el uso de Content Security Policy.

5. Seguridad de APIs: Protege las APIs con autenticación sólida y autorización adecuada, y considera el uso de cortafuegos de aplicaciones web.

6. Gestión de Sesiones: Asegura una gestión segura de sesiones para evitar la suplantación de sesiones.

7. Seguridad en Contenedores y Orquestación: Configura contenedores y Kubernetes de manera segura, aplicando políticas y actualizando imágenes de contenedores.

8. Auditoría y Monitorización: Implementa sistemas de auditoría y monitorización para detectar comportamientos anómalos.

9. Gestión de Parches y Actualizaciones: Mantén componentes y software actualizados y aplica parches de seguridad regularmente.

10. Educación y Concienciación: Educa a todo el personal sobre buenas prácticas de seguridad y cómo reportar incidentes.