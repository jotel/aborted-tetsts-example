/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aborted.tetsts.example

import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class FailInBeforeTest extends AnyFunSuite with BeforeAndAfter {

    before {
        fail("This should be aborted")
    }

    test("some test") {

    }
}
