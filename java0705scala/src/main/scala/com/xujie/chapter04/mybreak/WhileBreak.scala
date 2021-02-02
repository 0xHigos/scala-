package com.xujie.chapter04.mybreak

import util.control.Breaks._

object WhileBreak {
  def main(args: Array[String]): Unit = {
    var n = 1
    breakable {
      while (n <= 20) {
        n += 1
        //breakable()函数
        println("n = " + n)
        if (n == 18) {
          //在scala中，使用函数时的break中断循环
          break()
        }
      }
    }
    println("ok~")

  }
}
