package com.xujie.chapter05.myexception

object ThrowDemo {
  def main(args: Array[String]): Unit = {
    try {
      test()
    } catch {
      case ex: Exception => println("捕获到异常" + ex.getMessage)
    } finally {

    }
    println("ok~~")
  }

  def test(): Nothing = {
    throw new Exception("异常出现~~")
  }
}
