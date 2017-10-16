package collections.all_any_and_other_predicates

import collections.City
import collections.Customer
import collections.Shop

// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all {it.city.equals(city)}

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any {it.city.equals(city)}

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int = customers.count {it.city.equals(city)}

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find {it.city.equals(city)}