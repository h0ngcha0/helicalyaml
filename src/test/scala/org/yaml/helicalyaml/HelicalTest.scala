package org.yaml.helicalyaml

import org.junit._
import Assert._
import org.yaml.helicalyaml._

@Test
class HelicalTest {

    @Test
    def testDumpScalar() {
    	val yaml = new Helical()
        assertEquals("aaa\n", yaml.dump("aaa"))
        assertEquals("1\n", yaml.dump(1))
        assertEquals("false\n", yaml.dump(false))
    }
    
    @Test
    def testLoadScalar() {
    	val yaml = new Helical()
        assertEquals("aaa", yaml.load("aaa"))
        assertEquals(1, yaml.load("1"))
        assertEquals(false, yaml.load("false"))
    }
}


