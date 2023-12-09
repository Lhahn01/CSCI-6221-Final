fun funG(x: Int): Int {
    return 3 * x
}

fun funF(x: Int, myFunG: (Int) -> Int): Int {
    var result = myFunG(x) + 2
    return result
}

fun main() { 
    val x = 5
    val returnVal = funF(x, ::funG)
    println(returnVal)
}
