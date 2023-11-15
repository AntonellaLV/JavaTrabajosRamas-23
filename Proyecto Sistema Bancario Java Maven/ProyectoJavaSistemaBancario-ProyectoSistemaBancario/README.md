# ProyectoJavaSistemaBancario
TRABAJO PRÁCTICO FINAL N° 1 JAVA JEDI:

Realizar el siguiente trabajo práctico final, aplicando lo visto de JAVA en clases.

Título del Proyecto: Sistema Bancario

Descripción del Escenario:

Un cliente del banco puede tener múltiples cuentas. Cada cliente tiene un nombre, dirección y una lista de cuentas bancarias. Pueden agregar o eliminar cuentas y consultar el saldo total de sus cuentas. De las cuentas bancarias se tiene la información de número de cuenta, titular y saldo. Cada cuenta tiene un número único y un titular. También tiene métodos para depositar, retirar y consultar el saldo. Tenemos dos tipos de cuentas bancarias:

● Cuenta de ahorro: Las cuentas de ahorro pagan intereses a una tasa específica. Deberás implementar un método para calcular y agregar intereses al saldo.

● Cuenta corriente: Las cuentas corrientes pueden tener un límite de sobregiro y deben manejar retiros que excedan el saldo disponible.

El sistema principal es el Banco, el cual contiene una lista de clientes. Los clientes pueden registrarse en el banco. El banco ofrece los servicios como son abrir cuentas y gestionar a los clientes.

El sistema debe tener una funcionalidad que permite exportar en un csv las cuentas bancarias del banco. En las columnas del csv se debe ver :

● Número único del titular

● Nombre de titular

● Saldo

● Tipo

El listado del archivo tiene que estar ordenado por número único del titular y por saldo. Recordar que un usuario (Un número único) puede tener varias cuentas.

Requerimientos:

● Investigar cómo funcionan las cuentas de ahorro y cuenta corriente, en base a esto realizar la implementación de las funcionalidades del sistema.

● Aplicar los principios de POO en base a lo investigado.

● Realizar una descripción de lo investigado.

● En base a los conocimientos de POO, la investigación realizada, identificar las entidades del sistema y representarlo en un diagrama de clases.


● Aplicar los principios de POO en base a lo investigado.
● Realizar una descripción de lo investigado.
● En base a los conocimientos de POO, la investigación realizada, identificar las entidades del sistema y representarlo en un diagrama de clases.
● Implementarlo en java usando como gestor del proyecto a MAVEN.

Plus: ● Crear una base de datos con las tablas de las entidades detectadas, relacionarlas e insertar los datos que se exportan en el csv.

Requerimiento 1: Investigar cómo funcionan las cuentas de ahorro y cuenta corriente, en base a esto realizar la implementación de las funcionalidades del sistema.

Investigación:

Cuenta de Ahorro Características:

Intereses: Las cuentas de ahorro suelen pagar intereses sobre el saldo. La tasa de interés puede ser fija o variable. Limitaciones de Retiro: Pueden existir limitaciones en el número de retiros o transferencias que se pueden hacer cada mes. Saldo Mínimo: Algunas cuentas de ahorro requieren un saldo mínimo para mantener la cuenta abierta o para ganar intereses.

Implementación:

Método para Calcular Intereses: Implementar un método que calcule los intereses basándose en la tasa de interés y el saldo actual. Restricciones de Transacciones: Implementar lógica para controlar el número de transacciones permitidas.

Cuenta Corriente Características:

Sobregiro: Las cuentas corrientes a menudo permiten sobregiros, donde los clientes pueden retirar más dinero del que tienen en su cuenta, hasta un límite establecido. Tasas y Cargos: Pueden incurrir en tasas por sobregiro o por no mantener un saldo mínimo. Sin Intereses: Generalmente, estas cuentas no pagan intereses, aunque hay excepciones.

Implementación:

Manejo de Sobregiros: Implementar una verificación en el método de retiro para permitir o denegar retiros que excedan el saldo, basándose en el límite de sobregiro. Cargos por Sobregiro: Si se permite el sobregiro, aplicar cargos correspondientes.

Implementación en Java Para estas implementaciones, considerar lo siguiente:

Clase Base CuentaBancaria:

Atributos comunes: número de cuenta, titular, saldo. Métodos: depositar(), retirar(), consultarSaldo().

Subclases:

CuentaAhorro: Implementar el método para calcular y agregar intereses. CuentaCorriente: Añadir atributos y lógica para manejar el límite de sobregiro.

Cálculo de Intereses:

Puede ser un método que se ejecute periódicamente (por ejemplo, mensualmente) para actualizar el saldo con los intereses ganados.

