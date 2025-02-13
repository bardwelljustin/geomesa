/***********************************************************************
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa

import java.lang.reflect.InvocationTargetException

package object kafka {

  def tryInvocation[T](fn: => T): T = {
    try { fn } catch {
      case e: InvocationTargetException => throw e.getCause
    }
  }
}
