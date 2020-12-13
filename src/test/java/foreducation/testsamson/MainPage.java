/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreducation.testsamson;

/**
 *
 * @author cerg
 */
public interface MainPage {

    @Selector(xpath = ".//*[@test-attr='input_search']")
    String textInputSearch();

    @Selector(xpath = ".//*[@test-attr='button_search']")
    String buttonSearch();
}
