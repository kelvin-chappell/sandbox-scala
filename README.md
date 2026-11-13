# sandbox-scala

A small Scala experiment in eliminating Sudoku candidates within a single
section. The implementation is in `src/main/scala/s/S.scala`.

## Behaviour

`Section.solve` replaces each non-positive input with the candidates 1 to 9,
then removes values already present in the section. If only one candidate
remains, it replaces the candidate list with that number.

`s.Client` is the example entry point. It processes these two inputs:

* `List(1, 2, 3, 4, 5, 6, 7, 8, 0)`: the final position becomes `9`.
* `List(1, 2, 3, 4, 5, 6, 7, 0, 0)`: both final positions retain the
  candidates `8` and `9`.

`solve` prints the result and returns a fresh `Section`; it does not return or
store the computed values. It performs a single elimination pass, with no
whole-board solving or validation of section length, duplicates or value range.

## Build status

`project/build.properties` pins sbt 0.11.3. No explicit Scala version, dependency
configuration or automated test suite is checked in. Compatibility with current
JDKs and sbt versions has not been verified; this is a historical experiment,
not a complete Sudoku solver.
