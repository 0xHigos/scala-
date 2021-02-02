package com.xujie.homework

import util.control.Breaks._

object Homework01 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          println("第一次大于20的当前数 = " + i)
          break()
        }
      }
    }

    //使用循环守卫实现中断
    println("=====================")
    var loop = true
    var sum2 = 0
    for (i <- 1 to 100 if loop) {
      sum2 += i
      if (sum2 > 20) {
        loop = false
        println("循环守卫实现中断 第一次大于20的当前数 = " + i)
      }
      println("i= " + i)
    }
  }
}
