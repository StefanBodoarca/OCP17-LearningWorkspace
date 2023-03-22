package zoo.dinos;

import java.time.*;
import java.util.*;

import sun.misc.Unsafe;

public class Animatronic {

    private List<String> names;
    private LocalDate visitDate;

    public Animatronic(List<String> names, LocalDate visitDate) {
        this.names = names;
        this.visitDate = visitDate;
    }

    public void unsafeMethod() {
        Unsafe unsafe = Unsafe.getUnsafe();
    }
}

/*
Compile: javac zoo/dinos/*.java
Package:  jar -cvf zoo.dinos.jar .
Find info about dependencies: jdeps .\zoo.dinos.jar
 */
 */

 */
 */