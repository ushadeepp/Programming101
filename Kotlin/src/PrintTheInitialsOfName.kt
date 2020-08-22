fun main(){
    println("Print name in initials format. Eg: M.S.Dhoni for Mahendra Singh Dhoni")
    printInitial("Mahendra Singh Dhoni")
}

fun printInitial(name: String){
    val splitNames = name.split(" ")
    var res = StringBuilder()
    for (i in 0 until splitNames.size-1){
        res.append(splitNames[i][0].toUpperCase())
        res.append(".")
    }
    res.append(splitNames.last())

    println("Resulting Name: $res")
}
