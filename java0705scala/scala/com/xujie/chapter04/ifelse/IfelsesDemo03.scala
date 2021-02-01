package com.xujie.chapter04.ifelse

import scala.io.StdIn

object IfelsesDemo03 {
  def main(args: Array[String]): Unit = {
    println("请输入成绩")
    val score = StdIn.readDouble()
    if(score == 100){
      println("成绩为100分，奖励一辆BMW")
    }else if(score > 80 && score <= 99){
      println("成绩为(80,99],奖励一台iphone7plus")
    }else if(score > 60 && score <= 79){
      println("奖励一台ipad")
    }else{
      println("没有任何奖励")
    }
  }
}
