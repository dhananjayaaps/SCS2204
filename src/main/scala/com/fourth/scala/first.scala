package com.fourth.scala

object first {

  def calculateInterest(depositAmount: Double): Double = {

    val interestAmount = depositAmount match {
      case amount if amount <= 20000 => depositAmount * 0.02
      case amount if amount <= 200000 => depositAmount * 0.04
      case amount if amount <= 2000000 => depositAmount * 0.035
      case _ => depositAmount * 0.065
    }
    interestAmount
  }

  def main(args: Array[String]): Unit = {

    val depositAmount = 2000000
    val interest = calculateInterest(depositAmount)
    println(interest)

  }
}
