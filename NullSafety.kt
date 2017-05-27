class Service {
	fun evaluate(){

	}
}

class ServiceProvider {
	fun createService(): Service? {
		return null
	}
}

private fun createServiceProvider(): ServiceProvider? =  ServiceProvider()


fun main(args: Array<String>){
	val message: String = "A message"
	val nullMessage: String? = null
	val inferredNull = null

	//println(nullMessage.length)		// Compile time error
	println(nullMessage?.length)		// Elvis operator ?.

	val serviceProvider = createServiceProvider()
	serviceProvider?.createService()?.evaluate()

	// Double hashbang operator, I know what I'm doing. 
	// Let me handle the NPE and don't complain.
	println(nullMessage!!.length)		
}