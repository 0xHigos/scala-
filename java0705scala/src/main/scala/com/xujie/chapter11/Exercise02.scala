package com.xujie.chapter11

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val list = List(3,4,2,7,5)
    val res = list.reduceLeft(min)
    println("res = " + res)
  }
  def min(num1:Int,num2:Int):Int={
    if(num1 > num2) num2 else num1
  }
}
