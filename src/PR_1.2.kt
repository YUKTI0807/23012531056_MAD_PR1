fun main(){
    var j : Int = 10
    println("Integer Value:$j")
    var k : Double = j.toDouble()
    println("Double Value (From Integer):$k ")
    var l : String = "10"
    println("String Value:$l")
    var m : Int = l.toInt()
    println("Integer Value (From String):$m")
    var n : String = "11.12"
    var o : Double = n.toDouble()
    println("Double Value (From String):$n")
}