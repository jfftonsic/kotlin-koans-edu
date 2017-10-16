package collections.groupby

import collections.City
import collections.Customer
import collections.Shop

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy {it.city}