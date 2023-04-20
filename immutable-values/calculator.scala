case class CalculatorState(value: Double) {
  def + (operand: Double): CalculatorState = CalculatorState(value + operand)
  def -(operand: Double): CalculatorState = CalculatorState(value - operand)
  def *(operand: Double): CalculatorState = CalculatorState(value * operand)
  def /(operand: Double): CalculatorState = CalculatorState(value / operand)
}

object Calculator {
  def main(args:Array[String]): Unit = {
    val state1 = CalculatorState(10)
    val state2 = state1 + 5 // adition
    val state3 = state2 - 3 // subtraction
    val state4 = state3 * 2 // multiplication
    val state5 = state4 / 4 // division
    println(state5.value) 
  }
}