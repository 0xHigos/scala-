package com.xujie.chapter01.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推导
    var num = 10 //这时num就是Int类型

    //方式一 可以利用idea得提示 或 isInstanceOf[]方法
    println(num.isInstanceOf[Int])

    var age = 10 //既age 是可以改变的.
    age = 30 //ok

    val num2 = 30
    //num2 = 40  //val  修饰的变量是步可以改变的.

    val dog = new Dog
    //dog = new Dog //Reassignment to val
    dog.age = 90 //ok
    dog.name = "小花" //ok
  }
}

class Dog {
  //声明一个age,给了一个默认值
  var age: Int = _
  //声明一个名字
  var name: String = ""
}
