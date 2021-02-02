package com.xujie.chapter05.exercise

import scala.io.StdIn

object Exercise01 {
  def main(args: Array[String]): Unit = {
    println("请输入一个数字(1-9)之间")

    val n =StdIn.readInt()
    print99(n)
  }
  def print99(n:Int): Unit ={
    for(i <- 1 to n){
      for(j <- 1 to i){
        printf("%d * %d = %d\t",j,i,j*i)
      }
      println()
    }
  }
}
