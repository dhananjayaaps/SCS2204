package com.third.scala

import scala.io.StdIn

object first {

  def reverseString(input: String): String = {
    if (input.isEmpty) {
      ""
    } else {
      reverseString(input.tail) + input.head
    }
  }

  def main(args: Array[String]): Unit = {

    val str = StdIn.readLine()
    val reversedStr = reverseString(str)
    println(reversedStr)

  }
}
