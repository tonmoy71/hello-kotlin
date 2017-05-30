package interop

import java.io.IOException

/**
 * Created by tonmoy on 30-May-17.
 */

data class CustomerKotlin(var id: Int, var name: String, var email: String, val phone: String?) {
    @JvmField val someField = 10

    @JvmOverloads
    fun changeStatus(status: Status = Status.CURRENT) {

    }

    @JvmName("preferential") fun makePreferred() {

    }

    @Throws(IOException::class) fun loadStatistics(fileName: String) {
        if (fileName == "") {
            throw IOException("File name can not be blank")
        }
    }
}

fun CustomerKotlin.extension() {

}

enum class Status {
    CURRENT,
    PAST
}
