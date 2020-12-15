# lps-contaduria

Demo del proyecto del curso líneas de productos.

Fue desarrollado en el lenguaje Java usado el Framework Spring. 

El código fuente se encuentra en ésta [ruta](https://github.com/Ragnarok540/lps-contaduria/tree/main/demo/src/main/java/com/example/demo).

## Componentes del Dominio Implementados

Los componentes del dominio fueron implementados como [servicios](https://github.com/Ragnarok540/lps-contaduria/tree/main/demo/src/main/java/com/example/demo/service) de Spring y para acceder a estos (vistas) se ofrece un [API REST](https://github.com/Ragnarok540/lps-contaduria/blob/main/demo/src/main/java/com/example/demo/controller/ApiController.java). Para el modelo se usaron [Java Beans](https://github.com/Ragnarok540/lps-contaduria/tree/main/demo/src/main/java/com/example/demo/bean).

- __RQ02__ - Facturas de Compra
- __RQ03__ - Facturas de Venta
- __RQ05__ - Registro de Costos
- __RQ06__ - Registro de Gastos
- __RQ07__ - Registro de Ingresos
- __RQ08__ - Registro de Pasivos
- __RQ09__ - Registro de Activos
- __RQ11__ - Balance (Opcional, solo Microempresa)
- __RQ12__ - IVA (Opcional, solo Microempresa)
- __RQ14__ - Retefuente (Opcional, solo Microempresa)
- __RQ16__ - Declaración de Renta

## Configuración de los Productos de la Línea

Con éste demo se pueden configurar dos productos, Finanzas Personales y Microempresas,
esta configuración se realiza en el archivo [application.properties](https://github.com/Ragnarok540/lps-contaduria/blob/main/demo/src/main/resources/application.properties).

