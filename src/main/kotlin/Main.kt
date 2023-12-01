fun main(args: Array<String>) {
    val largoDeValorInicial = superFuncion(valorInicial = "hola!", block = { valor ->
        valor.length
    })
    println(largoDeValorInicial)

    val lambda = funcionInception("Guillermo")
    val valorLambda = lambda()

    println(valorLambda)
}


fun superFuncion(valorInicial: String, block: (String) -> Int): Int {
    return block(valorInicial)
}

fun funcionInception(nombre: String) : () -> String{
    return{
        "Hola desde la lambda $nombre"
    }
}