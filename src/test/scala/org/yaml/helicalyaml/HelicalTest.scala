package org.yaml.helicalyaml

import org.junit._
import Assert._
import org.yaml.helicalyaml._

@Test
class HelicalTest {

    @Test
    def testScalar() {
    	val yaml = new Helical()
        assertEquals("aaa\n", yaml.dump("aaa"))
    }
}


