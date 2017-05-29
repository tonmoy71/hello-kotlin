fun unaryOperation(x: Int, op: (Int) -> Int){
	op(x)
}

fun outsideFunction(){
	
	for (number in 1..30) {
		unaryOperation(20, { x ->
			println(number)
		 	x * number 
		 })
	}

}

fun main(args: Array<String>){
	outsideFunction()
}