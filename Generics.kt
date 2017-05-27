interface Repository<T> {
	fun getById(id: Int): T
	fun getAll(): List<T>
}

class GenericRepository<T> : Repository<T> {
	override fun getById(id: Int): T {
		throw UnsupportedOperationException("Not implemented")
	}

	override fun getAll(): List<T> {
		throw UnsupportedOperationException("Not implemented")
	}

}

class Customer()

class Employee()

fun main(args: Array<String>){
	val customerRepo = GenericRepository<Customer>()
	customerRepo.getById(5)
	customerRepo.getAll()
}

