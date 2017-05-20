fun main(args: Array<String>){
	for(a in 1..10){
		println(a)
	}

	// Range [incluseive]
	val numbers = 1..100
	for(a in numbers){
		print("$a, ")
	}

	// Reverse loop
	for(a in 100 downTo 1){
		print("$a, ")
	}

	// This prints nothing
	for(a in 100..1){
		print("Hi $a, ")
	}

	for (b in 100 downTo 2 step 6){
		print("$b, ")
	}

	val capitals = listOf("Dhaka", "Delhi", "Kathmandu", "NewYork")
	for(capital in capitals){
		println(capital)
	}

	// Need to use var here
	var i = 100
	while(i > 0){
		print("While loop, value of i:$i, ")
		i--;
	}

	var x = 10
	do {
		println("do while loop, value of x: $x")
		x-- 
	} while(x >= 10)

	firstLoop@ for(i in 1..100){
		secondLoop@ for(j in 1..250){
			if (j % i == 0){
				println("Breaking out from second loop, i = $i, j = $j")
				break@secondLoop
			}
		}
	}


}