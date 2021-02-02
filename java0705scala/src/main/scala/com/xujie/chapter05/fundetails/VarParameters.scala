package com.xujie.chapter05.fundetails

object VarParameters {
  def main(args: Array[String]): Unit = {
    println(sum(10, 30, 10, 3, 45, 7))
  }

  def sum(n1: Int, args: Int*): Int = {
    println("args.length: " + args.length)
    var sum = n1
    for(item <- args){
      sum += item
    }
    sum
  }
}
