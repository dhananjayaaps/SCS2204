package com.eighth.scala

object first {

  def main(args: Array[String]): Unit = {
      def calculateInterest(depositAmount: Double): Double = {
        val interestRate: Double => Double = {
          case amount if amount <= 20000 => 0.02
          case amount if amount <= 200000 => 0.04
          case amount if amount <= 2000000 => 0.035
          case _ => 0.065
        }

        val interest = depositAmount * interestRate(depositAmount)
        interest
      }

      def main(args: Array[String]): Unit = {
        val depositAmount = 250000
        val interest = calculateInterest(depositAmount)
        println(s"For a deposit of Rs. $depositAmount, the interest earned is Rs. $interest")
      }
    }
}
