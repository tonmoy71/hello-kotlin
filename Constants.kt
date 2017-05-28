val CopyrightAuthor = "Fahim Choudhury"

object Copyright {
	val author = "Fahim Choudhury"
	val year = "2017"
	val text = "All rights reserved"
}

fun main(args: Array<String>) {
	println("Copyright ${Copyright.author}, ${Copyright.year} -  ${Copyright.text}")
	println(CopyrightAuthor)
}