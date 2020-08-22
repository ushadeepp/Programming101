fun main(){
    println("************************* Min and Max in an Array ****************************")
    val arr: Array<Int> = arrayOf(1,2,3,4,5,6,7)
    println("Array: ${arr.contentToString()}")
    val (min, max) = minAndMaxOfArr(arr)
    println("Min: $min, Max: $max")

    val arrString: Array<String> = arrayOf("a", "aa", "b", "bb", "bbb", "aaaa")
    println("Array: ${arrString.contentToString()}")
    val (minStr1, maxStr1) = inBuiltWay(arrString)
    println("Min: $minStr1, Max: $maxStr1")
    val (minStr2, maxStr2) = overridenForStringLen(arrString)
    println("Min: $minStr2, Max: $maxStr2")
}

fun minAndMaxOfArr(arr: Array<Int>): Pair<Int, Int> {
    var min = arr[0]
    var max = arr[0]
    for(num in arr){
        if(num < min) min = num
        if(num > max) max = num
    }
    return Pair(min, max)
}

fun inBuiltWay(arr: Array<String>): Pair<String?, String?> {
    return Pair(arr.min(), arr.max())
}

fun overridenForStringLen(arr: Array<String>): Pair<String?, String?> {
//    return Pair(arr.min(), arr.max())
    return Pair(arr.minBy { it.length }, arr.maxBy { it.length })
}
