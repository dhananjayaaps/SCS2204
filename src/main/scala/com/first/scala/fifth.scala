package com.first.scala

object fifth {
  def main(args: Array[String]) {

    val easyPace = 8
    val tempoPace = 7

    val distance1 = 2
    val distance2 = 3
    val distance3 = 2

    val time1 = easyPace * distance1
    val time2 = tempoPace * distance2
    val time3 = easyPace * distance3

    val totalRunningTime = time1 + time2 + time3

    println(totalRunningTime)


  }
}
