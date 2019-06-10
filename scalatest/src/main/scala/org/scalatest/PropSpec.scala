/*
 * Copyright 2001-2019 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatest

/**
  * This class is deprecated and will be removed in future version of ScalaTest, please use org.scalatest.funspec.AnyFunSpec instead.
  */
@Finders(Array("org.scalatest.finders.PropSpecFinder"))
@deprecated("Please use org.scalatest.propspec.AnyPropSpec instead")
class PropSpec extends PropSpecLike {
  /**
    * Returns a user friendly string for this suite, composed of the
    * simple name of the class (possibly simplified further by removing dollar signs if added by the Scala interpeter) and, if this suite
    * contains nested suites, the result of invoking <code>toString</code> on each
    * of the nested suites, separated by commas and surrounded by parentheses.
    *
    * @return a user-friendly string for this suite
    */
  override def toString: String = Suite.suiteToString(None, this)
}
