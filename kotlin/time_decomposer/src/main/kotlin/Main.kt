fun main() {
        println(" ")
        println("Seja Bem-Vindo ao Time Decomposer!")
        println(" ")
        println("Diga o tempo em segundos")
            val segundos = readln().toInt()
            val horas = (segundos/ 3600)
            val segund = segundos %3600
            val min = (segund /60)
            val seg = segund % 60
        println("O templo em segundos, $segundos, decomposto fica: \n Horas: $horas \n Min: $min \n Seg: $seg")
}