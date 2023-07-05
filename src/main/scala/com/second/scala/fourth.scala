package com.second.scala

import scala.math.BigDecimal.double2bigDecimal

object fourth {
  def main(args: Array[String]) {
    def calculateProfit(ticketPrice: Double): Double = {
      val baseAttendance = 120
      val attendanceIncrease = 20
      val costPerPerformance = 500.0
      val costPerAttendee = 3.0

      val attendance = baseAttendance - (ticketPrice - 15) / 5 * attendanceIncrease
      val revenue = attendance * ticketPrice
      val cost = costPerPerformance + attendance * costPerAttendee
      val profit = revenue - cost

      profit
    }

    val ticketPrices = List(0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0)

    ticketPrices.foreach { price =>
      val profit = calculateProfit(price)
      println(s"Ticket price: Rs. $price, Profit: Rs. $profit")


    }

  }
}
