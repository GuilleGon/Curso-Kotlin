fun main(args: Array<String>) {
   val moviles = mutableListOf("Motorola G200 5G", "Samsung A72","Red Magic 8 pro")
       .run{
           removeIf{ movil -> movil.contains("Motorola")}
           this
       }

    println(moviles)
}
