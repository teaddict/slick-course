import slick.driver.H2Driver.api._

object JoinsExplicit {

  import SharedTwoTables._

  // used to remove unused imports
  def __hidden__ = {
    AlbumTable.countDistinct.result
  }

  /*:CODEFROM:*/
  val explicitJoin = ???
  /*:CODETO:*/

}