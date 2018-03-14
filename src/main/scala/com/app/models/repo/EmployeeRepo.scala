/*
  - This code can be used using Postgresql DB..
    and if ever you have already Configure your Database..
*/

/*
package com.app.models.repo

import java.util.UUID
import javax.inject.{ Inject, Singleton }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import play.api.db.slick.{ DatabaseConfigProvider, HasDatabaseConfigProvider }
import com.app.models.domain._

@Singleton
class EmployeeRepo @Inject()(
    dao: com.app.models.dao.EmployeeDAO,
    protected val dbConfigProvider: DatabaseConfigProvider)
  extends HasDatabaseConfigProvider[mrtradelibrary.utils.db.PostgresDriver] {
  import profile.api._

  def exists(empId: UUID): Future[Boolean] =
    db.run(dao.Query(empId).exists.result)

  def add(employee: Employee): Future[Int] =
    db.run(dao.Query += employee)

  def all: Future[Seq[Employee]] =
    db.run(dao.Query.result)

  def find(empId: UUID): Future[Option[UUID]] =
    db.run(dao.Query.filter(_.empId === empId).map(_.empId).result.headOption)

  def delete(empId: UUID): Future[Int] =
    db.run(dao.Query(empId).delete)

  def update(employee: Employee): Future[Int] =
    db.run(dao.Query(employee.empId).update(employee))
  }
*/
