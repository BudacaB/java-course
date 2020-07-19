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


UML - unified modelling language - helps with diagrams ; sections:
- classname
- fields
- methods

OOP motivation:
- big software apps with OO tend to be more maintainable
- modularize in smaller pieces - e.g. abstract away pieces of code to functions/methods
- OOP adds a layer of abstraction and groups modules with related functionality together with the info that they manipulate
- this cohesive unit is called an object
- software objects often represent real-world objects that contain both state and behavior
- the state of the object is maintained by a set of variables inside the object, knows as fields
- the behavior of the object is performed by a set of functions inside the object, knows as methods

Class vs object
- class -> blueprint for the object - define the structure and content
- object -> instance of a class
- some info and functionality exist in the class, and are shared by all instances of that class

Field
- data item defined in a class
- can be static of instance
- static fields reside in the class - available even without having an instance - will be shared by all objects
- instance fields - not using 'static' - reside in various objects - each object will have its own copy of these fields

Method
- sit inside the class - provide functionality
- could also be static or instance - static methods can only access static fields
- instance methods can access instance fields - and also static

Encapsulation
- combines fields and methods inside a class
- it hides fields and implementation behind publicly-available methods
- guarantees that the data inside an object is correct and consistent (e.g. the month date inside of a Date object should never be less than 1 or greater than 12)
- provides a level of abstraction between the user of a class and the fields contained inside the class - no need to know how the fields are structured, just which methods to call in order to change the object state or perform a task
- the callable methods on an object from outside of the object make up the object's interface - the implementation of the object can change without changing the interface

Access control
- access control modifiers enforce encapsulation - they control who has access to fields and methods inside the class
- public - any code anywhere has access to the data and/or methods
- private - only methods inside the class have access to the data and/or method
- protected - classes that inherit this class will have access to the data and/or methods
- due to encapsulation, any fields declared inside a class are given the private modifier - only mechanism to modify this data from outside the class is by means of method calls
- occasionally you might have a constant field inside your class be given public access control, since it can't be modified
- methods can be public, private, protected - depending on whether you want them to be called from outside the object or from within the object

Inheritance
- allows you to build a new datatype using an existing one as the foundation
- you can therefore avoid representing the same thing twice by moving common fields and methods that are shared by multiple classes to a common base class
- with an existing class as a starting point, you can use inheritance to create a new class
- the new class can take on additional fields and methods
- the new class can override the code of a particular method with new implementation code
- the class you inherit from is known as the superclass, and the new class is known as the subclass
- other terminology: base class / derived class, parent class / child class, generalized class / specialized class
- an object that is created from a subclass is not only an instance of the subclass, but also of the superclass
- this creates an 'is-a' relationship between the superclass, and the subclass - a timestamp 'is a' date, a toaster 'is an' appliance, a jet 'is an' airplane

Polymorphism
- when one class inherits from another class an 'is-a' relationship is built
- the 'is-a' relationship says that a subclass is actually an instance of the superclass with additional data and methods
- a variable of the superclass type can reference a subclass object because the subclass object 'is-a' superclass object
- many different subclasses can have 'is-a' relationships with the same superclass
- if a superclass variable is referencing a subclass object the variable can only access the superclass part of the object, with one notable exception
- the subclass might override one or more methods declared in the superclass
- if the superclass variable calls a method that has been overridden, the method in the subclass will be executed
- this is done using dynamic (runtime) binding, since the object that the variable is referencing cannot be determined at compile time
- a call to an overridden method from a base class variable is polymorphic, since the type of the object referenced will determine which method is actually executed

Liskov Substitution Principle (LSP) - you can always substitute a subclass where a superclass is required

Best practices
- methods should have as few params as possible
- methods should mostly use their own fields
- objects should have a limited number of responsibilities and their methods should fulfill those responsibilities
- fields that are not constant should be private
- methods should be as private as possible
- everything inside of the class should have a common purpose (High Cohesion)
- classes should rely on the functionality of other classes as little as possible (Low Coupling)
- high cohesion and low coupling are usually in conflict with one another, but generally high cohesion is more important