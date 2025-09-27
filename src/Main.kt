import javax.xml.stream.events.Characters
import kotlin.jvm.Throws
//class Car(var type: String, var model: Int, var price: Double, var owner: String, var milesDriven: Int){
//    init {
//        println("Object of class is created and Init is called.")
//    }
//    fun Currentprice(): Double {
//        return price - (milesDriven * 10)
//    }
//    fun info() {
//        println("Car Information: $type, $model")
//        println("Car Owner: $owner")
//        println("Miles Drive: $milesDriven")
//        println("Original Car Price: $price")
//        println("Current Car Price: ${Currentprice()}")
//        println()
//    }
//}
fun main() {
 //1.1
//    var a : Int = 22
//    var b : Float = 1.5f
//    var c : Char = 'T'
//    var d : String = "HMS"
//    var e : Boolean = false
//    var f : Double = 96.36
//    var g : Long = 338927847
//    var h : Short = -2
//    var i : Byte = 127
//    println("Integer Value:$a")
//    println("Float Value:$b")
//    println("Character Value:$c")
//    println("String Value:$d")
//    println("Boolean Value:$e")
//    println("Double Value:$f")
//    println("Long Value:$g")
//    println("Short Value:$h")
//    println("Byte Value:$i")
//1.2
//    var j : Int = 10
//    println("Integer Value:$j")
//    var k : Double = j.toDouble()
//    println("Double Value (From Integer):$k ")
//    var l : String = "10"
//    println("String Value:$l")
//    var m : Int = l.toInt()
//    println("Integer Value (From String):$m")
//    var n : Double = l.toDouble()
//    println("Double Value (From String):$n")
//1.3
//    println("Enter your Enrollment No:")
//    var stu  = readLine()?.toLong()
//    println("Enter your Name:")
//    var name = readLine()
//    println("Enter your Branch:")
//    var branch = readLine()
//    println("Enter your Class:")
//    var stuclass = readLine()
//    println("Enter your Batch Name:")
//    var batch = readLine()
//    println("Enter you College Name:")
//    var cname = readLine()
//    println("Enter your University Name:")
//    var uname = readLine()
//    println("Enter your age:")
//    var age = readLine()?.toInt()
//
//    println("Student Enrollment No: $stu")
//    println("Student Name: $name")
//    println("Student Branch: $branch")
//    println("Student Class : $stuclass")
//    println("Student Batch : $batch")
//    println("Student College Name : $cname")
//    println("Student University Name: $uname")
//    println("Student Age: $age")
//1.4
//    print("Enter any number:")
//    val a = readLine()!!.toInt()
//    if(a%2==0) {
//        println("even number!")
//    }
//    else{
//        println("Odd Number")
//    }
//1.5
//    print("Enter month number:")
//    var m = readLine()?.toInt()
//    when(m){
//        1 -> println("January")
//        2 -> println("February")
//        3 -> println("March")
//        4 -> println("April")
//        5 -> println("March")
//        6 -> println("June")
//        7 -> println("July")
//        8 -> println("August")
//        9 -> println("September")
//        10 -> println("october")
//        11 -> println("November")
//        12 -> println("December")
//        else -> println("Enter valid month number!!")
//    }
//1.6
//oper()
//1.7
//    print("Enter Number:")
//    val x = readLine()!!.toInt()
//    val factorial = facto(x)
//    println("Factorial of $x = $factorial")
// 1.8
//    var arr1 = arrayOf(10,90,60,80,100)
//    println(arr1.joinToString())
    //
//    var arr2 = Array<Int>(5){0}
//    println(arr2.joinToString())
    //
//    var arr3 = Array(8) { i -> i }
//    println(arr3.joinToString())
    //
//    var arr4 = IntArray(5)
//    println(arr4.joinToString())
    //
//    var arr5 = intArrayOf(12,10,1,5,18,19)
//    println(arr5.joinToString())
    //
//    var arr6 = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
//    for (row in arr6){
//        println(row.joinToString())
//    }
//    println(arr6.joinToString())
    //
//    var arr7 = IntArray(5)
//    for (i in arr7.indices) {
//        print("arr7[$i] = ")
//        arr7[i] = readln()!!.toInt()
//    }
//    println("Entered Array:")
//    println(arr7.joinToString())
//    arr7.sort()
//    println("After sorting by built-in function:")
//    println(arr7.joinToString())
//    for (i in arr7.indices){
//        for (j in 0 until arr7.size - i - 1)
//            if (arr7[j]>arr7[j+1]){
//                var temp = arr7[j]
//                arr7[j] = arr7[j+1]
//                arr7[j+1] = temp
//            }
//    }
//    println("After Sorting without built-in function:")
//    println(arr7.joinToString())
//1.9
//    var arr = arrayOf(57,90,10,13,14)
//    println(arr.joinToString())
//    println(arr.max())
//1.10
//    println("Creating Car Class Object car1 in next line")
//    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
//    car1.info()
//
//    println("Creating Car Class Object car2 in next line")
//    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
//    car2.info()
//
//    println("ArrayList of Car:")
//    val carList = ArrayList<Car>()
//    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100))
//    carList.add(Car("Maruti", 2020, 4000000.0, "NPP", 200))
//
//    for (c in carList) {
//        c.info()
//    }
//1.11
     val firstMatrix = Matrix(arrayOf(
         intArrayOf(3, -2, 5),
         intArrayOf(3, 0, 4)
     ))

     val secondMatrix = Matrix(arrayOf(
         intArrayOf(2, 3),
         intArrayOf(-9, 0),
         intArrayOf(0, 4)
     ))

     val secondMatrix1 = Matrix(arrayOf(
         intArrayOf(6, 3),
         intArrayOf(9, 0),
         intArrayOf(5, 4)
     ))

     println("Addition")
     println("Matrix 1:\n$secondMatrix1")
     println("Matrix 2:\n$secondMatrix")
     val addition = secondMatrix1 + secondMatrix
     println("Result:\n$addition")

     println("Subtraction")
     println("Matrix 1:\n$secondMatrix1")
     println("Matrix 2:\n$secondMatrix")
     val subtraction = secondMatrix1 - secondMatrix
     println("Result:\n$subtraction")

     println("Multiplication")
     println("Matrix 1:\n$firstMatrix")
     println("Matrix 2:\n$secondMatrix")
     val multiplication = firstMatrix * secondMatrix
     println("Result:\n$multiplication")





 }









//1.6
//fun oper(){
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
//1.7
//fun facto(x: Int): Long {
//    if (x == 0 || x == 1)
//        return 1
//    else
//        return x * facto(x - 1)
//}
