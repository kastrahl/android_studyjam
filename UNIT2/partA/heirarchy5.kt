import kotlin.math.PI
fun main() {
    val squareCabin = SquareCabin(5,4.5)
    val roundHut = RoundHut(3,4.5)
    val roundTower = RoundTower(16,4,4.5)

    with(squareCabin) {
    println("\nSquare Cabin\n============")
    println("Material: ${buildingMaterial}")
    println("Capacity: ${capacity}")
    println("Has room? ${hasRoom()}")
    println("Floor area: ${floorArea()}")
    }
    with(roundHut) {
    println("\nRound Hut\n=========")
    println("Material: ${buildingMaterial}")
    println("Capacity: ${capacity}")
    println("Has room? ${hasRoom()}")
    println("Floor area: ${floorArea()}")
    }
    with(roundTower) {
    println("\nRound Tower\n==========")
    println("Material: ${buildingMaterial}")
    println("Capacity: ${capacity}")
    println("Has room? ${hasRoom()}")
    println("Floor area: ${floorArea()}")
    }
}
abstract class Dwelling(private var residents: Int){ //not defined here(abstract)
    abstract val buildingMaterial: String		//not defined here(abstract)
    abstract val capacity: Int					//not defined here(abstract)
    abstract fun floorArea(): Double			//function for calculating floor area 
    
    fun hasRoom(): Boolean {			//hasRoom() function was inherited for free
    return residents < capacity
    }
}
/*constructors*/
class SquareCabin(residents: Int,val length: Double)/*class parameters */: Dwelling(residents){ //passing already declared RESIDENTS 
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override fun floorArea(): Double {
        return length * length
    }
}
open class RoundHut(val residents: Int,val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double {
    return PI * radius * radius
    }
}
class RoundTower(residents: Int,val floors: Int,radius: Double) : RoundHut(residents,radius) {	//class inherited from an OPEN CLASS ROUNDHUT
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    override fun floorArea(): Double {		//override floorArea() to give different implementation to multiply the area with the number of floors
    return super.floorArea() * floors	    //avoiding rewriting code by calling superclass's function and multiplying it by floors
    }
}
