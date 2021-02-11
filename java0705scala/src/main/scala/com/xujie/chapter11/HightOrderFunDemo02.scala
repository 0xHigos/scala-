package com.xujie.chapter11

object HightOrderFunDemo02 {
  def main(args: Array[String]): Unit = {
    test2(sayOk)
  }

  def test2(f: () => Unit): Unit = {
    f()
  }

  def sayOk() = {
    println("sayOkkkk....")
  }

  def sub(n1: Int): Unit = {

  }
}
