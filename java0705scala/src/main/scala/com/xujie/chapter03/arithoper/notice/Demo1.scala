package com.xujie.chapter03.arithoper.notice

object Demo1 {
  def main(args: Array[String]): Unit = {
    val num = if (5 > 4) 5 else 4
    //val num2 = 5 > 4 ? 5: 4 error

    val n1 = 4
    val n2 = 8
    var res = if(n1 > n2) n1 else n2
    println("res = " + res)

    val n3 = 11
    res = if(res > n3) res else n3
    println("res = " + res)

    var num3 = 10
    num3  = ~1
    println(num3)
  }
}
