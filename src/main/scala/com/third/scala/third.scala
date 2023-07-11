package com.third.scala

object third {

  def calculateAverage(num1: Int, num2: Int): Double = {
    val sum = num1 + num2
    val average = sum.toDouble / 2
    BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 7
    val average = calculateAverage(num1, num2)
    println(average)
  }

}