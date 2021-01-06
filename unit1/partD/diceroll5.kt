fun main() { 
    val myFirstDice = Dice(6,"red")
    println("Your ${myFirstDice.colored} colored ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(20,"blue")
    println("Your ${mySecondDice.colored} colored ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}
class Dice (val numSides: Int ,val colored: String) {
    
    fun roll(): Int {
        return (1..numSides).random()
    }
}
