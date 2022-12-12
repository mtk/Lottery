package com.mofjwutu

import zio._
import zio.Console._
import zio.http
import zio.http.Client

object Main extends ZIOAppDefault {
  
  private val url = "https://sports.api.decathlon.com/groups/water-aerobics"
  //  def run = program

  private val program =
    for {
      res <- Client.request(url)
      data <- res.body.asString
      _ <- Console.printLine(data)
    } yield ()

  val run: ZIO[Any, Throwable, Unit] = program.provide(Client.default, Scope.default)
}



