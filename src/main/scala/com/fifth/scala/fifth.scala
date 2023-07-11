package com.fifth.scala

object fifth {

  def sumEven(num: Int): Int = {
    if (num == 0) {
      return 0
    }
    else if (num % 2 == 0) {
      return num + sumEven(num - 2)
    }
    else {
      return sumEven(num - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine().toInt
    val result = sumEven(input)
    println(result)
  }

}
