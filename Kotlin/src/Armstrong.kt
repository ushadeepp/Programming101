/*
 * An Armstrong number is a number where in sum of 'nth' power of each digit of a n digit number is equal to the number itself
 * Eg: 1634 (4 digit number)
 * (1 * 1 * 1 * 1) + (6 * 6 * 6 * 6) + (3 * 3 * 3 * 3) + (4 * 4 * 4 * 4)
 * = 1 + 1296 + 81 + 256
 * = 1634
 **/
fun main(arg: Array<String>) {
    println("************************** Armstrong Number*******************************")
    val num = 1634
    println("$num is Armstrong number: ${isArmStrong(num)}")
}

fun isArmStrong(num: Int): Boolean {
    var temp = num
    var noOfDigits = noOfDigits(num)
    var res: Int = 0
    var digit: Int
    while (temp > 0) {
        digit = temp % 10
        res += nthPowerOfDigit(digit = digit, times = noOfDigits)
        temp /= 10
    }
    return num == res
}

fun noOfDigits(num: Int): Int {
    var size = 0
    var temp = num
    while (temp > 0) {
        temp /= 10;
        size++
    }
    return size
}

fun nthPowerOfDigit(digit: Int, times: Int): Int {
    var res = digit;
    for (i in 1 until times) {
        res *= digit
    }
    println(res)
    return res
}
