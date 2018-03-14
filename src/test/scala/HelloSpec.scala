package com.testspec.rexardiente

import java.util.UUID
import org.scalatest._
import scala.concurrent.ExecutionContext.Implicits.global
import com.app.controller.HomeController._
import com.app.models.domain._

class HelloSpec extends FlatSpec with BeforeAndAfter with BeforeAndAfterAll with Matchers {
  /*
    Example Basic Code.....
    "Hello" should "have tests" in {
      true should === (true)
    }
  */

  override def beforeAll() = {
    // Codes that needs to to be Executed in first run.
  }

  "Execute Test Function" should "return future Employee " in {
    addEmployee(Employee(UUID.randomUUID ,"ardiente rex", 23, "Cebu City, Philippines"))
      .map(println)
  }

}
