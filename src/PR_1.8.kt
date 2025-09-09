fun main(){
    val arr1 = arrayOf(10,90,60,80,100)
    println(arr1.joinToString())

    val arr2 = Array<Int>(5){0}
    println(arr2.joinToString())

    val arr3 = Array(8) { i -> i }
    println(arr3.joinToString())

    val arr4 = IntArray(5)
    println(arr4.joinToString())

    val arr5 = intArrayOf(12,10,1,5,18,19)
    println(arr5.joinToString())

    val arr6 = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    for (row in arr6){
        println(row.joinToString())
    }
    println(arr6.joinToString())

    val arr7 = IntArray(5)
    for (i in arr7.indices) {
        print("arr7[$i] = ")
        arr7[i] = readln()!!.toInt()
    }
    println("Entered Array:")
    println(arr7.joinToString())
    arr7.sort()
    println("After sorting by built-in function:")
    println(arr7.joinToString())
    for (i in arr7.indices){
        for (j in 0 until arr7.size - i - 1)
            if (arr7[j]>arr7[j+1]){
                val temp = arr7[j]
                arr7[j] = arr7[j+1]
                arr7[j+1] = temp
            }
    }
    println("After Sorting without built-in function:")
    println(arr7.joinToString())

}