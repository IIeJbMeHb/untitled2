fun main() {

    val phone = Phone()
    val phoneOne = Phone(58518, "LG")

    println(phone.number)
    println(phone.model)
    println(phone.weight)
    println("-".repeat(15))

    phone.receiveCall()
    println("-".repeat(15))

    println("number: ${phoneOne.number}, Weight: ${phoneOne.weight}")

    println("-".repeat(15))
    phone.receiveCall(name = "Vadik", number = 9595)
}


