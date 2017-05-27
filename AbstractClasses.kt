abstract class StoredEntitiy {
	val isActive = true
	abstract fun store()

	fun status(): String {
		return isActive.toString()
	}
}

class Employee: StoredEntitiy() {
	override fun store(){

	}
}

fun main(args: Array<String>){
	val entity = Employee() 
	println(entity.status())



}