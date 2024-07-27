package ru.netology


fun main() {
    val purchaseAmount = 10000
    val isRegularCustomer: Boolean = true
    var discount = 0.0

    discount = when {
        purchaseAmount in 1..1000 -> 0.0
        purchaseAmount in 1001..10000 -> 100.0
        purchaseAmount >= 10001 -> purchaseAmount * 0.05
        else -> 0.0
    }

    var totalAmount = purchaseAmount - discount


    if (isRegularCustomer) {
        totalAmount *= 0.99
    }

    println("Итоговая стоимость покупки: ${totalAmount.toInt()} руб.")
}