class Customer(var id: String, var name: String, var email: String = "default@domain.com") {
	// Kotlin doesn't have any concept of field, 
	// all it have are property
	init{
		name = name.toUpperCase()
	}
	
	constructor(_email: String) : this("001", "What's my name?") {
		email = _email.toLowerCase()
	}
}

fun main(args: Array<String>){
	val customer = Customer(name = "Fahim Masud Choudhury", id = "BD00055")
	val customer2 = Customer("FAHIM@GMAIL.COM")
	
	println("Name: ${customer.name}, id: ${customer.id}")
	println("Name: ${customer.name}, id: ${customer.id}, email: ${customer2.email}")
}