package io.github.xstefanox.underkow.example

import com.beust.klaxon.Converter
import com.beust.klaxon.JsonValue

/**
 * Convert a [PetId] to and from JSON.
 */
internal class PetIdConverter : Converter {

    override fun canConvert(cls: Class<*>): Boolean {
        return PetId::class.java == cls
    }

    override fun fromJson(jv: JsonValue): PetId {
        return PetId(jv.string!!)
    }

    override fun toJson(value: Any): String {
        return """"$value""""
    }
}
