package io.typelevel
import cats.effect._
import cats.implicits._

object Playground extends IOApp {


  override def run(args: List[String]): IO[ExitCode] =
    IO(println("hello world!"))
      .as(ExitCode.Success)
}
