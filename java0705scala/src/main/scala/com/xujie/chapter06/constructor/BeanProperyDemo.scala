package com.xujie.chapter06.constructor

import scala.beans.BeanProperty

object BeanProperyDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "宝马"
    println(car.name)
    car.setName("奔驰")
    println(car.name)
  }
}
class Car{
  @BeanProperty var name :String = null
}
