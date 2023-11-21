Create a basic Alarm application with a snooze feature

Language - Java

Notes:
/*
Constructor ==> initializes the objects
Destructor  ==> releases the object resources, there are no destructors in JAVA
Garbage collector is a system that tracks references of all objects and gets rid of objects
when they become unreachable/unused.
Garbage collection is only about memory


Adding **final** to a class prevents other classes from inheriting it
If we add **final** to a superclass method, we cannot override a method from the subclass
**Effect of Final:**
* On a variable/field: cannot reassign
* On a method: cannot override
* On a class: cannot inherit


Note:
Methods called by a constructor should either be private or final
Sealed classes ==> use sealed keyword in class definition
Ex: public sealed class Alarm permits PriorityAlarm, HighVisibilityAlarm { }

Subclass should also have type as
A) sealed B) non-sealed(represents a regular class) C) final 


Abstract Methods are methods without a body
Used in cases where parent/superclass has a method reference 
but doesn't necessarily need a body/implementation as subclasses have their own implementation of that method
And all the subclasses should have the method implementation defined
If a method is abstract then the class should also be defined as abstract
