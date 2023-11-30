
fun main(args: Array<String>) {
    val fraseAleatoria = "Pablito clavo un clavito".randomCase()
    imprimirFrase(fraseAleatoria)
}

fun imprimirFrase(frase: String): Unit {
    println("Fase: $frase")
}

fun String.randomCase(): String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}