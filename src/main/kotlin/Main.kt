@file:Suppress("UNUSED_EXPRESSION")

const val PI = 3.1416
fun main(args: Array<String>) {
    val nombre = "Guillermo"

    if(nombre.isNotEmpty()){
        println("El largo de nuestra variable es: ${nombre.length}")
    }else {
        println("La variable está vacia")
    }

    val mensaje : String = if (nombre.length > 5)
        "El nombre es largo"
    else "el nombre es corto"

    println(mensaje)

    val nombreColor = "Amarillo"

    when(nombreColor){
        "Amarillo" -> println("Amarillo como el sol")
        "Rojo" -> println("Rojo como la frutilla")
        "Azul" -> println("Azul como el cielo")
    }

    val num = 350
    when(num){
        in 100..250 -> println("Tu numero está entre 100 y 250")
        in 251..350 -> println("Tu numero está entre 251 y 350")
        in 351..450 -> println("Tu numero esta entre 351 y 450")
    }
}