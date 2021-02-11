package com.xujie.chapter11

object StreamDemo01 {
  def main(args: Array[String]): Unit = {
    def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n * 2)

    val stream1 = numsFrom(1)
    println(stream1)

    println("head= " + stream1.head)
    println(stream1)

    println("tail " + stream1.tail)
    println(stream1)
    println(stream1.tail.tail)
    println(stream1)
  }
}
