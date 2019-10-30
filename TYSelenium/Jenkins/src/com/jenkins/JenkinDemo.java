package com.jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinDemo {
@Test
public void print() {
	Reporter.log("HI", true);
}
}
