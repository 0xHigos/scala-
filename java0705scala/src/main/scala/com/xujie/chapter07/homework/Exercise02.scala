package com.xujie.chapter07.homework

import scala.beans.BeanProperty

object Exercise02 {
  def main(args: Array[String]): Unit = {
    println("ok")
  }
}
class Student{
  @BeanProperty var name :String = _
  @BeanProperty var id :Long = _

}