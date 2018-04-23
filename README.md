# CinemaTicketsTest
Simple command line app for purchasing cinema tickets

ANSWERS TO EXERCISE 1:

23rd April 2018
Author: Nick Shah

QA Consulting Pre-Assessment

Exercise 1:

Encapsulation:

Encapsulation is also referred to as “data hiding”.  It refers to not allowing direct access to the fields (variables) of one class (which defines one object) from another class.  This is done by defining the class fields as PRIVATE and then allowing access to the values of these fields by defining PUBLIC methods known as setters and getters.

The benefits of encapsulation are:
1.	To hide the exact implementation of the data architecture of a class
2.	To allow fields to be only readable or writeable, but not both.
3.	The class getter and setter methods could be changed (improved) overtime without breaking the usability of the class by other classes.

In my solution for the Cinema Tickets exercise, I  have used the idea of encapsulation in InMemoryTicketStore class by defining numTicketsBought and totalPrice as private fields and then defining getNumTicketsOrdered() and getTotalTicketPrice() as getters for the values of these two local and private variables.

Inheritance:

Inheritance refers to allowing one class (say Class B – which will be subclass) have access to all the data fields and methods of another class (say Class A – which will be a superclass).  Inheritance is exectuted by using the keyword “extends” in Java.

One of the major benefits of inheritance is that it allows common code to be re-used more efficiently.  Suppose the objects of some software code were particular cars – say Ford, Renault and BMW cars.  All these cars would  have some properties that would be common to them all e.g. colour, whether 2 or 4 door, etc.  But some properties would not necessarily be expected in all cars e.g. whether they have parking sensors.  So, it is useful to create a class with all the common properties, and then extend this class for each particular car’s properties that are not shared. 

Polymorphism:

Polymorphism refers to the ability of the same method call resulting in different outcomes, either because the method has different implementations based on which particular object it is action on, or because the method acts on different parameters.   The former is called “method overriding” and the latter is called “method overloading”.  The former is achieved by defining an interface and then implementing the interface in different classes.  The latter is achieved by defining different methods dependent on the parameters passed to the method at runtime.
I  have an example of the former in my CinemaTicketsTest1 project by defining TicketStore as an interface and then defining InMemoryTicketStore as an implementation of TicketStore.

Abstraction:

Abstraction is a methodology  of hiding the implementation details  of how an object does what it does – instead, the user is allowed to use the features of an object without knowing how the features are implemented.

In my CinemaTicketsTest1 project, the InMemoryTicketStore method getTotalTicketPrice returns the total cost of all tickets of different types bought, but the user of this method doesn’t know that totalPrice is calculated in another method purchaseTickets.
