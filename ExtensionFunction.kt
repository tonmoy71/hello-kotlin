fun String.hello() {
	println("Its me!")
}

fun String.toTitleCase(): String {
	return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun main(args: Array<String>) {
	println("this is an example of Title case".toTitleCase())

	val customer = Customer()
	customer.makePreferred()		// memeber function will be called by preference as both have same signature

	val instance: BaseClass = InheritedClass()
	instance.extended()			// Base version will be called as the type is statically checked

	val instance2 = InheritedClass()
	instance2.extended()		// Inherited version will be called

}

class Customer {
	fun makePreferred(){
		println("Customer version")
	}
}

fun Customer.makePreferred () {
	println("Extended version")
}

open class BaseClass

class InheritedClass: BaseClass()

fun BaseClass.extended() {
	println("Base extended")
}

fun InheritedClass.extended() {
	println("Inherited extended")
}

