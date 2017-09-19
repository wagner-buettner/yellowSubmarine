# Yellow Submarine

## Introduction
This is a test for Buscapé Company.
Which, given an input with coordinates, the application must calculate the last submarine position and direction.

##Defitions
The submarine position is defined by a notation like this:
```(0, 0, 0, NORTE)```

Consider the first position: ```(0, 0, 0, NORTE)```.
Every movement to:
- NORTE will increment 1 to Y axis.
- LESTE will increment 1 to X axis.
- Command Down decreses Z by 1.

Remember: 0 on the Z axis is the surface of the ocean.

Submarine position is represented by ```(X,Y,Z)```.
Direction is represented in Portuguese: ```(Norte, Sul, Leste e Oeste)```.

##Commands
To move the submarine, you must simple commands:
- L, R: to rotate Left or Right
- M: to move the submarine Forward
- U, D: to go Up or Down

##Example
###Input:

In one line, scientist will give the commands:

LMRDDMMUU

###Output:

Output must contain the final submarine position with your direction, example:

-1 2 0 NORTE

## System requirements

- I made this project with Java 8, but Java 7 should be fine too
- Same for Operational System. I used Ubuntu 17.04, but Mac and Windows must be ok
- Apache Maven 3.X (I used 3.5)

## Building project

This is a Apache Maven project.
So, get into the project folder and ```mvn clean install```

## Code Coverage

To get the Code Coverage Report, just run: ```mvn verify```. A report will be created at target folder:

    target/site/jacoco/index.html

## Running Checkstyles

To see if your forked repository has any ```PMD or Findbugs```, run:

    mvn pmd:check
    mvn findbugs:check

## Executing project

After building the project:
- Get in ```target``` folder inside the project (after building it with maven)
- Run jar file: ```java -jar yellowSubmarine-0.0.1-jar-with-dependencies.jar```

## Logs 
- A Log Folder is created by log4j2 while the application is executed, you can also check over there the inputs and outputs =]
