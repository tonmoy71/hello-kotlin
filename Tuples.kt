fun capitalAndPopulation(country: String): Pair<String, Long> {
	return Pair("Dhaka", 160000000)
}

fun countryInfo(country: String): Triple<String, String, Long> {
	return Triple("Dhaka", "Asia", 160000000)
}

fun main(args: Array<String>) {
	val result = capitalAndPopulation("Bangladesh")

	println(result.first)
	println(result.second)

	val countryInfo = countryInfo("Bangladesh")
	
	println(countryInfo.first)
	println(countryInfo.second)
	println(countryInfo.third)

}