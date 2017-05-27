data class Customer(var name: String, var id: Int) {
	override fun toString(): String {
		return "Name: $name, ID: $id"
	}
}

fun main(args: Array<String>) {
	val customer1 = Customer("Fahim", 123)
	val customer2 = customer1.copy(name = "Choudhury")

	println(customer1)
	println(customer2)

}