//Pedir Valores do Intervalo
fun main() {
    println("A1?")
    val a1: Int = readln().toInt()
    println("A2?")
    val a2: Int = readln().toInt()
    println("B1?")
    val b1: Int = readln().toInt()
    println("B2?")
    val b2: Int = readln().toInt()
    //ver onde se intersetas
    if (a1 <= b1 && a2 <= b1) {
    } else {
        println("A+B = [$b1,$a2]")

    }

}