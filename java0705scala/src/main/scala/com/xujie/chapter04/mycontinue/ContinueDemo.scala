package com.xujie.chapter04.mycontinue

object ContinueDemo {
  def main(args: Array[String]): Unit = {
    //continue 替换写法
    for (i <- 1 to 10 if i != 2 && i != 3)
      println("i = " + i)
    println("========================")
    for (i <- 1 to 10) {
      if (i != 2 && i != 3)
        println("i = " + i)
    }
  }


}
