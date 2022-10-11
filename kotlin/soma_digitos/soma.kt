fun main()   {
    println("Por favor diga um número com 3 dígitos")
    val num = readln().toInt()
    val pri = num % 10
    val tre = num/10
    val seg = (tre % 10)
    val tri = (tre / 10)
    val soma =(pri + seg + tri)
    println("A soma dos 3 dígitos é: $soma")
}