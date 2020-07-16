### Primitive Datatype:

- byte
- short
- int
- long
- float
- double
- char
- boolean

### Non-primitive Datatype (are classes):

- String

---

The main difference between heap and stack is that stack memory is used to store local variables and function call while heap memory is used to store objects in Java.

---

Expressions are a combination of variables, literals and operators

5 - x

5 -> literal

' - ' -> operator

x -> variable

In Java add a ';' semicolon at the end of the line and you get a statement

' = ' -> assignment operator

! Left operand must be a variable in Java (x = 5)

! Evaluation is done right to left

! If you need a float division, make sure at least one of the operands is defined as a float

---

<h2>Static</h2>

- A method declared static can only use fields that are also declared static
- A method declared static can directly call other methods only if they are also declared static
- A method declared without static - you can't call that method until you create an object
    - you make the object invoke the method
    - the non-static method can then use any non-static fields, because non-static fields belong to the object itself
    - if multiple objects are created, each has its own copies of the non-static fields
- Static fields and methods reside within the class itself and are usable as soon as the program starts and the class is loaded
- Non-static fields and methods reside in individual objects, which mush be, created before their methods can be called and their fields used
    - since an object is an instance of a class, the term instance is sometimes used as a synonym for non-static
    
---
<h2>OOP</h2>

- Encapsulation
- Inheritance
- Polymorphism

UML - unified modelling language - helps with diagrams
- classname
- fields
- methods
