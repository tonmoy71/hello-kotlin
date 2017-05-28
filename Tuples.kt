fun capitalAndPopulation(country: String): Pair<String, Long> {
	return Pair("Dhaka", 160000000)
}

fun countryInfo(country: String): Triple<String, String, Long> {
	return Triple("Dhaka", "Asia", 160000000)
}

data class Customer(val name: String, val id: String, val age: Int)

fun main(args: Array<String>) {
	
	// Deconstructing values

	//var (capital, population) = capitalAndPopulation("Bangladesh")
	//println("Capital: $capital, Population: $population")

	var (capital, continent, population) = countryInfo("Bangladesh")
	println("Capital: $capital, Continent: $continent, Population: $population")	

	val (id, name, email) = Customer("001", "Fahim", 1)
	println("$id, $name, $email")

	val listCapitalAndCountry = listOf(Pair("Madrid", "Spain"), "Dhaka" to "Bangladesh")

	for ((capital, country) in listCapitalAndCountry) {
		println("$capital, $country")
	}


}