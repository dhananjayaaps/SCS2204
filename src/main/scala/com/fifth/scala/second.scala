package com.fifth.scala

import scala.io.StdIn

object second {

  def primeSeq(n: Int, i: Int = 2): Unit = {
    if (n <= 2) {
      if (n == 2) {
        println(n)
      }
      return
    }
    if (n % i == 0) {
      return
    }
    if (i * i > n) {
      println(n)
      return
    }
    primeSeq(n, i + 1)
  }

  def main(args: Array[String]): Unit = {
    val input = StdIn.readLine().toInt
    for (i <- 2 to input) {
      primeSeq(i)
    }
  }
}
