package com.xujie.chapter08.selftype

object SelftypeDemo {
  def main(args: Array[String]): Unit = {

  }
}

trait Logger{
  this:Exception =>
  def log():Unit ={
    println(getMessage)
  }
}
//class Console extends Logger {}
class Console extends Exception with Logger