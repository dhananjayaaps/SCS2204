package com.fifth.scala

import scala.io.StdIn

object first {
  def prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2) {
      if (n == 2) {
        return true
      } else {
        return false
      }
    }
    if (n % i == 0) {
      return false
    }
    if (i * i > n) {
      return true
    }
    return prime(n, i + 1)
  }

  def main(args: Array[String]): Unit = {
    val input = StdIn.readLine().toInt
    if (prime(input)) {
      println("Prime")
    } else {
      println("Not Prime")
    }
  }
}
