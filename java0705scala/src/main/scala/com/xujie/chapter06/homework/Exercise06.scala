package com.xujie.chapter06.homework

object Exercise06 {
  def main(args: Array[String]): Unit = {
    var res = 1L
    "Hello".foreach(res *= _.toLong)
    println("res = " + res)

    var res2 = 1L
    "Hello".foreach(myCount)
    println("res = " + res2)

    def myCount(char:Char):Unit ={
      res2 *= char.toLong
    }

  }

}
