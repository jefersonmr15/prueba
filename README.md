# 1) Se debe descargar la ultima versión de katalon studio 
https://download.katalon.com/8.1.0/Katalon_Studio_Windows_64-8.1.0.zip
al ingresar la herramienta pedira un usuario o contraseña se puede optar por crear un nuevo usuario o usar el siguiente usuario
user: jefersonmr15@yopmail.com
pass: Katalon123@

# 2) Para clonar el proyecto 
se debe realizar desde https://github.com/jefersonmr15/prueba.git

# 3) Validar la ejecución de los escenario 
se debe ejecutar el archivo "Test Suite / Scenarios"
 Una vez finalizada la ejecución el sistema creara reportes de la ejecución
 
# 4) Historial de los reportes 
se pueden ver desde el reporsitorio de katalon testops, si se desea acceder a este se debe seleccionar en la barra de menu la opción 
testOps y luego hacer clic en la opción Katalon TestOps se deben usar las credenciales compartidas anteriormente para autenticarse.
Una vez se ingresa se debe ir a la url https://analytics.katalon.com/team/196860/project/208710/executions/ para ver todas las ejecuciones 
previas, en caso de necesitarse evidencia de fallas el sistema carga imagenes en el momento en el que esenario tiene un paso fallido

# 5) El patron de diseño usado en este proyecto es el de page object model 
Esto es debido a que se utiliza por medio de la herramienta de katalon un centralizado de dependencias, es decir,
todos los cambios que se realicen por una dependencia como driver, librerias o nombres es administrador por la herramienta de katalon. 
En cuanto a las variables se usan de dos formas en donde las variables locales a cada caso de uso son accesible unicamente desde cada 
caso de prueba, y las variables globales que son utilizadas por cualquier caso de prueba que dependera del profile que ejecute con el 
testsuite o individualmente por cada testcase(esta opción se selecciona en la parte superior a la derecha)
Al ejecutar los escenarios se realiza una ejecución previa de escenarios situada en el archivo "Test Listener / start", con este archivo 
permite realizar los pasos previos a cada escenario, en este caso el ingreso a la url y otro paso que se repiten constantemente
Se utilizo un archivo de datos para que si se desean cambiar los datos para la ejecución como la ciudad de origen o destino o las fechas 
se pueda realizar desde dicho archivo sin afectar los escenarios. Al construir el escenario con este patron se tiene como objetivo minizar 
el esfuerzo necesario que se requiere para realizar mantenimiento de los escenarios

# 6 Lenguaje
El lenguaje que usa la herramienta es groovy, asi la declaración de variables es no requiere de tipificación aunque se puede dar, si es 
necesario se puede importar codigo construido desde selenium o construir metodos especificos, uso de librerias o plugins externos, uso de
integración continua con jenkins o azure DevOps, y tiene incluida la herarmienta git para el manejo de control de codigo. Con respecto a 
las demas configuraciones se realizan desde la interface y quedan almacenados apra el proyecto como el tiempo por defecto de espera, el navegador 
predeterminado apra la ejecución, los parametros de conección con las demas herramientas de integración y reportes, permitiendo asi que los escenarios 
de prueba no se vean afectados por cambios en las configuraciones
