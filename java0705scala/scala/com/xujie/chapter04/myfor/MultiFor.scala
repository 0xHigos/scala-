package com.xujie.chapter04.myfor

object MultiFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i =" + i + ",j = " + j)
    }
    for(i <- 1 to 3){
      for(j <- 1 to 3){
        println("i =" + i + ",j = " + j)
      }
    }
  }
}
