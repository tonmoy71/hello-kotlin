import java.util.*

class Customer() {
	var name: String = ""		// property must be initialized
		set(value) {
			if (value.length == 0){
				throw IllegalArgumentException("name can't be empty")
			}
			field = value
		}

	var age: Int = 1
		set(value) {
			if (value <= 0){
				throw IllegalArgumentException("age can't be negative or zero")
			}
			field = value
		}

	fun showCustomerInfo(): String {
		return "Name: $name, age: $age"
	}
}
		



fun main(args: Array<String>){
	val customer = Customer()
	customer.name = "Fahim"
	customer.age = 10

	println(customer.showCustomerInfo())

}

	






