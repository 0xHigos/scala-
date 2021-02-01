package com.xujie.chapter04.ifelse

import scala.io.StdIn

object Exercise05 {
  def main(args: Array[String]): Unit = {
    Predef.println("输入月份")
    val month: Int = StdIn.readInt()
    Predef.println("输入年龄")
    val age: Int = StdIn.readInt()
    val ticket: Int = 60
    if (month >= 4 && month <= 10) {
      if (age >= 18 && age <= 60) {
        Predef.println("你的票价是：" + ticket)
      } else if (age < 18) {
        Predef.println("你的票价是：" + (ticket >> 1))
      } else {
        Predef.println("你的票价是" + ticket / 3)
      }
    } else {
      if (age >= 18 && age <= 60) {
        Predef.println("你的票价是：" + 40)
      } else {
        Predef.println("你的票价是：" + 35)
      }
    }
  }
}
