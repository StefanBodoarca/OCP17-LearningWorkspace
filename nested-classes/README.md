Walking through the examples related to ¨Creating Nested Classes¨ from the "OCP Oracle Certified Professional Java SE 11 Programmer II Sutdy Guide".

page 52/758

Benefits:
- they can encapsulate helper classes by restricting them to the containing classes.
- they can make it easy to create a class that will be used in onlt one place.
- they can make the code cleaner and easier to read.

Drawbacks (when used improperly):
- they can sometimes make the code harder to read.
- tightly coupling the enclosing and inner class (if you want to use the inner class by itself move this class out into a separate top-level class).


