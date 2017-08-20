package com.github.mqzry.ocaml.plugin

import com.intellij.psi.tree.IElementType


/**
 * @author mhas
 */

open class OCamlElementType(name: String, val isToken: Boolean = false) : IElementType(name, OCamlLanguage.INSTANCE)