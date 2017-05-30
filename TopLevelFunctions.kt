@file:JvmName("UtilityClass")
package interop

/**
 * Created by tonmoy on 30-May-17.
 */

const val CopyrightYear = 2017

fun prefix(prefix: String, value: String): String {
    return "$prefix-$value"
}