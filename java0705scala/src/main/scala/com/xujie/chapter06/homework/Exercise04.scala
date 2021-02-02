package com.xujie.chapter06.homework

object Exercise04 {
  def main(args: Array[String]): Unit = {
    val n = 3
    val res1 = (0 to n).reverse
    println(res1)
    res1.foreach(myShow)

  }

  //定义一个myShow
  def myShow(n: Int): Unit = {
    println(n)
  }
}
