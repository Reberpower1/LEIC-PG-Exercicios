import kotlin.math.*
fun main() {
    println("Quantia em Euros?")
    val quantia: Double = readln().toDouble()
    val centimos = (quantia * 100).roundtoInt()
    val m200 = centimos / 200
    var resto = centimos % 200
    val m20 = resto / 20
    var resto = m20 % 20
    val m10 = resto /10
    var resto = m10 % 10
    val m1 = resto / 1
    println("Troco: $m200 x2Eur + $m20 x20Cent + $m10 x10Cent + $ x1Cent.")
    println("$resto")
}