package builders.string_and_map_builders

import java.util.*

fun buildMap(eita: HashMap<Int, String>.() -> Unit): Map<Int, String> {
    val map = HashMap<Int, String>()
    map.eita()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        this.put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
