import kotlin.math.*
fun main() {

    print("x1? ")
    val x1: Double = readln().toDouble()

    print("y1? ")
    val y1: Double = readln().toDouble()

    print("x2? ")
    val x2: Double = readln().toDouble()

    print("y2? ")
    val y2: Double = readln().toDouble()

    val sqrDx: Double = (x2 - x1).pow(2)

    val sqrDy: Double = (y2 - y1).pow(2)

    val distance: Double = sqrt(sqrDx + sqrDy)

    println("Distancia = $distance")
}