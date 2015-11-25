package com.turreta.junit4.suite.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestCase001.class, TestCase002.class})
public class SuiteTest {

}
