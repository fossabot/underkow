package io.github.xstefanox.underkow

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

/**
 * The [CoroutineScope] in which every [io.undertow.server.HttpServerExchange] is handled.
 */
object HttpScope : CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO
}