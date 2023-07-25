package com.fifth.scala

object sixth {

  def fibbancci(num: Int): Int = {
    if (num == 0) {
      return 0
    }
    else if (num == 1) {
      return 1
    }
    else {
      return fibbancci(num - 1) + fibbancci(num - 2)
    }
  }

  //main
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine().toInt
    for (i <- 0 to input) {
      val result = fibbancci(i)
      println(result)
    }
  }
}
