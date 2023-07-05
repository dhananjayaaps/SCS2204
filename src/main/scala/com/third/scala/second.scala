package com.third.scala

object second {

  def filterStrings(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {

    val strings = List("apple", "banana", "grapefruit", "kiwi", "orange")
    val filteredStrings = filterStrings(strings)
    println(filteredStrings)
  }
}
