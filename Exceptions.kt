import java.io.*

class NotANumberException(msg: String): Throwable(msg) {

}

fun checkIsNumber(obj: Any){
	when(obj){
		!is Int, Long, Float, Double -> throw NotANumberException("This was not a number")
	}
}

fun main(args: Array<String>){
	/*
	try {
		checkIsNumber("5")
	} catch(e: NotANumberException) {
		println("${e.message}")
	}
	*/

	val buffer = BufferedReader(FileReader("input.txt"))
	val result = try{
		val chars = CharArray(30)
		buffer.read(chars, 0, 40)
	} catch (e: IndexOutOfBoundsException) {
		println("Exception handled")
		// result will hold this value and it will be returned
		1		
	} finally {
		println("Closing")
		buffer.close()
		// This value will not be returned
		"Will not be returned"
	}

	println(result)
}