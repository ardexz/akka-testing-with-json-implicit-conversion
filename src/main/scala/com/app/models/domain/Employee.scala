package com.app.models.domain

import java.util.UUID
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._

case class Employee(empId: UUID, fullName: String, age: Int, address: String) {
  // Convert `toJson` to `Json.toJson` function...
  def toJson = Employee.withFormat.writes(this).as[JsObject]
}

/*
  Create Implicit JsonFormatter for case class Employee...
  - Either Using Different style in Json Formatting ( Format, Write or Read ) as shown below,
    But there are some warnings because most of this codes are used and tested
    on PlayFramework with Scala Projects..
*/

object Employee {
  val tupled = (apply _).tupled

  // Using Format Json Path...
  implicit val withFormat: Format[Employee] = (
    (__ \ "emp_id").format[UUID] and
    (__ \ "full_name").format[String] and
    (__ \ "age").format[Int] and
    (__ \ "address").format[String]
  )(Employee.apply _, unlift(Employee.unapply _))

  // Using Play Library Json Format to READ and WRITES...
  implicit val withBasicFormat: Format[Employee] = Json.format[Employee]

  /*
    Using Basic Reads and Writes Json Formatter..
    - The advantage of this coding style is that you can customized the Implicit
      Reads and Writes data types and etc...
  */
  implicit val withBasicReads: Reads[Employee] = (
    (JsPath \ "emp_id").read[UUID] and
    (JsPath \ "full_name").read[String](minLength[String](5)) and
    (JsPath \ "age").read[Int] and
    (JsPath \ "address").read[String]
  )(Employee.apply _)

  implicit val withBasicWrites: Writes[Employee] = (
    (JsPath \ "emp_id").write[UUID] and
    (JsPath \ "full_name").write[String] and
    (JsPath \ "age").write[Int] and
    (JsPath \ "address").write[String]
  )(unlift(Employee.unapply _))
}
