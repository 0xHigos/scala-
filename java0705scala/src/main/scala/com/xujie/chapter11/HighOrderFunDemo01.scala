package com.xujie.chapter11

object HighOrderFunDemo01 {
  def main(args: Array[String]): Unit = {

    val rest = test(sum2 _, 3.5)
    println(rest)

    var f1 = myPrint _
    f1()
  }

  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  def sum2(d: Double): Double = {
    println("sum2 被调用")
    d + d
  }

  def myPrint(): Unit ={
    println("hello world")
  }
}
