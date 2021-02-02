package com.xujie.chapter06

object CatDemo {
  def main(args: Array[String]): Unit = {
    //创建一个猫
    val cat = new Cat
    //给猫的属性赋值
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
    println("ok~~")
    printf("小猫的信息如下：\n%s,%d,%s",cat.name,cat.age,cat.age)
  }
}

class Cat {
  var name: String = ""
  var age: Int = _
  var color: String = _
}
