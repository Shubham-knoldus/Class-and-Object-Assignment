case class Integer(Number:Nat,positiveORnegative: PositiveOrNegative = PositiveVal) extends Nat {

  def isZero: Boolean = Number.isZero
  def predecessor: Nat= {
    if (isZero) Integer(Number.successor, NegativeVal)
    else if (positiveORnegative.isPositive) Integer(Number.predecessor, positiveORnegative)
    else Integer(Number.successor, NegativeVal)
  }
  def successor: Nat = {
    if (isZero) Integer(Number.successor, PositiveVal)
    else if (positiveORnegative.isPositive) Integer(Number.successor, positiveORnegative)
    else Integer(Number.predecessor, NegativeVal)
  }
  def +(that: Nat): Nat = {
    if (isZero) that
    else if (positiveORnegative.isPositive) this.predecessor + that.successor
    else this.successor + that.predecessor
  }
  def -(that: Nat): Nat = {
    if (that.isZero) this
    else that match {
      case Integer(element, posNeg) => this + Integer(element, posNeg.negate)
    }
  }
  def isPositive: Boolean = positiveORnegative.isPositive
  def negate: Integer = Integer(Number, positiveORnegative.negate)

}
