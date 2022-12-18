package com.mofjwutu

import zio._
import zio.Console._
import zio.http
import zio.http.Client

object Main extends ZIOAppDefault {

  // private val url = "https://megamillions.com/"
  private val url = "https://powerball.com/games/home"
  //  def run = program

  private val program =
    for {
      res <- Client.request(url)
      - <- Console.printLine("status=<" + res.status + ">")
      data <- res.body.asString
      _ <- Console.printLine(data)
    } yield ()

  val run: ZIO[Any, Throwable, Unit] = program.provide(Client.default, Scope.default)
}



