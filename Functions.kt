fun hello(): Unit {
	println("Hello")
}

fun throwsException(): Nothing {
	throw Exception("This function always throws an exception")
}

// Single expression function
fun sum(a: Int, b: Int, c: Int = 0) = (a + b) * c

fun printDetails(name: String, email: String = "default@domain.com", phone: String){
	println("name: $name - email: $email, phone: $phone")
}

// Functions with undefined parameters list, using vararg
fun printStrings(vararg strings: String){
	for(string in strings){
		println(string)
	}
}

fun main(args: Array<String>) {
	hello()
	//throwsException()

	// Using Default parameter
	println(sum(10, 4))
	println(sum(4, 6, 10))

	// Named parameter
	printDetails("Fahim", phone = "123 123", email = "fahim@domain.com")

	//printStrings()
	//printStrings("a")
	//printStrings("a", "b")
	//printStrings("a", "b", "c")

	// Spread operator (*)
	val array = arrayOf("One", "Two", "Three")
	printStrings("1", "2",  *array, "3")

}






