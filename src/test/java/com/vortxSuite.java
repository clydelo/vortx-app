package com;

import com.client.vortxTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class vortxSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for vortx");
    suite.addTestSuite(vortxTest.class);
    return suite;
  }
}
