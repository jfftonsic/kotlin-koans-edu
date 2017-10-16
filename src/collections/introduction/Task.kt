package collections.introduction

import collections.Customer
import collections.Shop

fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()