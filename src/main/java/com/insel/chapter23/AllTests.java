package com.insel.chapter23;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SelectPackages("com.insel.chapter23")
@SuiteClasses({Fixtures.class, StringUtilsTest.class})
/* This should work but doesn't*/
public class AllTests {

}
