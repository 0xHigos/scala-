package com.xujie.chapter04.ifelse

object Exercise01 {
  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 3
    val sum = num1 + num2
    if (sum % 3 == 0 && sum % 5 == 0) {
      println("能被3整除又能被5整除")
    } else {
      println("不能被3整除或不能被5整除")
    }
    val year = 2018
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      println("2018是闰年")
    } else {
      println("2018不是闰年")
    }
  }
}
