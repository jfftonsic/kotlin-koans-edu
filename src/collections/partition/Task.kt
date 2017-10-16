package collections.partition

import collections.Customer
import collections.Shop

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
        customers.filter {
            val (delivered, undelivered) = it.orders.partition { it.isDelivered }
            undelivered.count() > delivered.count()
        }.toSet()