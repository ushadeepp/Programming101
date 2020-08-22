fun main(){
    println("Count frequency of Elements in Array")
    val arr = arrayOf(1,2,3,4,1,2)
    println("Count of each number in array: ${arr.toList()} is:")
    countFrequency(arr).forEach { (t, u) -> println("$t present $u times")}
}

fun countFrequency(arr: Array<Int>): Map<Int, Int>{
    val map = hashMapOf<Int, Int>()
    var temp = 0
    for(num in arr){
        temp = map.getOrDefault(num, 0)
        map[num] = ++temp
    }
    return map
}
