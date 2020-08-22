fun main(){
    println("Divide String into Equal Parts")
    val str = "DivideString"
    val noOfParts = 2
    println("Given String: $str. Divide this into $noOfParts equal parts.")
    divideString(str, noOfParts)
}

fun divideString(str: String, n: Int){
    val partLen = str.length / n
    if(str.length % n != 0){
        println("This string can not be divided into equal parts")
    }

    var i = 0
    for(char in str){
        if(i % partLen == 0) println()
        print(char)
        i++
    }
}
