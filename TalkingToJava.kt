package interop

/**
 * Created by tonmoy on 30-May-17.
 */

fun main(args: Array<String>) {
    val customer = CustomerJava()
    customer.email = "name@email.com"
    customer.prettyPrint()

    // Single Abstract Method (SAM)
    val runnable = Runnable { println("Invoking runnable") }

    val customerRepo = KotlinCustomerRepository()
    val customerJava = customerRepo.getById(10)
    customerJava.id.toString()

    customer.sometimesNull()        // Using @NotNull for not returning any null value
    customer.neverNull()            // Returns platform-specific type which is Nullable


}

class PersonKotlin : Person() {

}

class RunnableKotlin : Runnable {
    override fun run() {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

}

class KotlinCustomerRepository : CustomerRepository {
    override fun getById(id: Int): CustomerJava {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}