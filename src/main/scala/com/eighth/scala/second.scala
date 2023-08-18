package com.eighth.scala

object second {

  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readInt()

    val message = input match {
      case n if n < 0 => "Negative input"
      case n if n == 0 => "Zero input"
      case n if n % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    println(message)
  }
}