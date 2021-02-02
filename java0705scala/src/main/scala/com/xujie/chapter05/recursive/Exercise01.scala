package com.xujie.chapter05.recursive

object Exercise01 {
  //斐波那契
  def main(args: Array[String]): Unit = {
    println("斐波那的结果是:" + peach(1))
  }

  def fbn(n: Int): Int = {
    if (n == 1 || n == 2)
      1
    else
      fbn(n - 1) + fbn(n - 2)
  }

  //题二 就是简单的套用公式即可
  def f(n: Int): Int = {
    if (n == 1)
      3
    else
      2 * f(n - 1) + 1
  }

  //题3 猴子吃桃
  def peach(day: Int): Int = {
    if (day == 10)
      1
    else
      (peach(day + 1) + 1) * 2
  }

}
