/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreducation.testsamson;

import java.lang.reflect.Proxy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;




/**
 *
 * @author cerg
 */


public class MethodInterception {

    @Test
    public void annotationValue() {
        MainPage mainPage = createPage(MainPage.class);
        assertNotNull(mainPage);
        assertEquals(mainPage.buttonSearch(), ".//*[@test-attr='button_search']");
        assertEquals(mainPage.textInputSearch(), ".//*[@test-attr='input_search']");
    }

    private MainPage createPage(Class clazz) {
        MainPage mainPage;
        mainPage = null;
        try {
            MainPageInvocationHandler handler;
            handler = new MainPageInvocationHandler();
            ClassLoader mainPageClassLoader = clazz.getClassLoader();
            mainPage = (MainPage) Proxy.newProxyInstance(mainPageClassLoader,
                                          new Class<?>[] { clazz },
                                          handler);
            
        } catch (SecurityException | IllegalArgumentException   ex) {
            System.out.println(ex.toString());
        }
        return mainPage;
    }
}
