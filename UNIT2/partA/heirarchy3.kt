fun main() {
    val squareCabin = SquareCabin(5)
    with(squareCabin) {                       //"do all the following operations with this instance object" using a with statement
    println("\nSquare Cabin\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
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
/*constructor*/
class SquareCabin(residents: Int)/*class parameter */: Dwelling(residents){ //passing already declared RESIDENTS 
    override val buildingMaterial = "Wood"
    override val capacity = 6
}
