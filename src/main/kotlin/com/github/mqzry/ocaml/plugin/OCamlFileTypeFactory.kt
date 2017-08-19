package com.github.mqzry.ocaml.plugin

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class OCamlFileTypeFileTypeFactory : FileTypeFactory() {

    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(OCamlFileType, OCamlFileType.DEFAULTS.EXTENSION)
    }

}