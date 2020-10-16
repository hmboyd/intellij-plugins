// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package training.learn.lesson.python.navigation

import training.learn.interfaces.Module
import training.learn.lesson.general.navigation.SearchEverywhereLesson

class PythonSearchEverywhereLesson(module: Module) : SearchEverywhereLesson(module, "Python") {
  override val existedFile = "src/declaration_and_usages_demo.py"
  override val resultFileName: String = "quadratic_equations_solver.py"
}
