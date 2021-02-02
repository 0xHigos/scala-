package com.xujie.chapter04.myfor

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 10
    for (i <- start to end) {
      println("hello java")
    }
    val list = List("hello",10,30,"tom")
    for(item <- list){
      println(item)
    }
  }
}
