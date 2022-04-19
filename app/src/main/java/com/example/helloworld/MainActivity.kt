package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYConstantes()
        //tiposDeDatos()
        //sentenciaIf()
        //sentenciaWhen()
        //myArray()
        //maps()
        //loops()
        //nullSafety()
        //funciones()
        clases()
    }
    /*
    private fun variablesYConstantes(){
        //Comentario de una sola linea

        /*Comentario de
        varias lineas
        */
        //Variables = Pueden cambiar su valor inicial
    var myVariable = "Primer variable"
    var primerNumero = 123
        println(myVariable)
        println(primerNumero)

        myVariable = "Nuevo valor de la variable"
        println(myVariable)
    //Constantes = no cambia su valor
        val myFirstConstant = "Primer constante"
        println(myFirstConstant)

    }
    /*
    Tipos de datos
    Data types
    */
    private fun tiposDeDatos(){
    //Tipo de dato string (cadena de texto)
        var myString = "Hola, soy un string"
        var otroString ="Soy otro string, pero en forma de variable"
        var stringConcatenados = myString + " " + otroString

        println(stringConcatenados)
        /*
        Tipos de datos enteros
        Short (-32768 / 32769)
        Byte (-127 / 128)
        Int
        long
        sin cuatro tipos de numeros enteros
        la unica diferencia entre ellos es
        la longitud del lumero que pueden
        llegar a representar
        */
        val myInt = 1
        val myInt2 = 2
        val suma = myInt + myInt2

        println(suma)
    /*
    Tipos de datos decimales
    Double (Decimal de 64 bits)
    Float (Decimal de 32 bits)
    */
        //val myfloat = 1.3f (Como reprecentar a un numero flotante)
        val myDouble = 2.5
        val myDouble2 = 1.6
        val myDouble3 = 1

        val sumaDouble = myDouble + myDouble2 + myDouble3

        println(sumaDouble)

        //Datos Booleanos

        val myBool = true
        val myBool2 = false
        val myBool3 = myBool + myBool2
        println(myBool3)



    }*/
    //Sentencia if
    /*
     private fun sentenciaIf(){
         val myNumber = 9

        if(myNumber > 10 ){
            println("Es mayor que 10")
        }
        else{
            println("Es menor que 10")
        }
        //Operador logico de desigualdad
        //! operador de negacion

     }

     */
    //Sentencia when (Switch en otros lenguajes de programacion)
