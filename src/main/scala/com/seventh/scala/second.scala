package com.seventh.scala

object second {

  def calculateSqure(numbers: List[Int]): List[Int] = {
    numbers.map(num => (num * num))
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val outputList = calculateSqure(inputList)

    println(outputList)

  }
}
