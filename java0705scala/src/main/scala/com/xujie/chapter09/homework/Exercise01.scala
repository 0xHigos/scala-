package com.xujie.chapter09.homework

import java.awt.geom.Ellipse2D

object Exercise01 {
  def main(args: Array[String]): Unit = {
    val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    println("egg.x:" + egg.x + " egg.y:" + egg.y)
    egg.tranlate(10, -10)
    println("egg.x:" + egg.x + " egg.y:" + egg.y)
    egg.grow(10, 20)
    println("egg.x:" + egg.x + " egg.y:" + egg.y)
  }
}

trait RectangleLike extends Ellipse2D.Double {
  def tranlate(x: Double, y: Double): Unit = {
    this.x = x
    this.y = y
  }

  def grow(x: Double, y: Double): Unit = {
    this.x += x
    this.y += y
  }
}


trait RectangleLike2extends extends {
  this:Ellipse2D.Double =>
  def tranlate(x: Double, y: Double): Unit = {
    this.x = x
    this.y = y
  }

  def grow(x: Double, y: Double): Unit = {
    this.x += x
    this.y += y
  }
}
