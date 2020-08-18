/*
 * Factorial of a number is the product of all the integers from 1 to that number
 * Eg: Factorial of 5
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 **/

// Recursive Approach
fun factorial_1(num: Int): Int {
    return if (num <= 1) 1 else num * factorial_1(num - 1)
}

// for loop
fun factorial_2(num: Int): Int {
    var res: Int = 1
    if (num <= 1) return res
    for (i in 2..num) {
        res *= i
    }
    return res
}

// for loop with downTo infix
fun factorial_3(num: Int): Int {
    var res: Int = 1
    if (num <= 1) return res
    for (i in num downTo 2) {
        res *= i
    }
    return res
}

// while loop
fun factorial_4(num: Int): Int {
    var res = 1
    if (num <= 1) return res
    var temp = num
    while (temp > 1) {
        res *= temp
        temp--
    }
    return res
}

// do-while loop
fun factorial_5(num: Int): Int {
    var res = 1
    if (num <= 1) return res
    var temp = num
    do {
        res *= temp
        temp--
    } while (temp > 1)
    return res
}

fun main(args: Array<String>) { // fun main()
    println("********************* Factorial of a number *********************")
    println("Factorial of 5: ${factorial_3(5)}")
}
