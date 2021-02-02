package com.xujie.chapter04.myfor

object YeildFor {
  def main(args: Array[String]): Unit = {
    val res = for (i <- 1 to 10) yield {
      if(i % 2 == 0)
        i
      else{
        "不是偶数"
      }
    }
    println(res)
  }
}
