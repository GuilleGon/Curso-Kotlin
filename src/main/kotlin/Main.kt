const val PI = 3.1416
fun main(args: Array<String>) {
    val listaDeFrutas = listOf("Manzana", "Pera", "Frutilla", "Durazno")
    for (fruta in listaDeFrutas)
        println("Fruta: $fruta")

    var nombre: String? = null
   try {
       nombre!!.length
   }catch (excepcion: NullPointerException){
       println("Ah ocurrido un error")
   }
}