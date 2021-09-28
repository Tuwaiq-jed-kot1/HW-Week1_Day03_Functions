fun main() {
    // --- Part III Challenge 1: Mathematical Operations ---

    fun mathAdd(x: Int, y: Int, math: (n1: Int, n2: Int) -> Int) {
    println("add: " + math(x, y))
}
    fun mathSub(x: Int, y: Int, math: (n1: Int, n2: Int) -> Int) {
        println("Subtract: " + math(x, y))
    }
    fun mathMulti(x: Int, y: Int, math: (n1: Int, n2: Int) -> Int) {
        println("Multiply: " + math(x, y))
    }
    fun mathDiv(x: Int, y: Int, math: (n1: Int, n2: Int) -> Int) {
        println("Divide: " + math(x, y))
    }

    mathAdd(2, 3)   { n1, n2 -> n1 + n2 }
    mathSub(2, 3)   { n1, n2 -> n1 - n2 }
    mathMulti(2, 3) { n1, n2 -> n1 * n2 }
    mathDiv(2, 3)   { n1, n2 -> n1 / n2 }

}