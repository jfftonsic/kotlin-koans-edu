package collections.flatmap

import collections.Customer
import collections.Product
import collections.Shop

// Return all products this customer has ordered
val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap({it.products}).toSet()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap({it.orders}).flatMap({it.products}).toSet()
}