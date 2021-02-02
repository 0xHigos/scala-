package com.xujie.chapter03

import scala.io.StdIn

object InputIn {

  def sayHi(): Unit = {
    println("hi")
  }

  def main(args: Array[String]): Unit = {
    println("请输入姓名:")
    val name = StdIn.readLine()
    println("请输入年龄:")
    val age = StdIn.readInt()
    println("请输入薪水:")
    val salary = StdIn.readDouble()
    printf("用户的信息为：name =%s age = %d salary = %.2f", name, age, salary)
    sayHi()
  }
}

//伴生对象
object Cat extends AAA {
  def sayHi(): Unit = {
    println("小狗汪汪叫")
  }
}

trait AAA {
  def sayHello(): Unit = {
    println("AAA sayHello")
  }
}
