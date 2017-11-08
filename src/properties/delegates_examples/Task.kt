package properties.delegates_examples

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

