//fun main(){
//    oper()
//}
//fun oper(){
//
//
//
//    print("Enter the 1st value:")
//    var a = readLine()!!.toInt()
//    print("Enter the 2nd value:")
//    var b = readLine()!!.toInt()
//    print("Enter the 3rd value:")
//    var c = readLine()!!.toInt()
//    print("Addition of $a, $b, $c is ")
//    println(a+b+c)
//    print("Subraction of $a, $b, $c is ")
//    println(a-b-c)
//    print("Multiplication of $a, $b, $c is ")
//    println(a*b*c)
//    print("Division of $a, $b is ")
//    println(b/a)
//}
//

fun main() {
    print("Enter the 1st value: ")
    val a = readLine()!!.toInt()
    print("Enter the 2nd value: ")
    val b = readLine()!!.toInt()
    oper(a, b)
}

fun oper(a: Int, b: Int) {
    println("Addition of $a and $b is ${a + b}")
    println("Subtraction of $a and $b is ${a - b}")
    println("Multiplication of $a and $b is ${a * b}")
    if (b != 0) {
        println("Division of $a by $b is ${a / b}")
    } else {
        println("Division by zero is not allowed!")
    }
}
