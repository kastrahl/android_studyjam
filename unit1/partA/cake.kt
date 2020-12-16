fun main() {
    val border = "`-._,-'"
    val timesToRepeat = 4
    val age = 24
    val layers = 5
    printBorder(border, timesToRepeat)
    println("Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
    printCakeCandles(age)
    println()
    printCakeTop(age)
    printCakeBottom(age, layers)
}	
fun printBorder(border: String, timerepeat: Int) {
    repeat(timerepeat){
        print("${border}")
    }
    println()
}
fun printCakeCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    print(" ")
    repeat(age){
        print("|")
    }
}
fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers){
        repeat(age + 2) {
        print("@")
        }
        println()
    }
}
