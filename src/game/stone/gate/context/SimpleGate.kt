package game.stone.gate.context

import game.stone.gate.GateContext

open class SimpleGate(
    name: String
): GateContext(name = name) {

    override fun open () {
        fullyOpen()
    }
    override fun close() {
        fullyClose()
    }
}