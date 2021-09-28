fun main(){
    print(math(5, 6))
}

val math: (x: Int, y: Int) -> String = { x, y ->
    """Add: ${x + y}
        |Subtract: ${x - y}
        |Multiply: ${x * y}
        |Divide: ${x / y}
    """.trimMargin()
}