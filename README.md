# Algeria Towns List API

This API provides a list of towns in Algeria.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing
purposes.

### Prerequisites

The project is built with Kotlin and Gradle. Make sure you have them installed on your machine.

### Installing

To use the API in your Maven project, add the following dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>dev.devunion</groupId>
  <artifactId>dev.devunion.ktor-algeria-towns</artifactId>
  <version>0.0.2</version>
</dependency>
```

Usage
After adding the dependency, you can use the API in your code. For example, if your API provides a class TownService
that has a method getTowns(), you can use it like this

```kotlin
val towns = listOf(TOWNS)
println(towns)
```
### Contributing
Please read CONTRIBUTING.md for details on our code of conduct, and the process for submitting pull requests to us.  
Versioning
We use SemVer for versioning. For the versions available, see the tags on this repository.  

### Authors
[abdelillahbel](github.com/abdelillahbel) - Initial work 
See also the list of contributors who participated in this project.  

### License
This project is licensed under the MIT License - see the LICENSE.md file for details
