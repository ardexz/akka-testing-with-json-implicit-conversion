package com.app.controller

import javax.inject.{ Inject, Singleton }
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import com.app.models.domain.Employee

/*
  Use @Inject for repo to use here in the Controller.
*/

@Singleton
object HomeController {
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }

  def addEmployee[E <: Employee](e: E): Future[E] = Future.successful(e)
}
