# Kotlin Date Range

[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/moallemi/kotlin-date-range/CI)](https://github.com/moallemi/kotlin-date-range/actions?query=workflow%3ACI)
[![Maven Central](https://img.shields.io/maven-central/v/me.moallemi.tools/kotlin-date-range)](https://search.maven.org/artifact/me.moallemi.tools/kotlin-date-range)
[![Bintray](https://img.shields.io/bintray/v/moallemi/maven/kotlin-date-range?label=jcenter)](https://bintray.com/moallemi/maven/kotlin-date-range)


This is a tiny implementation of `rangeTo` operator for `Date` and `LocalDate` that makes the syntax for loop iteration and control flow statements safe and natural to read.

## Installation

Add the kotlin-date-range to your dependencies section:

```groovy
dependencies {
  implementation 'me.moallemi.tools:kotlin-date-range:1.0.0'
}
```


## How to use

From Java SE 8 onwards, users are asked to migrate to java.time (JSR-310). For Android users, java.time is [added in API level 26+](https://developer.android.com/reference/java/time/package-summary). Projects needing to support lower API levels can use `java.util.Date`.

#### with `java.time.LocalDate`

Using `rangeTo` operator:

```kotlin
import me.moallemi.tools.daterange.localdate.rangeTo

val startDate = LocalDate.of(2020, 3, 22)
val endDate = LocalDate.of(2020, 4, 1)
for (date in startDate..endDate) {
    println(date)
}
```

Usage with `step` function:

```kotlin
import me.moallemi.tools.daterange.localdate.rangeTo

val startDate = LocalDate.of(2020, 3, 22)
val endDate = LocalDate.of(2020, 4, 1)
for (date in startDate..endDate step 2) {
    println(date)
}
```

Using with `in` operator:

```kotlin
import me.moallemi.tools.daterange.localdate.rangeTo

val startDate = LocalDate.of(2020, 1, 1)
val endDate = LocalDate.of(2020, 1, 5)

val result: Boolean = LocalDate.of(2020, 1, 2) in (startDate..endDate)
```

#### with `java.util.Date`

Using `rangeTo` operator:

```kotlin
import me.moallemi.tools.daterange.date.rangeTo

val calendar = Calendar.getInstance(Locale.getDefault())
calendar.set(2020, 0, 1)
val startDate = calendar.time
calendar.set(2020, 0, 5)
val endDate = calendar.time
for (date in startDate..endDate) {
    println(date)
}
```

Usage with `step` function:

```kotlin
import me.moallemi.tools.daterange.date.rangeTo

for (date in startDate..endDate step 2) {
    println(date)
}
```

## License

```
Copyright 2020 Reza Moallemi.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements. See the NOTICE file distributed with this work for
additional information regarding copyright ownership. The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```




