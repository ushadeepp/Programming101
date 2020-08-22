fun main(){
    println("*********************** Bubble Sort *************************")
    val arr = arrayOf(9,8,1,2,6,5,4,3,2,7,0)
    println("Array: ${arr.contentToString()}, Sorted Array: ${bubbleSort(arr).contentToString()}")
}

fun bubbleSort(arr: Array<Int>): Array<Int>{
    for(i in arr.indices){ // 0 to arr.size-1
        for(j in 0..arr.size-2-i){
            if(arr[j] > arr[j+1]){
                arr[j] = arr[j+1].also { arr[j+1] = arr[j] }
            }
        }
    }
    return arr
}
