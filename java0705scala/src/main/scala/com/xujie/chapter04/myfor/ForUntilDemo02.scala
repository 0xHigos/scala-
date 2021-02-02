package com.xujie.chapter04.myfor

object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 11
    for (i <- start until(end)) {
      println("hello scala" + i)
    }
  }
}
