##  Declarar clases
`public class Hola { 
    ...
}` 



## Declarar metodos 
`public static void main (String [] arg){
        ...
}`

>*_Los métodos son las funciones o procedimientos. El método principal y por donde inician los programas es el método main_*

### Método main(): 
* Publico (public), puedes ser llamado desde cualquier lado. 
* Estático (static), puede ser llamado sin necesidad de instanciar la clase. 
* Vacío (void), no devuelve ningun valor 
* (String [] args), admite una serie de parametros, en este caso ninguno 
* El metodo se delimita entre llves {}

## Comentarios en código 


* // cometarios de una sola linea 
* /* "Texto" */ comentarios en varias lineas  

## Sentencias (instruccion que se ejecutará)
`System.outprintln("Hola");`

 > Clase System con el atributo out con el metodo println      


## Tipos de datos 

| Tipos de datos primitivos | Información representada | Rango      |
|---------------------------|--------------------------|------------|
|**byte**                   |Datos enteros             |-128 al +127
|**short**                  |Datos enteros             |-32.768 al +32.767
|**int**                    |Datos enteros             |-2147483648 al +2147483647
|**long**                   |Datos enteros             |-9223372036854775808 al +9223372036854775807
|**char**                   |Datos enteros y caracteres|0 al 65535  |   
|**float**                  |Datos en coma             |Flotante en 32 bits|
|**double**                 |Datos en coma             |Flotante en 64 bits|
|**boolean**                |Valores booleanos         |True/False
----------------------------------



## Variables de Clase 

* Son variables cuyo valor es el mismo para la clase y para todas las instancias.
* Palabra reservada _static_ se utiliza para la declaración de variables de clase 

## Variables locales 

* Son variables declaradas dentro de un método, se crean cuando el bloque inicia y se destruyen cuando finaliza la ejecución de dicho bloque. 

### Ejemplo : 
```
class suma {
    static int a=50; //Variable de clase

    public static void main (String[] args){
        int b=10, resultado=0; //Variables locales
        resultado = a+b;
        System.out.println("Elresultado de la suma es:"+ resultado);
     }
 } 
 ```

## Constantes 
> Lugar de memoria donde se puede almacenar información, se le diceconstante por que su valor no puede cambiar durante toda la ejecución del programa. 

### Declarar una constante 
`final double PI = 3.1416;`
> tipo de dato, nombre de variable, valor  

### Ejemplo:
```
class AreaCirculo {
    public static void main (String [] args){
        final double PI=3.1416; // Constante 
        double radio = 3.5, area;
        area = PI*radio*radio;
        System.out.println("El área del circulo es: "+ area);
    }
} 
```

## Operadores Aritméticas 

| Operador        |Operación |
|-----------------|----------|
|+                |Suma      |
|-                |Resta     |
|*                |Multiplicación|
|/                |División  |
|%                |Módulo o resto de una división |


### Ejemplo: 
``` 
int a=2, b=5, resultado;
resultado =a*b; //resultado=10
```

## Racionales 
Evaluan la igualdad y la magnitud 

| Operador        |Operación        |
|-----------------|-----------------|
|<                |Menos que        |
|>                |Mayor que        |
|<=               |Menor o igual a  |
|>=               |Mayor o igual a  |
|!=               |Distinto         |
|==               |Igual que        |
 


### Ejemplo: 
``` 
int a=6, b=8;
boolean resultado;
resultado = a>b; // resultado = False
``` 
## Unitarios 
Pueden realizar operaciones lógicas.

| Operador        |Operación |
|-----------------|----------|
|&& o &           |Elresultado será true si ambos son true y    false en caso contrario       
| ll o l          |el resultado seá false si ambos operadores son false y true en caso contrario.      |
|!                |si el operando es true el resultado es false y si el operando es false el resultado es true|
|^                |El resultado será true si un operando es true y el otro false, y false en caso contrario   |
-----------------------------------------------------

### Ejemplo: 
``` 
int =3, b=6;
boolean resultado;
resultado = a>b && a >= b;  //Resultado = false
```

## Lógicos 

| Operador        |Operación                   |
|-----------------|----------------------------|
|~                |Complemento A1              |
|-                |Cambio de signo del operador|
|--               |Decemento                   |
|++               |Incremento                  |



### Ejemplo: 
``` 
int a=3, b=6;
a++; //a incrementa a = 4
b--; //b decrementa b = 5
```

## Asignación
| Operador        |Operación                   |
|-----------------|----------------------------|
|=                |Asignación                  |
|+=               |Suma de asignación          |
|-=               |Resta de asignación         |
|*=               |Multiplicación y asignación |
|/=               |División y asignación       |
|%=               |Módulo y asignación         |

### Ejemplo:
``` 
int a = 15;
a += 5; // a = 20, equivale a a= a+5
```


## Instrucciones if-else

> La estructura if permite ejecutar un bloque de código si se cumple la condición 

``` 
if (condicion){
        // si cumple la condición 
}
```

>La estructura if-else cuenta con un bloque de código cuando falla la decisión 

``` 
if(condicion){
    // Si es verdadero 
}else{
    // Si es falso
}
```

> La estrucutura if-else-if acepta dos o más condiciones 

``` 
if (condicion){
    // Si es verdadero
}else if(condicion){
    // Si es verdadero 
}else if (condicion){
    // Si es verdadero
}else{
    // Si es falso
}
```

> La estructura if-else anidada permite tener más condiciones internamente 

``` 
if (condicion){
    // Si es verdadero
        if(condicion){
            //Si es verdadero
        }
}else{
    //Si es falso
        if(condicion){
            //si es verdadero
        }else{
            //si es falso
        }
}
```

