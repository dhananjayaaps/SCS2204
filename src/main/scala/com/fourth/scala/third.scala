package com.fourth.scala

object third {

  def toUpper(input: String): String = {
    input.toUpperCase
  }

  def toLower(input: String): String = {
    input.toLowerCase
  }

  def formatNames(str: String, index: Int): String = {
    if (index >= 0 && index < str.length) {
      val charToChange = str.charAt(index)
      val updatedChar = charToChange.toUpper
      str.updated(index, updatedChar)
    } else {
      str
    }

  }

  def main(args: Array[String]): Unit = {
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(toUpper(name1))
    println(formatNames(name2, 1))
    println(toLower(name3))
    println(formatNames(name4, 5))
  }
}
