class Phone (var number: Int = 325, var model: String = "Samsung", var weight: Int = 66666) {

    constructor(number: Int, model: String) : this() {
        this.number = 8888
        this.weight = 77777
    }

    constructor(number: Int) : this() {

    }

    fun receiveCall(name: String = "Jeka") {
        println("Звонит $name")
    }

    fun receiveCall(name: String, number: Int) {
        println("Звонит $name. Номер: $number")
    }

    fun getNumber(): Int {
        return number
    }

    fun getModel(): String {
        return model
    }

    fun getWeight():Int {
        return weight
    }
}