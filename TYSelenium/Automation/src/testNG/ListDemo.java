package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +"ontest start");
		System.out.println(result.getStatus() +"ontest start status");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
		System.out.println((result.getStatus()));
	}
	@Override
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getOutputDirectory()+"99");
		System.out.println(context.getStartDate());
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate());
		System.out.println(context.getFailedTests()+"Failed Test");
		System.out.println(context.getPassedTests()+"Passed Test");
	}
	
}
