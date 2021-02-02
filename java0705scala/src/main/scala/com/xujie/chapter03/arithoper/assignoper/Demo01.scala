package com.xujie.chapter03.arithoper.assignoper

object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 2
    var num2 = 4
    //0010 ^ 0100 = 0110
    num ^= num2
    // 0110 ^ 0100 = 0010
    num2 ^= num
    // 0110 ^ 0010 = 0100
    num ^= num2
    val res = {
      if (num > 3) "hello ok" else 100
    }
    println("num = " + num)
    println("num2 = " + num2)
    println("res = " + res)
  }
}
