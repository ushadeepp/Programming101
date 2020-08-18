fun main(arg: Array<String>){
    println("************** Array Rotation *****************")
    val arr: Array<Int> = arrayOf(1,2,3,4,5,6,7)
    val d = 7

    println("Left rotated arr: ${arr.contentToString()} by d=$d is: " +
            rotateArrayLeft(d, arr).joinToString(prefix = "[", postfix = "]", separator = " ")
    )
}

fun rotateArrayLeft(d: Int, arr: Array<Int>): Array<Int> {
    val n = arr.size
    val _d = d % n
    for(i in 1.._d){
        val temp = arr[0]
        for(j in 0..n-2){
            arr[j] = arr[j+1]
        }
        arr[n-1] = temp
    }
    return arr
}
