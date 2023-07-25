package com.fifth.scala

import scala.io.StdIn

object third {

  def sum(num: Int): Double = {
    if (num == 0){
      return 0
    }
    else return num + sum(num - 1)
  }

  def main(args: Array[String]): Unit = {
    val input = StdIn.readLine().toInt
    val total = sum(input)
    println("total = " + total)
  }

}
