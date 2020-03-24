# micronaut-helloworld
Java Project with Micronaut framework and Maven

# Micronaut Commands
* mn create-app test --build maven --features swagger-java
* mvnw compile
* mvnw exec:exec

* mvn compile (just compile)
* mvn test (compile and run unit tests)
* mvn package (compile, run unit tests, and build the distributable package)
* mvn install (all of the above, and install distributable package into local repository.
     Install is very useful if you need to build other packages which depend on changes
     to this package)
* mvn deploy (all of the above, and install package into remote (aka public) repository
     for sharing with other developers)
* put exec:exec in Run Configurations : Goals (Eclipse IDE)



# Fonts
* https://docs.micronaut.io/latest/guide/index.html#installWindows
* https://github.com/micronaut-projects/micronaut-core/issues/630
* https://stackoverflow.com/questions/13606794/maven-build-failure-when-calling-mvn-without-lifecycle-phase-or-goal/13606824