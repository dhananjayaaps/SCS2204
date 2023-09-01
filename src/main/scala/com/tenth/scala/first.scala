package com.tenth.scala

object first {

  def calculateAverage(temperaturesInCelsius: List[Double]): Double = {
    val temperaturesInFahrenheit = temperaturesInCelsius.map(celsius => (celsius * 9 / 5) + 32)

    val totalFahrenheit = temperaturesInFahrenheit.reduce(_ + _)
    val averageFahrenheit = totalFahrenheit / temperaturesInFahrenheit.length.toDouble

    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val temperatures = List(34.0, 36.0, 37.0)
    val averageFahrenheit = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}
