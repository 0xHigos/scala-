package com.xujie.chapter11

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 20, 30, 4, 5)
    val res = list.reduceLeft(sum)
    println("res =" + res)
  }

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