Validaciones:

Validar las operaciones como depósitos y retiros para que cumplan con las reglas de cada tipo de cuenta.

Requerimiento 2 (Aplicar los principios de POO en las funcionalidades del sistema del proyecto)

Encapsulamiento: Privacidad de Datos: Los atributos de las clases (como saldo, número de cuenta, tasa de interés) deben ser privados para proteger y controlar el acceso a los datos del objeto.

Métodos Públicos para Operaciones: Proporcionar métodos públicos para operaciones como depositar, retirar y consultar el saldo, asegurándose de que cualquier cambio en el estado del objeto se realice de manera controlada.

Herencia: Clase Base CuentaBancaria: Esta clase actuará como una superclase para las cuentas de ahorro y corrientes. Definirá atributos y métodos comunes como número de cuenta, titular, saldo, depositar(), retirar() y consultarSaldo().

Subclases CuentaAhorro y CuentaCorriente: Estas clases heredarán de CuentaBancaria y sobrescribirán o añadirán funcionalidades específicas, como el cálculo de intereses en CuentaAhorro y el manejo de sobregiros en CuentaCorriente.

Abstracción: Simplificar la Complejidad: Las clases deben representar entidades bancarias de manera simplificada, ocultando detalles complejos y exponiendo solo lo necesario. Por ejemplo, la lógica para calcular intereses o manejar sobregiros se encapsula dentro de las clases respectivas.

Polimorfismo: Métodos Polimórficos: Permitir que objetos de diferentes clases (CuentaAhorro, CuentaCorriente) sean tratados como objetos de su clase base (CuentaBancaria). Por ejemplo, un método que acepte una CuentaBancaria puede operar tanto con CuentaAhorro como con CuentaCorriente.

Sobrecarga y Sobrescritura de Métodos: Utilizar la sobrecarga para crear múltiples versiones de un método (como depositar) y la sobrescritura para cambiar el comportamiento de métodos heredados en las subclases.

Requerimiento 3 (Realizar una descripción de lo investigado)

Descripción General del Sistema Bancario:

El sistema bancario diseñado consta de varias entidades clave: clientes, cuentas bancarias (tanto de ahorro como corrientes), y un banco central que gestiona estas entidades. Cada cliente puede tener múltiples cuentas bancarias, y el banco ofrece servicios como la apertura de cuentas y la gestión de clientes. Además, el sistema debe ser capaz de exportar la información de las cuentas a un archivo CSV.

Cuentas de Ahorro y Cuentas Corrientes

Cuentas de Ahorro:

Pagan intereses sobre el saldo a una tasa específica. Pueden tener restricciones en cuanto al número de retiros. Implementadas con un método para calcular y agregar intereses al saldo.

Cuentas Corrientes:

Permiten sobregiros hasta un límite especificado. Pueden incurrir en tasas por sobregiro. Implementadas con una verificación en el método de retiro para permitir o denegar retiros que excedan el saldo.

Principios de POO Aplicados

Encapsulamiento:

Datos privados con acceso controlado mediante métodos públicos. Protección del estado interno de los objetos.

Herencia:

CuentaBancaria como clase base para CuentaAhorro y CuentaCorriente. Reutilización de código común y extensión de funcionalidades específicas.

Abstracción:

Simplificación de la complejidad de las operaciones bancarias. Interfaces claras para interacción con los objetos sin necesidad de conocer detalles internos.

Polimorfismo:

Tratamiento de objetos de CuentaAhorro y CuentaCorriente como CuentaBancaria. Sobrecarga y sobrescritura de métodos para adaptar o ampliar comportamientos. Implementación en Java Se propone una estructura de clases con CuentaBancaria como superclase abstracta o interfaz, CuentaAhorro y CuentaCorriente como subclases. Cada clase tiene atributos y métodos específicos según su tipo. Se utiliza la herencia para compartir y extender funcionalidades, y el polimorfismo permite tratar todas las cuentas de manera uniforme en ciertos contextos. Se implementan métodos para operaciones bancarias básicas y características específicas como el cálculo de intereses y el manejo de sobregiros.

Conclusión: La implementación propuesta ofrece un diseño robusto y flexible que sigue los principios de la POO, facilitando la extensibilidad y el mantenimiento del sistema. Las entidades bancarias están claramente definidas y encapsuladas, con interacciones bien definidas entre ellas, lo cual es esencial para un sistema bancario eficiente y seguro.

Requerimiento 4 (diagrama de clases (Sistema Bancario)): https://drive.google.com/file/d/1xALmxzR0f4k2Tbektq_yL4I4gDT_MttA/view?usp=drive_link
