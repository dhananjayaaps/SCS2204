package com.fourth.scala

object second {

  def main(args: Array[String]): Unit = {
    val input = args(0).toInt
    input match {
      case num if num <= 0 => println("Negative/Zero is input")
      case num if num % 2 == 0 => println("Even number is given")
      case num if num % 2 != 0 => println("Odd number is given")
    }
  }
}
