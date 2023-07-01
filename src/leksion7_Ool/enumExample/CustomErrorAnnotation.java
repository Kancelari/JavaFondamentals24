package leksion7_Ool.enumExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.SOURCE)
@Target( ElementType.TYPE)
//
/*
This is a way how to create an annotation using @interface
Usually are used only to mantain metadata and have no effect in code
Also may have restriction for placement: at method, at class, at field etc
Restriction for usage: in runtime if are used for configuration
Otherwise just for source code for better understanding and code organization
 */
public @interface CustomErrorAnnotation {
    String getMessage();
    Class myCkass();
}
