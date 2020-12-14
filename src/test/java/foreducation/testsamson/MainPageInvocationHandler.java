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
       
       Selector annotation = method.getAnnotation(Selector.class);
       
       return annotation.xpath();
   }
}
