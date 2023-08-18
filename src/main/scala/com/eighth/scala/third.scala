package com.eighth.scala

object third {

  def capitalizeAtIndex(input: String, index: Int): String = {
    if (index < 0 || index >= input.length) {
      throw new IllegalArgumentException("Invalid index")
    }

    val before = input.substring(0, index)
    val after = input.substring(index + 1)
    val charToCapitalize = input.charAt(index).toUpper

    before + charToCapitalize + after
  }

  def toUpper(input: String): String = {
    input.toUpperCase
  }

  def toLower(input: String): String = {
    input.toLowerCase
  }

  def formatNames(name: String)(format: String => String): String = {
    format(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    names.foreach(name => println(formatNames(name)(toUpper)))
    names.foreach(name => println(formatNames(name)(toLower)))
    names.foreach(name => println(formatNames(name)(capitalizeAtIndex(_, 2))))
  }

}
