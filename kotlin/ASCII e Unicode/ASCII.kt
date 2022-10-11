/*Programa que lê um char e imprime-o e mostra qual o seu código ASCII
fun main(){
    println("Introduza um caracter")
        val line: String = readln()
        val char: Char = line[0]
            println("Char = $char")
            println("Código Unicode = ${char.code}")
}
*/
//Programa que gera a Tabela ASCII Unicode
fun main(){
        for(i in 0..65535)
        {
            val code: Int = i
            val ch: Char = code.toChar()
            println(" $code \t $ch\n")
        }
}