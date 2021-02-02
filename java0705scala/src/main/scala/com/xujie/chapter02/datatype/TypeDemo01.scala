package com.xujie.chapter02.datatype

object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    // 因为Int 是一个类，因此他的一个实例，就是可以使用很多方法
    var num1: Int = 10
    println(num1.toDouble + num1.toString + 100.toDouble)

    var isPass = true
    println(isPass.toString)
    sayHi
    sayHi()
  }

  def sayHi(): Unit = {
    println("sayHi")
  }
}
