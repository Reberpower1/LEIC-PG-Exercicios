fun main() {
        println("Olá por favor introduza o número de horas que pretende converter")
            val horas = readln().toInt()
    println("Minutos que pretende converter?")
    val minutos = readln().toInt()
    println("Segundos?")
    val segundos = readln().toInt()
            val seg = (horas*3600) + (minutos*60) + segundos
     println("Deu um total de $seg segundos")
}