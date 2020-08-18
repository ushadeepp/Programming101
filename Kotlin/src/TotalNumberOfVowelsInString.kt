import java.util.*

fun main(args: Array<String>) {
    val str = "I am Shivaganesh"
    println("Total Number of Vowels in String $str: ${countVowels(str)}")
}

fun countVowels(str: String): Int{
    var count = 0;
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    for(char in str){ // for(char: Char in str.toCharArray())
        if(char in vowels) count++
    }
    return count
}

fun countVowelsOneLine(str: String): Int{
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return str.count { it in vowels }
}
