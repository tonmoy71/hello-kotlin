fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
	return op(x, y) 
} 

fun sum(x: Int, y: Int) = x + y

fun difference(x: Int, y: Int) = x - y

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
	return op(x)
}

fun transaction(db: Database, code: () -> Unit) {
	try {
		code()
	} finally {
		db.commit()
	}
}

class Database{
	fun commit() { }
}

fun main(args: Array<String>){

	println(operation(1, 2, ::sum))
	println(operation(20, 10, ::difference))

	// Lambda expression

	// No need to specify type i.e. { x: Int, y: Int -> x + y }
	// because compiler car infer the type from the function invocation
	println(operation(5, 6, { x, y -> x + y }))		
	println(operation(20, 10, { x, y -> x - y }))

	// Need to specify type here as compiler doesn't know about the type 
	// and where it is going to be used
	val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
	val differenceLambda: (Int, Int) -> Int = { x, y -> x - y }

	println(operation(3, 3, sumLambda))
	println(operation(4, 5, differenceLambda))

	println(unaryOperation(3, { x -> x * x}))
	println(unaryOperation(4, { it * it }))		// Single parameter lambda, reference using "it"

	transaction(db) {
		// interact with database
	}

	unaryOperation(3, fun (x: Int): Int { reuturn x * x})		// Anonymous function

}

