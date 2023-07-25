package com.fifth.scala

object fourth {

  def evenOdd(num: Int): String = {
    if (num == 0) {
      return "Even"
    }
    else if (num == 1) {
      return "Odd"
    }
    else {
      return evenOdd(num - 2)
    }
  }

  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine().toInt
    val result = evenOdd(input)
    println(result)
  }
}
