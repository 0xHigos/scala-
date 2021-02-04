package com.xujie.chapter06.constructor

object ConDemo01 {
  def main(args: Array[String]): Unit = {
    /*val p1 = new Person("jack", 20)
    println(p1)*/

    val p2 = new Person("tom")
    println(p2)
  }
}

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge

  age += 10
  println("~~~~~~~")

  override def toString: String = {
    "name:" + this.name + " age:" + this.age
  }

  println("age = " + age)

  def this(name:String){
    //辅助构造器要求，必须在第一行显示调用主构造器
    this("jack",10)
    this.name = name // 重新赋值
  }
}
