/*
  - This code can be used using Postgresql DB..
    and if ever you have already Configure your Database..

  With TableName : `EMPLOYEES`
*/

/*
package com.app.models.dao

import java.util.UUID
import javax.inject.{ Inject, Singleton }
import play.api.db.slick.{ DatabaseConfigProvider, HasDatabaseConfigProvider }
import com.app.models.domain._

@Singleton
final class EmployeeDAO @Inject()(
    protected val dbConfigProvider: DatabaseConfigProvider)
  extends HasDatabaseConfigProvider[mrtradelibrary.utils.db.PostgresDriver] {
  import profile.api._

  protected class EmployeeTable(tag: Tag) extends Table[Employee](tag, "EMPLOYEES") {
    def empId = column[UUID]("EMPLOYEE_ID", O.PrimaryKey)
    def fullName = column[String]("FULL_NAME")
    def age = column[Int]("AGE")
    def address = column[String]("ADDRESS")

    def * = (empId, fullName, age, address) <> (Employee.tupled, Employee.unapply)
  }

  object Query extends TableQuery(new EmployeeTable(_)) {
    @inline def apply(empId: UUID) = this.withFilter(_.empId === empId)
  }
}

*/
