object PositiveVal extends PositiveOrNegative {

  def isPositive: Boolean = true

  def negate: PositiveOrNegative = NegativeVal

}
