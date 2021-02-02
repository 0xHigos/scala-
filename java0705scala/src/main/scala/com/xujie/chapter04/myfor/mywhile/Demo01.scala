package com.xujie.chapter04.myfor.mywhile

object Demo01 {
  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < 10) {
      println("hello scala " + i)
      i += 1
    }
  }
}
