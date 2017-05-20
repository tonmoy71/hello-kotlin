fun main(args: Array<String>){

	// Use var  for mutable objects
	var streetNumber: Int = 5
	var streetName: String = "Humayun Road"

	//Use val for immutable objects
	val houseNumber = 5
	val blockName = "B#5"

	// blockName can't be changed as it is immutable
	//blockName = "A#9"

	println("$streetName, $streetNumber, $houseNumber, $blockName")

	val myLong = 10L
	val myFloat = 1.3F
	val myHex = 0xFFB
	val myBinary = 0xb0110

	val myInt = 10

	// Helper method to convert to Long
	//myLongAgain = myInt.toLong()

	// Integer to integer, no type conversion
	val myLongAgain = myInt		

	// No implicit type conversion supported, this won't compile
	//val myLongAgain: Long = myInt

	// Strings

	val myChar = 'A'
	val myString = "Hello"
	
	val escapeChars = "Hello \n World!"

	// This is not multiline
	val rawString = "Hello " + 
		"World " + 
		"Again!"

	// Multiline strings
	val multilineString = """
	This is a multiline string.
	This is second line.
	This is another line."""

	// String interpolation
	val years = 10
	val message = "A decade is $years years"

	val count = "Message is ${message.length} characters long"

}