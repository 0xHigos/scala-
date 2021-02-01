package com.xujie.chapter04.ifelse

import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]): Unit = {
    println("输入年龄")
    val age = StdIn.readInt;
    if (age > 18) {
      println("age > 18")
    }
  }
}
