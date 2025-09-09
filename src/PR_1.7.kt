fun main(){
    print("Enter Number:")
    val x = readLine()!!.toInt()
    val factorial = facto(x)
    println("Factorial of $x = $factorial")
}
fun facto(x: Int): Long {
    if (x == 0 || x == 1)
        return 1
    else
        return x * facto(x - 1)
}
