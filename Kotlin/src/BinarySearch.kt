import kotlin.math.floor

fun main(){
    println("*********************** Binary Search *************************")
    val arr = arrayOf(0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9)
    arr.sort()
    println("Array: ${arr.contentToString()}")
    binarySearch(arr, 0)
    println("Inbuilt function : ${arr.binarySearch(9, fromIndex = 0, toIndex = arr.size)}")
}

fun binarySearch(arr: Array<Int>, x: Int){
    var leftPointer = 0
    var rightPointer = arr.size-1
    var mid: Int
    var found = false
    while(leftPointer <= rightPointer){
        mid = floor((leftPointer.toDouble() + rightPointer) / 2).toInt()
        if(arr[mid] == x){
            println("Index of x: $x in arr is $mid")
            found = true
            break
        }else if(arr[mid] > x){
            rightPointer = mid-1
        }else {
            leftPointer = mid+1
        }
    }
    if(!found){
        println("x: $x not found in array: ${arr.contentToString()}")
    }
}
