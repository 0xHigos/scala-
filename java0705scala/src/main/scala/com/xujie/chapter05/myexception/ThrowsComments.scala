package com.xujie.chapter05.myexception

object ThrowsComments {
  def main(args: Array[String]): Unit = {
    f11()
  }

  @throws(classOf[NumberFormatException]) // 等同与NumberFormatException.class
  def f11() ={
    "abc".toInt
  }
}
