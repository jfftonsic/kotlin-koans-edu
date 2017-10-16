package collections.max_min

import collections.Customer
import collections.Product
import collections.Shop

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy {it.orders.count()}

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap({it.products}).maxBy({it.price})