/*
    private fun sentenciaWhen() {

        //Sentencia con numeros caracteres de tipo string

        val myCountry = "Francia"
        //Definir mediante la sentencia when si un pais es de habla hispana o habla otro idioma
        //Opciones Argentina peru mexico españa eeuu francia italia

        when (myCountry) {
            "Argentina", "Peru", "Mexico", "España" -> {
                println("Este pais es de habla hispana")
            }
            "EEUU" -> {
                println("Hablan ingles")
            }
            "Francia" -> {
                println("Hablan Frances")
            }
            "Italia" -> {
                println("Hablan Italiano")
            }else ->{
                println("Ese pais no es correcto")
            }
        }
        //When con numeros enteros

        val myAge = 10
        /*
        Hacer un programa que segun la edad ingresasda en la constante
        "myAge" digite en pantalla si el usuario es bebe, niño, adolescente,
        adulto o anciano
        */
        when(myAge){
            0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 -> {
                println("Es un bebe")
            }in 8 .. 11 -> { // in 8 .. 10 ->Representa un rango entre 8 y 10
                println("Es un niño")
            }in 12..17 -> {
                println("Es un adolescente")
            }in 18 .. 59 -> {
                println("Es un adulto")
            }in 60 .. 99 -> {
                println("Es un anciano")
            }else->{
                println("Fuaa sos re viejo")
            }
        }


    }*/

    //ARRAYS
 /*   private fun myArray(){
        val name = "Santiago"
        val surname = "Quiroz"
        val country = "Argentina"
        val age = "23"

        //Creacion de un array

        val array = arrayListOf<String>()
        //Añadir datos de uno en uno

        array.add(name)
        array.add(surname)
        array.add(country)
        array.add(age)
        //Los datos se pueden repetir
        array.add(age)
        array.add(age)
        //Imprimimos en pantalla el array

        println(array)
        //Como añadir un conjunto de datos

        array.addAll(listOf("Nuevo dato" , "Otro nuevo dato"))

        println(array)
        //Modificar el valor de un array

        array[4]= "Dato modificado"

        println(array)

        //Eliminar un  dato en el array
        array.removeAt(5)

        println(array)

    //Recorrer un array
        array.forEach{
            println(it)
        }
*/
        //Recorre los datos del array uno en uno
    /*private fun maps(){

       Es una coleccion de datos desordenada
       que sirve para agrupar datos, estos datos se
       agrupan mediante la estructura clave-valor.
       No pueden existir claves repetidas pero si
       dos claves diferentes con el mismo valor
       */
        //Estructura de un mapa
        /*
        var myMap: Map<String,Int> = mapOf()

        //Como añadir elementos al mapa
        myMap = mutableMapOf("Valor1" to 1, "Valor2" to 2, "valor3" to 3, "valor" to 4)

         println(myMap)
        //Agregar valores uno a uno

        myMap["Valor agregado"]=5

        println(myMap)

        //Como agregar un solo dato con put

        myMap.put("Dato con put",6)
        println(myMap)

        //Acceder a un dato
        println(myMap["valor3"])//Accede a la clave del valor

        //Eliminar un valor

        myMap.remove("valor3")
        println(myMap)

    }*/

    private fun loops(){
    /*
    Sirven para recorrer estructuras de datos
    */
    val myArray = listOf("Dato 1", "Dato 2", "Dato 3", "Dato 4")
    val myMap = mutableMapOf("Santiago" to 1, "Luis" to 2, "Juan" to 3, "Pepe" to 4)
    //For
        for (myString in myArray){
            println(myString)
        }
        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }
        for (x in 0 until 10 step 2){
            println(x)
        }
        val myNumericArray = (0 .. 20)
        for (myNum in myNumericArray) {
            println(myNum)
        }
    //While
        var x = 0

        while ( x < 10 ){
            println(x)
            x++
        }
    }

    //Null Safety
    //Como prevenir fallos nulos de memoria
    private fun nullSafety(){
    var mySring = "Santiago Q"

        //mySring = null

        println(mySring)

        var mySafetyString: String? = "Santiago Quiroz"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Nuevo valor"
        println(mySafetyString)
        //Safe call
        println(mySafetyString?.length)
    }
    //FUNCIONES
    fun funciones(){
        /*
         Es un fragmento de codigo que nos va a servir
         para desempeñar una tarea en concreto, al ser
         un fragmento independiente de codigo permite
         la reutilizacion de codigo. La funcion debe
         realizar una tarea muy concreta, de esta forma
         el codigo se hace mucho mas legible y se facilita
         su reutilizacion.
        */
         //Se puede llamar a una desde otra funcion
        sayHello()
        sayHello()
        sayHello()

        sayMyName("Santiago")
        sayMyName("Pedro")
        sayMyName("Juan")

        nameAndAge("Santiago", 23)
        nameAndAge("Juan", 50)
        nameAndAge("Pedro", 60)

        println(sumTwoNumbers(12, 21))
    }
    //Funcion simple
    fun sayHello(){
        println("Hola")
    }
    //Funciones con parametros
    fun sayMyName(name: String){
        println("Hola mi nombre es $name")
    }
    //se les puede asignar mas de un parametro
    fun nameAndAge(name: String, age: Int){
        println("Mi nombre es $name y tengo $age años")
    }
    //Funciones con un valor de retorno
    fun sumTwoNumbers(firstNumber: Int, seconNumber: Int) : Int {
        val sum = firstNumber + seconNumber

        return sum
    }
    //Clases
    fun clases(){

    }





}



















