import slick.driver.H2Driver.api._

object ActionUpdate {

  import SharedOneTable._

  // used to remove unused imports
  def __hidden__ = {
    AlbumTable.countDistinct.result
  }

  /*:CODEFROM:*/
  def updateToMehAfterYear(year: Int) = {
    ???
  }
  /*:CODETO:*/
  /*:SOLUTIONFROM:*/
//  def updateToMehAfterYear(year: Int) = {
//    AlbumTable.filter(_.year > year)
//    .map(a => a.rating)
//      .update(Rating.Meh)
//  }
  /*:SOLUTIONTO:*/

}
