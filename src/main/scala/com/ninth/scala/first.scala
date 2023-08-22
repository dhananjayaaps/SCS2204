package com.ninth.scala

class Rational(numerator: Int, denominator: Int) {
  require(denominator != 0, "Denominator cannot be zero")

  private val gcdValue = gcd(numerator.abs, denominator.abs)
  val numer = numerator / gcdValue
  val denom = denominator / gcdValue

  def this(numerator: Int) = this(numerator, 1)

  override def toString: String = s"$numer/$denom"

  def neg: Rational = new Rational(-numer, denom)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object first {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val negX = x.neg
    println(s"x = $x")
    println(s"negX = $negX")
  }
}
