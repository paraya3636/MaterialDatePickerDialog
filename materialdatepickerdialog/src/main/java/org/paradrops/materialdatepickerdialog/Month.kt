package org.paradrops.materialdatepickerdialog

enum class Month(val value: Int) {
    January(0),
    February(1),
    March(2),
    April(3),
    May(4),
    June(5),
    July(6),
    August(7),
    September(8),
    October(9),
    November(10),
    December(11),
    Undecimber(12);

    companion object {
        @JvmStatic
        fun get(findValue: Int) : Month? = Month.values().firstOrNull {
            it.value == findValue
        }
    }
}
