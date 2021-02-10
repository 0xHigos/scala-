package com.xujie.chapter08.extendstrait

object ExtendTraitDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

trait LoggedException extends Exception {
  def log(): Unit = {
    println(getMessage)
  }
}
