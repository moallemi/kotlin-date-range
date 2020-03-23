# Kotlin Date Range

[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/moallemi/kotlin-date-range/CI)](https://github.com/moallemi/kotlin-date-range/actions?query=workflow%3ACI)
[![Maven Central](https://img.shields.io/maven-central/v/me.moallemi.tools/kotlin-date-range)](https://search.maven.org/artifact/me.moallemi.tools/kotlin-date-range)


This is a tiny implementation of `rangeTo` operator for `LocalDate` that makes the syntax for loop iteration and control flow statements safe and natural to read.

## Installation

Add the kotlin-date-range to your dependencies section:

```groovy
dependencies {
  implementation 'me.moallemi.tools:kotlin-date-range:0.0.3'
}
```


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




