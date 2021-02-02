package com.xujie.chapter01

class Comment {
  def main(args: Array[String]): Unit = {
    println("hello,world")
  }

  /**
  * @deprecated 过期
  * @example
  *   输入： n1 = 10,n2 = 20 return 30
  * @param n1
  * @param n2
  * @return 和
  * */
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
