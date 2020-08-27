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
- things that don't have an access modifier specified will be available in their package only
- field with unspecified access control modifiers are visible in their package
- a class can be public or unspecified (meaning it's visible only inside its package)

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
- constructors are not inherited

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

---

Objects
- get initialized -> represent an instance of a class
- 'new' keyword -> memory gets allocated (in the heap) for all non-static fields of the object, initializes them and executes one or more constructors
    - return a reference to the newly-created object
    
Final - constant - using capital letters as convention
This keyword - referst to the current object
Methods - can return a value of any type, including a primitive datatype, an object reference or an array of either
    - if it doesn't need to return a value it can be declared as void
    - the name of the method along with the list of parameter datatypes, is termed the method signature
    - a class can have many methods of the same name, as long as they all have different signatures (overloading)
    - the arguments you pass determine which method is called
    - the method's return type is not part of the signature
Constructor - special method used to initialize an object
    - if you don't write any constructors for your class, the compiler will provide a default no-arg constructor which will be removed as soon as any constructor is provided

Format strings
    - made out of fixed text and one or more format specifiers
    - for character and numeric types - %[argument_index$][flags][width][.precision]conversion
    - each format specifier always starts with a %
    - argument_index indicates the position of the argument in the argument list - e.g. 1$ (1st arg) ; 2$ (2nd arg)
    - flags is used to modify the format of the output - e.g. the - flag specifies that the output should be left justified
    - width indicates the min number of chars to output
    - precision is used to restrict the number of chars to output - for floats this is the number of digits after the decimal
    - conversion is a required char that specifies how the arg should be formatted - e.g. the f conversion indicates that a floating point decimal value is being formatted

toString() - used to make it easier to print your object's state

Comparing objects
- with primitive datatypes, the == operator compares values
- with reference variables, the == operator compares references; it evaluates to true if both references refer to the same object
    - even if 2 objects have the exact same state, == never returns true for variables referring to the two different objects
- to perform value comparison of objects, provide an equals() method for your class
    - should be a public boolean method, which, given a reference to another object of the same class, will compare its fields to the appropiate fields of the invoking object
    - use the this keyword to refer to the current (invoking) object
- you should also write a hashCode() method that returns the same int whenever two objects are equal() to eachother
    - this is especially important if you plan to use your objects within data structures whose algorithms rely on an object's hash code in order to function properly
- if two objects are equal (have the same value / their references are same), they should have the same hash code
- if two objects have the same hash code it doesn't mean they are equal

Java
- has primitive datatypes - byte, short, int, long, float, double, char and boolean
- has reference datatypes - everything else - String, StringBuilder, StringBuffer, objects etc.
- when you pass a primitive to a method, it is passed by value - a copy of the primitive is sent to the method
- when you pass an object to a method, its reference is passed by value
    - a copy of the reference is sent into the method
    - if the method modifies its parameter, it will modify the original object
    
Destroying objects
- automatic - the JVM uses Garbage Collection to deallocate the memory (once the last reference to the object is lost)
- if the object has a finalize() method, the VM will invoke it just before the object is garbage collected

Primitive-type wrapper classes - for each Java primitive there is a wrapper class, they:
- provide useful constants (e.g. MAX_VALUE) and static methods (e.g. parseType() converts a String to a primitive type)
- allow generic container classes (arrays, lists etc.) to store primitives 
- convert a primitive to a string with toString() or by concatenation (e.g. "" + 42)
- autoboxing - easily convert between a wrapper object and its primitive counterpart
    Double wrapper = 34.5; // Double wrapper = new Double(34.5);
    double primitive = wrapper; // double primitive = wrapper.doubleValue();
    
Enums - use the 'enum' keyword to declare a typesafe enumeration of values
    public enum Color { RED, GREEN, BLUE }
    Color color = Color.RED;
- generates a new class behind the scenes
- each enum constant is declared as public static final field
- no public constructor for the class - can't create new enum constants at runtime
- provides both an equals() and toString()

Inheritance2
- a Java class can inherit from only one superclass
- if you dont explicitly extend a superclass when you create a class, the new class will inherit from the java.lang.Object
- a class declard as 'final' can't be extended - also allows the compiler to perform some optimizations

Casting
- a variable can refer to an object of its type, or a subclass type - e.g. Person p = new Employee();
    - the Employee object returned by the 'new' operator is implicitly cast (upcast) to a Person before the assigment takes place
    - upcasting - casting a subclass object up to its superclass datatype
    - this cast works because any field or method you may try to access through the superclass variable is guaranteed to exist in the subclass
- downcasting - explicitly casting a superclass to be a subclass will only work if the superclass variable references a subclass object
    - e.g.:
    Person p = new Employee(); 
    Employee e = (Employee) p;
    
    - if p doesn't refer to an Employee (or one of its subclasses), a ClassCastException will be thrown, e.g.:
    Person p = new Person();
    Employee e = (Employee) p;
    
    - use the instanceof operator to avoid that exception
    if (p instanceof Employee) {
        Employee e = (Employee) p;
    }

Method overloading
- two methods with the same name but diff param types or number of params

Method overriding
- two methods with the same name and the same params
- one method is in a superclass and the other is in a subclass
- a subclass can define a method that overrides a method in the superclass
- the subclass method must have the same signature as the superclass method
- @Override annotation - makes sure we override correctly - spelling etc.
- the subclass method mustn't be less accessible than the superclass method
- a 'final' method can't be overridden by a subclass

Polymorphism2
- by default, the VM uses dynamic lookup to determine which method to invoke
    - the method that is called depends on the datatype of the target object
    - a method called on an Employee object will call the Employee method, even if it's called through a Person reference
    Person p = new Employee();
    p.getName() // calls Employee's method
- allows you to create objects of diff (but related) types and manage them all in the same way, using the same code
    - you might store objects in a single collection, like an array
- final methods and methods in final classes, are statically bound, and the compiler may inline the code if it's short enough
    - since subclasses can't override these methods, the compiler, instead of the VM, can bind the method to its invocation
    
Super
- keyword that can be used in the subclass method to refer to the superclass
- user super(arg1 ... ) to invoke a superclass constructor
- goes up only one level

Abstract class
- can't be instantiated
- must be extended
    - used just to inherit from
- can have fields
- can have concrete methods
    - can have abstract methods - methods without implementation
    - ! abstract methods need to be overridden
    - if the class has abstract methods, the class must be abstract
- final classes and methods and abstract classes and methods are opposites

Interface
- is like an abstract class with all abstract methods
- the only fields that are allowed are static finals
    - no instance fields
- the only methods that are allowed are abstract methods
    - every method is implicitly abstract
    - every method is implicitly public
    - no concrete methods
- classes "implement" interfaces
- a class can implement 0 to many interfaces
- specifies behavior by declaring methods
- contain no actual implementation code
- any class that implements an interface must support the behavior by writing the methods
- class inheritance fulfills an 'is-a' relationship, interface implementation can be defined as an 'is' relationship
    - a HalogenLight is a Light; a HalogenLight is Switchable
- a class may extend only one class but may implement many interfaces
- an interface can extend (inherit from) another interface
    - a class the implements the extended interface must implement all inherited methods
- interfaces are another way to support polymorphism
    - a variable declared of an interface type can refer to an object of any class that implements that interface (e.g. Switchable s = new Fan();)
    - e.g. an array of interface type can be created to contain objects that are based upon classes that implement that interface
    
Collections
- collections are objects that hold and manipulate other objects, in a well-defined way (e.g. an array could be a type of collection)
- a collection class can be defined to contain data of type Object and can then hold objects of any given class type, since all objects can be implicitly cast to type Object
- downcasting is necessary to retrieve the original type from the collection
    - e.g. String st = (String) p1.getFirst();
        Integer i = (Integer) p2.getFirst();
    - downcasting is prove to ClassCastException, unless you check the datatype with the instanceof operator
        if (p2.getFirst() instanceof String)
            String s = (String) p2.getFirst();
            
Generics
- <T>
- Java introduced generics (also called parameterized types) to simplify a developer's code when using collections
- the collection object is passed the datatype of the objects it will store when it is instantiated
- using generics you no longer have to downcast when retrieving elements from a collection 
    - the compiler checks the the datatype that you will retrieve so there is no danger of ClassCastException
- a collection can even store multiple, different datatypes, e.g. <T1,T2>
    - Pair<String, Int> = new Pair<>("ABC", 1);
    
Comparable
- a class that implements Comparable is required to implement the compareTo() method
    public int compareTo(Point other) { // comparison logic }
- compareTo() returns an int that determines whether the target object is less than, greater than or equal to the passed-in object
    - return a negative value if the target object is less than the passed-in object
    - return a positive value if the target object is greater than the passed-in object
    - return zero for equality
- specify what you wish to compare against using a generic declaration within the 'implements' clause
    public class Point implements Comparable<Point> {
    - this determines the datatype of the parameter to your compareTo() method
- any client that wishes to sort Comparable objects can use the compareTo() method to determine the 'natural ordering' of the objects
    - the collection classes java.util.TreeSet and java.util.TreeMap rely on Comparable to sort objects
    
Packages
- a package is a convenient way of grouping classes that have related functionality, but may not be in the same file
- each .java file may specify that it's part of a package
- package names will correspond to directory names
- the Java API groups classes into packages with related functionality
    - java.lang - basic language classes
    - java.sql - database access classes
    - java.util - general utility classes
    - java.util.regex - regular expression utility classes etc.
- since classes may be loaded across the internet, packages reduce possibilities of namespace collisions (e.g. two packages can both contain a List class)
 

