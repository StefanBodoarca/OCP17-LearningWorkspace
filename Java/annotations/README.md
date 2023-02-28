Walking through the examples related to ¨Annotations¨ from the "OCP Oracle Certified Professional Java SE 11 Programmer II Study Guide".

page 85/758

The purpose of an annotation is to assign metadata attributes to classes, methods, variables, and other Java
types.

**1st rule** \
Annotations function a lot like interfaces.

**2nd rule** \
Annotations establish relationships that make it easier
to manage data about our application.

**3rd rule** \
An annotation ascribes custom information on the declaration where it is
defined.

**4th rule** \
Annotations are optional metadata and
by themselves do not do anything.

We use the @interface annotation (all lowercase) to declare an annotation. Like classes and interfaces, they are
commonly defined in their own file as a top-level type, although they can be defined inside a class declaration
like an inner class.

Similar to a default element value (the
default value of an annotation must be a non-null constant expression.), an annotation element cannot be declared with just any type. It must be a
primitive type, a String, a Class, an enum, another annotation, or an array of any of these types.

