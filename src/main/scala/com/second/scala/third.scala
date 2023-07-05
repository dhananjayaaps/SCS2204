package com.second.scala


object third {
  def main(args: Array[String]) {

    def calSalary(normalHours: Int, otHours: Int): Double = {
      val normalRate: Double = 250.0
      val otRate: Double = 85.0
      val taxRate: Double = 0.12

      val grossPay: Double = normalHours * normalRate + otHours * otRate
      val taxAmount: Double = grossPay * taxRate
      val finalSalary: Double = grossPay - taxAmount

      finalSalary
    }

    val normalHours = 40
    val otHours = 30

    val finalSalary = calSalary(normalHours, otHours)
    println(s"Final salary is Rs. $finalSalary")

  }
}
