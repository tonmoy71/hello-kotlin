object Global {		
	val PI = 3.1416		// Singleton
}

fun main(args: Array<String>){

	val localObject = object {
		val PI = 3.14
	}

	println(localObject.PI)
	println(Global.PI)
}