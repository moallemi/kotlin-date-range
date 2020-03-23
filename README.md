# Kotlin Date Range

[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/moallemi/kotlin-date-range/CI)](https://github.com/moallemi/kotlin-date-range/actions?query=workflow%3ACI)
[![Maven Central](https://img.shields.io/maven-central/v/me.moallemi.tools/kotlin-date-range)](https://search.maven.org/artifact/me.moallemi.tools/kotlin-date-range)
[![Bintray](https://img.shields.io/bintray/v/moallemi/maven/kotlin-date-range?label=jcenter)](https://bintray.com/moallemi/maven/kotlin-date-range)


This is a tiny implementation of `rangeTo` operator for `LocalDate` that makes the syntax for loop iteration and control flow statements safe and natural to read.

## Installation

Add the kotlin-date-range to your dependencies section:

```groovy
dependencies {
  implementation 'me.moallemi.tools:kotlin-date-range:0.0.3'
}
```


## How to use

From Java SE 8 onwards, users are asked to migrate to java.time (JSR-310). For Android users, java.time is [added in API level 26+](https://developer.android.com/reference/java/time/package-summary). Projects needing to support lower API levels can use `java.util.Date`.

#### with `java.time.LocalDate`

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

Using with `in` operator:

```kotlin
val startDate = LocalDate.of(2020, 1, 1)
val endDate = LocalDate.of(2020, 1, 5)

val actual = LocalDate.of(2020, 1, 2) in (startDate..endDate)
```




