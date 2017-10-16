package collections.fold

import collections.Product
import collections.Shop

// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
   return customers.fold(customers.first().orders.first().products.toMutableSet()
           , {
        currSet, nextCustomer ->
        currSet.removeAll { it !in nextCustomer.orders.flatMap { it.products } }
        return currSet
    })
}