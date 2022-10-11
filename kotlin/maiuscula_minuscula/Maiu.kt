fun main() {
    println("Introduza um Char: ")
    val line: String = readln()
    val ch: Char = line[0]
    if (ch in 'A'..'Z') {
        println("Maiuscula: $ch")
        val min: Char = (ch + 32).toChar()
        println("Minuscula: $min")
    } else if (ch in 'a'..'z') {
        println("Min. = $ch")
        val maiusc: Char = (ch - 32).toChar()
        println("Maiusc = $maiusc")
        println("Cód.= ${maiusc.code}")
    } else {
        println("Não é letra, (sem acentos), Códig = ${ch.code}, simbolo = $ch")
    }
}