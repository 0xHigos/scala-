package com.xujie.chapter04.mutli

object Exercise03 {
  def main(args: Array[String]): Unit = {
    val num = 9
    for (i <- 1 to num) {
      for (j <- 1 to i) {
        printf("%d * %d = %d\t", j, i, i * j)
      }
      println()
    }
  }
}
