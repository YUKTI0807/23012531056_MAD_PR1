fun main(){
    print("Enter month number:")
    val m = readLine()?.toInt()
    when(m){
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("March")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("october")
        11 -> println("November")
        12 -> println("December")
        else -> println("Enter valid month number!!")
    }
}