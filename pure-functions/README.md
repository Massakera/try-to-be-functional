# Pure Functions

In functional programming, a pure function is a function that always returns the same output given the same input and has no side effects, meaning it does not modify any state outside its scope. Pure functions are idempotent, meaning that calling the function multiple times with the same input will always produce the same output.

Here is an example of a pure function in Scala:

```
def add(x: Int, y: Int): Int = {
  x + y
}

```

In this function, `add` takes two integers as input and returns their sum. This function is pure because it always returns the same output given the same input and does not modify any state outside its scope.

On the other hand, here is an example of an impure function in Scala:

```
var sum = 0
def add(x: Int, y: Int): Int = {
  sum += x + y
  sum
}

```

In this function, `add` takes two integers as input and adds them to a global `sum` variable. This function is impure because it modifies the state outside its scope, making it non-idempotent.

### First exercise: TipCalculator
You are going to refactor the TipCalculator class that can be used by a group of friends to calculate a tip based on the amount of people involved. The tip is 10% if the number of people splitting the bill is from one to five. If a group is larger than five people, the tip is 20%. We also cover the corner case of dining and dashing—when there are no people, then the tip is obviously 0%.
