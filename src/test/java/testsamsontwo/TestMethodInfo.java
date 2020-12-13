/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsamsontwo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author cerg
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface TestMethodInfo {

    //Приоритет теста
    Priority priority() default Priority.Major;

    //Автор теста	
    String author() default "Bill Gates";

    //Дата последних изменений в тесте
    String lastModified() default "01.01.2019";
}
