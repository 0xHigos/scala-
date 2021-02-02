package com.xujie.chapter05.fundetails

object DetailRecursive {
  def main(args: Array[String]): Unit = {

  }
  def f1(n:Int):Int ={
    if(n == 1)
      1
    else
      f1(n -1)
  }
}
