fun main() {
   
    val sqaureCabin = SqaureCabin(10)
    
    with(sqaureCabin){
        	println("\nSquare Cabin\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasRoom()}")
    }
    
    val roundHut = RoundHut(1)
    
    with(roundHut){
        	println("\nRound Hut\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasRoom()}")
    }
      val roundTower = RoundTower(1)
    
    with(roundTower){
        	println("\nRound Tower\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasRoom()}")
    }
    
   
}


abstract class Dwelling(private val residents : Int ){
	abstract val buildingMaterial :String
	abstract val capacity :Int
    
    fun hasRoom():Boolean{
        return residents <= capacity
    }

}



class SqaureCabin(residents: Int ):Dwelling(residents){
    
    override val buildingMaterial = "Wood"
    override val capacity = 6


}

open class RoundHut(residents: Int ):Dwelling(residents){
    
	override val buildingMaterial = "Straw"
  	override val capacity = 3
   

}

class RoundTower(residents: Int):RoundHut(residents){
    override val buildingMaterial  = "Stone"
    override val capacity = 4
    
    
    
}







