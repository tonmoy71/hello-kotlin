fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
	return op(x, y) 
} 

fun sum(x: Int, y: Int) = x + y

fun difference(x: Int, y: Int) = x - y

fun main(args: Array<String>){

	println(operation(1, 2, ::sum))

	println(operation(20, 10, ::difference))
}

