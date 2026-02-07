fun main() {
    println("********Kotlin OUT PUT*************")
    val list = listOf(1, 2, 3, 4, 5,12,22,25,77,1,2,3,4)
    val name = "rambabu is good"
    println(primeNumbersUpto(100))
    println("********duplicates Filtering *************")

    println(duplicate(list))
    println("****Frequency Count **********")
    println(frequencyCount(name))
    println("****Swap **********")
    println(swap(10,23))
    println("*******febanoci*******")
    println(fibonacci(10))
    println("****factorial Count **********")
    println(factorial(10))
    println("****EVEN Count **********")
    println(isEven(10))
    println("****findDuplicates  **********")
    println(findDuplicates(name));
    println("****fibonacci Count  **********")
    println(fibonacci(10));
    println("**********Reverse The Word")
    println(reverseWords(name))
    println(countVowels(name))
    println(sumOfDigits(12345))
    println(largest(list))
    println(removeDuplicates(list))
    println(reverse("rambabu"))
    println("********ARMSTRONG")
    println(isArmstrong(121))
    println("****Extension Function **********")
    println("rambabu".addFullName("baudugu"))
    println("*****Null Access ************")
    println(nullAccess())

    val result = list.groupingBy { it }
        .eachCount()
        .filter { it.value == 1 }
        .keys

    println(result)
    var myName = "rambabu"
    val result2 = myName.groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .keys

    println(result2);
    println(frequencyCount(myName));

}


fun frequencyCount(str: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    for (c in str) {
        map[c] = map.getOrDefault(c, 0) + 1
    }
    return map
}
fun swap(a: Int, b: Int) {
    var x = a
    var y = b
    x = x + y
    y = x - y
    x = x - y
    println("x = $x, y = $y")
}
fun removeDuplicates(list: List<Int>): List<Int> {
    return list.toSet().toList()
}
fun largest(arr: List<Int>): Int {
    var max = arr[0]
    for (i in arr) {
        if (i > max) max = i
    }
    return max
}

fun reverse(str: String): String {
    var result = ""
    for (i in str.length - 1 downTo 0) {
        result += str[i]
    }
    return result
}

fun nullAccess():String {
    val name: String? = null
    val fullName = name?: "rambabu"
    return fullName
}

fun String.addFullName(name: String = "rambabu"): String {
    return "$this-$name";

}

fun isArmstrong(num: Int): Boolean {
    var temp = num   // store original & use for loop
    val digits = num.toString().length
    var sum = 0

    while (temp > 0) {
        val digit = temp % 10
        sum += Math.pow(digit.toDouble(), digits.toDouble()).toInt()
        temp /= 10
    }

    return sum == num
}


fun findDuplicates(str: String): List<Char> {
    val map = mutableMapOf<Char, Int>()
    val result = mutableListOf<Char>()

    for (ch in str)
        map[ch] = map.getOrDefault(ch, 0) + 1
    for ((k, v) in map)
        if (v > 1)
            result.add(k)

    return result
}

fun isEven(num: Int): Boolean = num % 2 == 0

fun isOdd(num: Int): Boolean = num % 2 != 0

fun reverseWords(sentence: String): String {
    return sentence.split(" ").reversed().joinToString(" ")
}

fun sumOfDigits(num: Int): Int {
    var number = num
    var sum = 0
    while (number != 0) {
        sum += number % 10
        number /= 10
    }
    return sum
}




fun countVowels(str: String): Int {
    val vowels = "aeiouAEIOU"
    return str.count { it in vowels }
}

fun fibonacci(n: Int): Int {
    if (n <= 1) return n
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

fun primeNumbersUpto(num: Int): List<Int> {
    var list = mutableListOf<Int>()
    for (i in 1..num) {
        if(isPrimeNumber(i)){
            list.add(i)
        }
    }
    return list

}

fun duplicate(num: List<Int>): List<Int> {
    //val list = mutableListOf<Int>()
    val set = mutableSetOf<Int>()
    val unicSet = mutableSetOf<Int>()
    //set.addAll(num)
    for (i in num) {
        if (!set.add(i)) {
            unicSet.add(i)
        }
    }
//        if(!set.contains(i)){
//
//        }
    var result = set -unicSet;
    println("duplicate set $result")
    return set.toList()
}

fun isPrimeNumber(n: Int): Boolean {

    var count = 0;
    for(i in 1..n){
        if(n % i == 0){
            count++
        }
    }
    if(count == 2){
        return true
    }
    return false
}