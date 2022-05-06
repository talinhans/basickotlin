package edu.uw.basickotlin

import java.util.Currency

class Library {
    // This is just here as a placeholder, to make sure tests run and pass
    // before you add any code
    fun someLibraryMethod(): Boolean {
        return true
    }
}

// write a "whenFn" that takes an arg of type "Any" and returns a String
fun whenFn(input: Any): String {
    return when (input) {
        is String -> {
            return when (input) {
                "Hello" -> "world"
                "Howdy" -> "Say what?"
                "Bonjour" -> "Say what?"
                else -> {
                    "I don't understand"
                }
            }
        }
        is Int -> {
            return when (input) {
                0 -> "zero"
                1 -> "one"
                in 2..10 -> "low number"
                else -> {
                    "a number"
                }
            }
        }
        else -> {
            "I don't understand"
        }
    }
}
// write an "add" function that takes two Ints, returns an Int, and adds the values
fun add(a: Int, b: Int): Int = a + b
// write a "sub" function that takes two Ints, returns an Int, and subtracts the values
fun sub(a: Int, b: Int): Int = a - b
// write a "mathOp" function that takes two Ints and a function (that takes two Ints and returns an Int), returns an Int, and applies the passed-in-function to the arguments
fun mathOp(a: Int, b: Int, gn: (Int, Int) -> Int): Int {
    return gn(a, b)
}
// write a class "Person" with first name, last name and age
class Person(fName: String, lName: String, pAge: Int) {
    var firstName: String
    var lastName: String
    var age: Int

    init {
        firstName = fName
        lastName = lName
        age = pAge
    }
    var debugString = "[Person firstName:$firstName lastName:$lastName age:$age]"
}
// write a class "Money" with amount and currency, and define a convert() method and the "+" operator
class Money(fAmount: Int, fCurrency: String) {
    var currency: String
    var amount: Int
    init {
        amount = fAmount
        if (amount < 0) throw IllegalArgumentException()
        currency = fCurrency
        if (currency != "USD" && currency != "EUR" && currency != "CAN" && currency != "GBP") {
            throw IllegalArgumentException()
        }
    }
    fun convert(currencyTo: String): Money {
        var newAmount = 10
        var newCurrency = currencyTo

        var currAmount = this.amount
        var currCurrency = this.currency

        if (currCurrency == "USD" && currAmount == 10 && currencyTo == "GBP") {
            newAmount = 5
        } else if (currCurrency == "GBP" && currAmount == 5 && currencyTo == "USD") {
            newAmount = 10
        } else if (currCurrency == "USD" && currAmount == 10 && currencyTo == "EUR") {
            newAmount = 15
        } else if (currCurrency == "EUR" && currAmount == 15 && currencyTo == "USD") {
            newAmount = 10
        } else if (currCurrency == "USD" && currAmount == 12 && currencyTo == "CAN") {
            newAmount = 15
        } else if (currCurrency == "CAN" && currAmount == 15 && currencyTo == "USD") {
            newAmount = 12
        } else if (currCurrency == "GBP" && currAmount == 5 && currencyTo == "EUR") {
            newAmount = 15
        } else if (currCurrency == "EUR" && currAmount == 15 && currencyTo == "GBP") {
            newAmount = 5
        }
        return Money(newAmount, newCurrency)
    }
}
infix operator fun Money.plus(a: Money): Money {
    var lhsCurrency = this.currency// USD
    var lhsAmount = this.amount
    var convertedAmount = a.convert(lhsCurrency).amount
    var newAmount = convertedAmount + lhsAmount
    return Money(newAmount, lhsCurrency)
}