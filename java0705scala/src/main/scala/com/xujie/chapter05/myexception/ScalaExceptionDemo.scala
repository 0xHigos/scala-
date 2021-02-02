package com.xujie.chapter05.myexception

object ScalaExceptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      val r = 10 / 0
    } catch {
      case _: ArithmeticException => println("捕获了除数为零的算数异常")
      case ex: Exception => println("捕获了异常")
    } finally {
      println("ok,继续执行")
    }
  }


}
