package com.xujie.chapter01

object LookSourceCode {
  def main(args: Array[String]): Unit = {
    var arr = new Array[Int](10)
    for (item <- arr) {
      println("item=" + item)
    }
  }
}
