package com.eighth.scala

object first {

  def Interest(deposit: Double): Double = {
    val interestRate: Double => Double = {
      case amount if amount <= 20000 => 0.02
      case amount if amount <= 200000 => 0.04
      case amount if amount <= 2000000 => 0.035
      case _ => 0.065
    }

    val interest = deposit * interestRate(deposit)
    interest
  }

  def main(args: Array[String]): Unit = {
    val deposit = 250000
    val interest = Interest(deposit)
    println(s"For a deposit of Rs. $deposit, the interest earned is Rs. $interest")
  }

}
