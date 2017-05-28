open class Person {

}

class Employee: Person() {
	fun vacationDays(days: Int) {
		if (days < 60){
			println("You need more vacation")
		}
	}
}

class Contractor: Person() {

}

fun hasVacations(obj: Person) {
	if (obj is Employee) {
		obj.vacationDays(50)		// Smart casting, no need to explicitly cast Person into Employee
	}
	else {
		//obj.vacationDays(10)		// Compile error, won't find vacationDays() as it is not of type Employee
	}
}

var input: Any = 10

fun main(args: Array<String>) {
	val str = input as? String		// Will throw ClassCastException without the safe call operator

	println(str?.length)
}