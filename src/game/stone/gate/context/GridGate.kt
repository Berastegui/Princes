package game.stone.gate.context

import game.stone.gate.GateContext

class GridGate(
    name: String
): GateContext(
    name = name
) {
    override fun open() {
        partiallyOpen()
    }

    override fun close() {
        partiallyClose()
    }

}