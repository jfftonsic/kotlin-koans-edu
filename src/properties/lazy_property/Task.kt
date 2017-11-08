package properties.lazy_property

class LazyProperty(val initializer: () -> Int) {

    private val lazyInt = lazy(initializer)
    val lazy: Int
        get() = lazyInt.value

}
