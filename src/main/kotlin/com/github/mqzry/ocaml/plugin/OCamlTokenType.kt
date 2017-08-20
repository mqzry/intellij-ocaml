package com.github.mqzry.ocaml.plugin

import com.intellij.psi.tree.IElementType

/**
 * @author mhas
 */

open class OCamlTokenType(name: String, val isToken: Boolean = false) : IElementType(name, OCamlLanguage.INSTANCE) {

    override fun toString(): String {
        return "OCaml." + super.toString()
    }
}