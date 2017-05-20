fun main(args: Array<String>){
	var text = "Not empty"
	if (text == ""){
		println("Text not empty")
	}
	else if (text.startsWith("N")){
		println("Text starts with N")
	}
	else {
		println("Nothing")
	}

	// Assigning conditional result into a variable
	val result = if ( 100 % 10 == 0){
		println("Remainder 0")
		// Returns the last value of the expression as result, here kotlin.Unit

		
	}
	else {
			"Remainder not zero"
	}
	println(result)

	// when
	val temp = "A value"
	val whenValue = when (temp){
		"A value", is String -> {
		println("It is a value")
		println("It is a string")
		"Returns a value"
		// breaks after execution of the block
	}		
		else -> println("Else statement")
	}
	println(whenValue)

	// Using when as if-else if chain, no argument needed
	val x = 50
	when {
		x in 1..100 -> println("Within range 1 to 100")
		x !in 101..200 -> println("Out of range")

	}
	
}