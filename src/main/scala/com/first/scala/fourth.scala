package com.first.scala

object fourth {
  def main(args: Array[String]) {

    val coverPrice = 24.95
    val discount = 0.4
    val shippingCostFirst50 = 3.0
    val shippingCostPerAdditional = 0.75

    val totalCopies = 60
    val discountedPrice = coverPrice * (1 - discount)
    val shippingCost = if (totalCopies <= 50) shippingCostFirst50 else shippingCostFirst50 + (totalCopies - 50) * shippingCostPerAdditional
    val totalWholesaleCost = discountedPrice * totalCopies + shippingCost

    println(totalWholesaleCost)

  }
}

