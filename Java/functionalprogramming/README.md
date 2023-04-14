Walking through the examples related to ¨Introducing Functional Programming¨ from the "OCP Oracle Certified Professional Java SE 11 Programmer II Study Guide".

page 66/758

A _functional interface_ is an interface that contains a single abstract method.

If a functional interface includes an abstract method with the same signature as a
public
method found in
Object,
then those methods do not count toward the single abstract method test. The
motivation behind this rule is that any class that implements the interface will inherit from
Object,
as all
classes do, and therefore always implement these methods.

Since Java assumes all classes extend from Object, you also cannot declare an
interface method that is incompatible with Object. For example, declaring an abstract method int
toString() in an interface would not compile since Object's version of the method returns a String.