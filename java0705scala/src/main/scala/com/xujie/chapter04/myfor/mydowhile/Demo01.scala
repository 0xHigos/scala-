package com.xujie.chapter04.myfor.mydowhile

object Demo01 {
  def main(args: Array[String]): Unit = {
    var i = 0
    do {
      println("hello scala!!" + i)
      i += 1
    } while (i < 10)
  }
}
