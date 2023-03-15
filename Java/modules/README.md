Walking through the examples related to ¨Creating Nested Classes¨ from the "OCP Oracle Certified Professional Java SE 17 Developer Study Guide".

page 662

**Feeding module**\
Compile zoo.animal.feeding module: 
- javac --module-path mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java

Run zoo.animal.feeding module:
- java --module-path feeding --module zoo.animal.feeding/zoo.animal.feeding.Task

Packaging zoo.animal.feeding module:
- jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .

**Care module**\
Compile zoo.animal.care module:
- javac --module-path mods -d care care/zoo/animal/care/details/\*.java care/zoo/animal/care/medical/\*.java care/mod
  ule-info.java

Package zoo.animal.care module:
-  jar -cvf mods/zoo.animal.care.jar -C care/ .

**Talks module** \
Compile zoo.animal.talks:
- javac --module-path mods -d talks talks/zoo/animal/talks/content/\*.java talks/zoo/animal/talks/media/\*.java talks
  /zoo/animal/talks/schedule/*.java talks/module-info.java

Package zoo.animal.talks:
- jar -cvf mods/zoo.animal.talks.jar -C talks/ .

**Staff module:**\
Compile zoo.staff:
- javac -p mods -d staff staff/zoo/staff/*.java staff/module-info.java

Package zoo.staff:
-  jar -cvf mods/zoo.staff.jar -C staff/ .


Check the jar command: https://docs.oracle.com/en/java/javase/17/docs/specs/man/jar.html \
Check the javac command: https://docs.oracle.com/en/java/javase/17/docs/specs/man/javac.html