/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsamsontwo;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 *
 * @author cerg
 */
public class MySuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite isuite) {
        System.out.println("Starting");
    }

    @Override
    public void onFinish(ISuite isuite) {
        System.out.println("Finishing");
    }
}
