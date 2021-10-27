object NegativeVal extends PositiveOrNegative {

  def isPositive: Boolean = false

  def negate: PositiveOrNegative = PositiveVal
}
