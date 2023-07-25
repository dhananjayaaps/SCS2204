package com.sixth

object first {

    def encrypt(input: String, shift: Int): String = {
      input.map(c => (c + shift).toChar)
    }

    def decrypt(input: String, shift: Int): String = {
      input.map(c => (c - shift).toChar)
    }

    def cipher(input: String, shift: Int, f: (String, Int) => String): String = {
      f(input, shift)
    }

    def main(args: Array[String]): Unit = {

      val str = "Hello World!"
      val shift = 3
      val encryptedStr = cipher(str, shift, encrypt)
      val decryptedStr = cipher(encryptedStr, shift, decrypt)
      println(encryptedStr)
      println(decryptedStr)

    }

}
