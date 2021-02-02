package com.xujie.chapter03.arithoper

object Demo01 {
  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3
    println("r1" + r1)
    var r2: Double = 10 / 3.0
    println("r2 = " + r2)
    var r3: Double = 10.0 / 3
    println("r3 = " + r3)
    println("r3 =" + r3.formatted("%.2f"))

    // %的运算原则： a % b =  a - a/b * b
    // %的原则： 取模的符号总是和被除数保持一致
    println(10 % 3)
    println(-10 % 3)
    println(-10 % -3)
    println(10 % -3)

    //在scala中，没有++和-- 而使用 +=1 和 -=1
    var num1 = 10
//    num1++
    num1 += 1
    num1 -= 1
    println("num1 = " + num1)

  }
}
