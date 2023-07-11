package com.fifth.scala

object sixth {

  def fibonacci(num: Int): Int = {
    if (num == 0) {
      return 0
    }
    else if (num == 1) {
      return 1
    }
    else {
      val final = fibonacci(num - 1).toInt + fibonacci(num - 2).toInt
      println(final)
      return final
    }
  }

  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine().toInt
    fibonacci(input)
  }
}
