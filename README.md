# PEFI Test Framework

![PEFI](img/pefi.png)

# Screenplay Pattern with Serenity BDD

This project is a simple demonstration showing the difference between
the [PageObject](http://martinfowler.com/bliki/PageObject.html)
and the [Screenplay pattern](https://dzone.com/articles/page-objects-refactored-solid-steps-to-the-screenp),
both implemented using the [Serenity BDD](http://serenity-bdd.info/#/) library and JUnit.

## Screenplay implementation

These tests use tasks, actions, questions and page elements defined in `src/main/java/net/serenitybdd/demos/todos/screenplay`.

The overall project structure is shown below:

````
+ model
    Domain model classes
+ tasks
    Business-level tasks
+ action
    UI interactions
+ pages
    Page Objects and Page Elements
+ questions
    Objects used to query the application
````

## Running the project

To run the project you'll need JDK 1.8 and Maven 3.8.1 installed.

## PEFI Tests

There are also Peach Finance Tests implemented using the Screenplay Pattern.

To run it, execute:

```
mvn clean verify -Ppefi
```

## Reporting

The Serenity reports will be generated in the `target/site/serenity` directory.
