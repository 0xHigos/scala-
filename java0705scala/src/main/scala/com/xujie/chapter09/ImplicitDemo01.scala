package com.xujie.chapter09

object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {

    implicit def f1(d:Double):Int ={
      d.toInt
    }
    implicit def f2(d:Double) :Float = {
      d.toFloat
    }

    val num :Int = 3.5
    println(num)
  }
}
