Escribir las pruebas unitarias para: $ARGUMENTS

Convenciones de pruebas:
* Usa las librerias mockito-kotlin y JUnit
* Todas las clases de prueba deben anotarse con:
    `@RunWith(MockitoJUnitRunner.StrictStubs.class)`
* Esta anotación va siempre **antes** de la declaración de la clase
* No usar `MockitoAnnotations.openMocks(this)` en `@Before`, el runner lo maneja
* Los mocks innecesarios están prohibidos por la política StrictStubs
* Instala las librerias que hagan falta y solo las que sean necesarias
* Coloca los archivos de prueba en un directorio "src/test"
* Nombra los archivos de prueba como [filename]Test.kt
* Los nombres de las pruebas deberán de estar separados por espacios, no uses '_'
* Solo la primer letra en la oración para describir el caso que se esta probando deberá iniciar con mayuscula
* Los comentarios deben ser en ingles

Cobertura:
* Probar los casos positivos y negativos
