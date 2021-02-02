package com.xujie.chapter01

object PrintDemo {
  def main(args: Array[String]): Unit = {
    var str1: String = "Hello"
    var str2: String = " world!"
    println(str1 + str2)
    var name: String = "tom"
    var age: Int = 10
    var salary: Float = 10.67f
    var height: Double = 180.15
    printf("年龄是= %s,年龄是=%d,薪水是=%.2f,身高是=%.3f", name, age, salary, height)
    println(s"\n个人信息如下：\n 名字$name 年龄$age 薪水$salary")
    println(s"\n个人信息如下：\n 名字${name} 年龄${age} 薪水${salary}")
    println(s"\n个人信息如下：\n 名字${name} 年龄${age} 薪水${salary * 10}")
  }
}
