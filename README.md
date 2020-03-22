# Kotlin Date Range

This tiny implementation of `rangeTo` operator for `LocalDate`, makes the syntax for loop iteration and control flow statements safe and natural to read.

![GitHub Workflow Status](https://img.shields.io/github/workflow/status/moallemi/kotlin-date-range/CI) 


## How to use

Using `rangeTo` operator:

```kotlin
val startDate = LocalDate.of(2020, 3, 22)
val endDate = LocalDate.of(2020, 4, 1)
for (date in startDate..endDate) {
    println(date)
}
```

Usage with `step` function:

```kotlin
val startDate = LocalDate.of(2020, 3, 22)
val endDate = LocalDate.of(2020, 4, 1)
for (date in startDate..endDate step 2) {
    println(date)
}
```




