open class Person(var name: String, var id: Int) {
	open fun validate(){

	}
}

open class Customer: Person {
	open override fun validate(){

	}

	constructor(): super(name = "Fahim", id = 123){

	}
}

class SpecialCustomer: Customer() {
	override fun validate(){

	}
}

data class CustomerEntity(val age: Int): Customer()

fun main(args: Array<String>){
	val customerEntity = CustomerEntity(10)
	println("${customerEntity.name}, ${customerEntity.id}, ${customerEntity.age}")
}