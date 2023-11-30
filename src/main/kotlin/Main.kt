fun main(args: Array<String>) {
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidas)

    val numeroFavoritos = mutableSetOf(1,2,3,4)
    println(numeroFavoritos)
    numeroFavoritos.add(5)
    numeroFavoritos.add(5)
    println(numeroFavoritos)

    numeroFavoritos.remove(5)
    println(numeroFavoritos)

    val valorDelSet = numeroFavoritos.firstOrNull{ numero -> numero > 2}
    println(valorDelSet)
}