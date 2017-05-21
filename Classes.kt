import java.util.*

class Customer(var id: String, var name: String, val yearOfBirth: Int) {
	val age: Int
		get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

	var socialSecurityNumber: String = ""
		set(value) {
			if(!value.startsWith("SN")){
				throw IllegalArgumentException("Social Security Number must start with SN")
			}
			field = value

		}

}

fun main(args: Array<String>){
	val customer = Customer("001", "Fahim", 1990)
	customer.socialSecurityNumber = "SN123"
	println("Name: ${customer.name}, ID: ${customer.id}, SSN: ${customer.socialSecurityNumber}, Age: ${customer.age}")
	
}