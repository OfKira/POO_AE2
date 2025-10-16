# Respuestas Parte Conceptual

1. ¿Qué es la encapsulación y por qué es importante?
La encapsulación es el principio de ocultar los detalles internos de una clase y controlar el acceso a sus datos mediante métodos públicos. Es importante porque:
- Protege la integridad de los datos
- Permite cambiar la implementación interna sin afectar otros componentes
- Facilita el mantenimiento y debugging

2. Diferencia entre método y constructor
Constructor: Se ejecuta al crear un objeto, inicializa atributos, no tiene tipo de retorno
Método: Define comportamientos del objeto, tiene tipo de retorno, se ejecuta cuando se invoca

3. ¿Por qué los atributos deben ser privados?
Para garantizar el principio de encapsulación y controlar cómo se modifican los datos mediante validaciones en los setters.

4. Función de getters y setters
Getters: Permiten leer valores de atributos privados
Setters: Permiten modificar valores con validaciones previas

5. ¿Un setter no debe validar los datos?
Falso. Los setters SIEMPRE deben validar los datos para mantener la integridad del objeto.
