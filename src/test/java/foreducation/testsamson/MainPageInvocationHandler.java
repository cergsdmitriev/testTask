/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreducation.testsamson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author cerg
 */
public class MainPageInvocationHandler implements InvocationHandler {
   
    
    
   @Override
   public Object invoke(Object proxy, Method method, Object[] args) {
       String annotationString = method.getAnnotations()[0].toString();
       annotationString = annotationString.substring(41, annotationString.length()-2);
       
       return annotationString;
   }
}
