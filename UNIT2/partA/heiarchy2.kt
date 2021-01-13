fun main() {
    val squareCabin = SquareCabin(5)
    println("\nSquare Cabin\n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")
}
abstract class Dwelling(private var residents: Int){      //not defined here(abstract)
    abstract val buildingMaterial: String		              //not defined here(abstract)
    abstract val capacity: Int					                  //not defined here(abstract)
    
    fun hasRoom(): Boolean {                               //hasRoom() function was inherited for free
    return residents < capacity
    }
}
/*constructor*/
class SquareCabin(residents: Int) /*class parameter */ : Dwelling(residents){           //passing already declared RESIDENTS 
    override val buildingMaterial = "Wood"
    override val capacity = 6
}
