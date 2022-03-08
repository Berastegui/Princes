package game

import game.stone.gate.CloseGate
import game.stone.gate.OpenGate
import game.stone.guardian.WarnGuardian
import game.stone.gate.context.GridGate
import game.stone.guardian.Guardian
import game.stone.gate.context.SimpleGate
import game.stone.Stone

class Play {
    companion object {

        @JvmStatic
        fun main(args : Array<String>) {

            val guardian = Guardian("guardian 1")
            val gate = SimpleGate("simple gate 1")
            val grid = GridGate("grid gate")
            val props = listOf(guardian, gate, grid)

            val openGate = OpenGate(gate)
            val closeGate = CloseGate(gate)
            val openGridGate = OpenGate(grid)
            val closeGridGate = CloseGate(grid)
            val warnGuardian = WarnGuardian(guardian)

            val stone1 = Stone()
            stone1.addAction(closeGate)
            stone1.addAction(warnGuardian)

            val stone2 = Stone()
            stone2.addAction(openGate)

            val stone3 = Stone()
            stone3.addAction(closeGridGate)

            val stone4 = Stone()
            stone4.addAction(openGridGate)

            printState(props)

            stone1.exec()
            println("STONE 1")

            printState(props)

            stone1.exec()
            println("STONE 1")

            printState(props)

            stone2.exec()
            println("STONE 2")

            printState(props)

            stone1.exec()
            println("STONE 1")

            printState(props)

            stone3.exec()
            println("STONE 3")

            printState(props)

            stone3.exec()
            println("STONE 3")

            printState(props)

            stone3.exec()
            println("STONE 3")

            printState(props)

            stone4.exec()
            println("STONE 4")

            printState(props)

            stone3.exec()
            println("STONE 3")

            printState(props)

            stone4.exec()
            println("STONE 4")

            printState(props)

            stone4.exec()
            println("STONE 4")

            printState(props)

            stone4.exec()
            println("STONE 4")

            printState(props)


        }

        @JvmStatic
        private fun printState(props: List<IContext>) {
            println("====================================")
            props.forEach {
                println(it.getName())
                println(it.getState())
            }
            println()
        }
    }
}