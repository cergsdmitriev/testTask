/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsamsontwo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 *
 * @author cerg
 */
public class MySuiteListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult itr) {
        
    }

    @Override
    public void onTestSuccess(ITestResult itr) {
    }

    @Override
    public void onTestFailure(ITestResult itr) {
    }

    @Override
    public void onTestSkipped(ITestResult itr) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult itr) {
    }

    @Override
    public void onStart(ITestContext itc) {
    }

    @Override
    public void onFinish(ITestContext itc) {
        System.out.println("test finish from listener");
    }
}
