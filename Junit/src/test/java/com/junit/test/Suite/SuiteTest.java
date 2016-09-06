package com.junit.test.Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.junit.test.before.after.BeforeAfterTest;
import com.junit.test.before.after_class.BeforeAfterClassTest;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({ BeforeAfterTest.class, BeforeAfterClassTest.class })
public class SuiteTest {
}
