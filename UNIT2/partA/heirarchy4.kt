fun main() {
    val squareCabin = SquareCabin(5)
    val roundHut = RoundHut(3)
    val roundTower = RoundTower(16,4)

    with(squareCabin) {
    println("\nSquare Cabin\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")
    }
    with(roundHut) {
    println("\nRound Hut\n=========")
    println("Material: ${buildingMaterial}")
    println("Capacity: ${capacity}")
    println("Has room? ${hasRoom()}")
    }
    with(roundTower) {
    println("\nRound Tower\n==========")
    println("Material: ${buildingMaterial}")
    println("Capacity: ${capacity}")
    println("Has room? ${hasRoom()}")
}
}
abstract class Dwelling(private var residents: Int){ //not defined here(abstract)
    abstract val buildingMaterial: String		//not defined here(abstract)
    abstract val capacity: Int					//not defined here(abstract)
    
    fun hasRoom(): Boolean {			//hasRoom() function was inherited for free
    return residents < capacity
    }
}
/*constructors*/
class SquareCabin(residents: Int)/*class parameter */: Dwelling(residents){ //passing already declared RESIDENTS 
    override val buildingMaterial = "Wood"
    override val capacity = 6
}
open class RoundHut(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
}
class RoundTower(residents: Int,val floors: Int) : RoundHut(residents) {	//class inherited from an OPEN CLASS ROUNDHUT
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
}
