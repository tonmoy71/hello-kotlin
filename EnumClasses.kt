enum class Priority(val value: Int) {
	LOW(0) {
		override fun text(): String{
			return "Low Priority"
		}
	},
	MEDIUM(1) {
		override fun text(): String {
			return "Medium priority, hmm... let me check this"
		}
	},
	HIGH(1) {
		override fun text(): String {
			return "Attention! High priority, mission critical!!"
		}
	};		// Need semicolon here

	abstract fun text(): String
}

fun main(args: Array<String>){
	var priority = Priority.HIGH
	println(priority)
	println(priority.value)

	println(Priority.HIGH.ordinal)		// Position of the enum item, starting from 0
	println(Priority.HIGH.name)

	for(priority in Priority.values()){
		println(priority.text())
	}

	val value = Priority.valueOf("MEDIUM")
	println(value)

	priority = Priority.LOW
	println(priority)

}