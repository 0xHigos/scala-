package com.xujie.chapter05.fundetails

object Detail202 {
  def main(args: Array[String]): Unit = {
    println(getSum2(10, 30))
    println(getSum3(10, 30))
  }

  def getSum(n1: Int, n2: Int) = {
    n1 + n2
  }

  def getSum2(n1: Int, n2: Int) {
    return n1 + n2
  }

  def getSum3(n1: Int, n2: Int): Unit = {
    return n1 + n2
  }
}
