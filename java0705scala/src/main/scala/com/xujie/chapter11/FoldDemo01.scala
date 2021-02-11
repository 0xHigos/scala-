package com.xujie.chapter11

object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 9)
    val res = list.foldLeft(1)(minus)
    println("res =" + res)

    val res2 = (1 /: list)(minus)
    println("res2" + res2)
  }

  def minus(n1: Int, n2: Int): Int = {
    n1 - n2
  }
}
