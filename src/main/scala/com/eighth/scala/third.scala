package com.eighth.scala

object Third {

  def toUpper: String => String = input => input.toUpperCase

  def toLower: String => String = input => input.toLowerCase

  def capitalizeAtIndex: (String, Int) => String = (input, index) => {
    val before = input.substring(0, index)
    val after = input.substring(index + 1)
    val charToCapitalize = input.charAt(index).toUpper

    before + charToCapitalize + after
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
