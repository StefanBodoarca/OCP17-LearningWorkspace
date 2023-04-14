package annotations;

/*
 - if the annotation does not contain any elements it is referred
   as a marker annotation
 */
public @interface Exercise {

    //add an element/attribute (not anymore a marker annotation)
    int hoursPerDay();

    //add an element with an optional value
    int startHour() default 6;
}
