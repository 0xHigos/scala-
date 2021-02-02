package com.xujie.chapter05.fundetails

object Details03 {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = { // ok private final
      println("f1")
    }

    def sayOK(): Unit = { // private final sayOk$1
      println("main sayOK")
      def sayOk():Unit={ // private final sayOk$2
        println("sayOk inline sayOK")
      }
    }

    println("ok~~")
  }

  def sayOK(): Unit = {
    println("main sayOK")
  }
}
