
package com.xujie {

  package object scala{
    val name = "king"

    def sayHi(): Unit ={
      println("package object scala sayHI~~")
    }

  }
  package scala {

    class Person {
      var name = "Nick"

      def play(message: String): Unit = {
        println(this.name + " " + message)
      }

    }

    object Test100 {
      def main(args: Array[String]): Unit = {
        println("name:" + name)
        sayHi()
        println("12")
      }
    }

    /*
    * 思路:
      * 记数组 cardPoints 的长度为 n，由于只能从开头和末尾拿 k 张卡牌，
      * 所以最后剩下的必然是连续的 n-k 张卡牌。
      * 我们可以通过求出剩余卡牌点数之和的最小值，来求出拿走卡牌点数之和的最大值。
    * 算法:
      * 剩余卡牌是连续的，使用一个固定长度为 n-k 的滑动窗口对数组
      * cardPoints 进行遍历，求出滑动窗口最小值，然后用所有卡牌的点数之和减去该最小值，
      * 即得到了拿走卡牌点数之和的最大值。
    * */

  }

}




