interface CustomerRepository{
	val isEmpty: Boolean
		get() = true

	fun getById(id: Int): Customer

	fun store(obj: Customer){		// default methods
		// implement code to store
	}
}

class Customer(val name: String, val id: Int = 1)

class SqlCustomerRepository: CustomerRepository {
	override fun getById(id: Int): Customer{
		return Customer(name = "Fahim")
	}

	override fun store(obj: Customer) {

	}

	override val isEmpty: Boolean
		get() = false

}

/*
fun main(args: Array<String>){
	val customer = SqlCustomerRepository()
	println(customer.getById(5).name)
}
*/

interface Interface1 {
	fun funA() {
		println("funA() from interface 1")
	}
}

interface Interface2 {
	fun funA() {
		println("funA() from interface 2")
	}
}

class Class1and2: Interface1, Interface2 {
	override fun funA() {
		super<Interface2>.funA()		//Specifying which interface to use
	}
}

fun main(args: Array<String>){
	val c = Class1and2()
	c.funA()
}