# POM Project - Jerkins Practice

### Descripción del proyecto: Práctica POM

Estás automatizando la aplicación web https://www.saucedemo.com/.
Cree un nuevo proyecto Selenium - Java - TestNG y configúrelo para iniciar y probar la página web requerida en el navegador Chrome. Implementa en tu framework los siguientes escenarios, cada uno como una prueba diferente:

- Comprar un producto: Sigue el flujo de compra completo de la página, seleccionando un producto aleatorio, agregándolo al carrito, agregando los datos personales y verifica que estás llegando exitosamente a la página “Gracias por tu compra”.
- Eliminar elementos del carrito de compras: Agregue 3 elementos diferentes al carrito de compras, ingrese a la página del carrito, elimínelos y verifique que el carrito de compras esté vacío.
- Cerrar sesión: intente cerrar sesión y verifique si se le redirige correctamente a la página de inicio de sesión.

Para esta implementación, siga las reglas que se describen a continuación:

- El modelo de objetos de página debe implementarse correctamente, asegurándose de reutilizar ciertos elementos y definir páginas base según sea necesario para métodos y elementos comunes.
- Se requiere fábrica de páginas.
- Las anotaciones anteriores deben usarse para gestionar las condiciones previas. Cualquier otra anotación requerida se puede implementar según sea necesario.
---

### Pasos para ejecutar los test con Jenkins:

- Crear un nuevo Item, agregarle un nombre y seleccionar la opcion Pipeline.
- Luego ir a Pipeline y seleccionar 'Pipeline script from SCM'.
- En SCM seleccionar Git y agregar la url de nuestro repositorio 'https://github.com/chrxs0314/jerkinsPractice.git'.
- Cambiar el nombre de la rama, para este proyecto la rama debe ser cambiada de '/master' a '/main'.
- En Script Path colocar 'Jenkins/jenkinsfile'
- Dar Click en Save.

Una vez configurado nuestro proyecto en Jenkins es momento de configurar nuestro plugin de Allure:

- En nuestro Dashboard ir a la opcion Manage Jenkins
- Seleccionar Plugins.
- Seleccionar Available plugins y buscar el plugin 'Allure Jenkins Plugin'
- Instalar nuestro plugin

El siguiente paso es configurar nuestro Allure commandLine

- En nuestro Dashboard ir a la opcion Manage Jenkins.
- Seleccionar la opcion Tools.
- Al final de esta pagina encontraremos la opcion 'Allure Commandline installations'
- Click en 'Add Allure Commandline'
- Agregar un nombre, seleccionamos la version 2.25.0
- Click en save

Con nuestro proyecto configurado en Jenkins y nuestro plugin de Allure installado junto con su commandline, en el Dashboard de jenkins al acceder al item que hemos creado podremos ver nuestra pantalla del proyecto ya listo para crear nuestro primer build. Damos click en la opcion 'Build now' y veremos la ejecución de nuestro proyecto en jenkins. 
Una vez comience la ejecucion veremos como nuestro Build pasara por diferentes etapas como:
- Declarative: Checkout SCM
- Declarative: Tool Install
- Checkout
- Preparar Entorno
- Ejecutar pruebas
- Generar Reporte de Allure
- Recopilar Resultados
- Declarative Post Actions

Una vez finalizada la ejecucion de todos los pasos veremos que el estado del proyecto y el estado de nuestras pruebas. Gracias a la implementacion de Allure tenemos una manera mas cómoda de leer y entender el estado de nuestros test.
Para acceder a la vista del reporte en Allure solo debemos acceder a nuestro Build haciendo click en su numero identificador y luego accedemos a la opcion Allure Report que debe aparecernos en el panel Izquierdo. Esto abrira una pestaña en nuestro navegador con el estado detallado de nuestras pruebas.