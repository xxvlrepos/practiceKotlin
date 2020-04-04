import kotlin.test.assertEquals
fun main() {
    val regex = """^for\s+[a-z]+:=\s*\d+\s+to\s+\d+\s+do\s+write\((\d|[a-z]+)\);\s+end\.${'$'}""".toRegex()
    val matchResult = regex.matchEntire(
        "for i:= 1 to 5 do \n" +
                "write('Hello');\n" +
                "end."
    )
    if (matchResult != null) {
        assertEquals(
            "for i:= 1 to 5 do \n" +
                    "write('Hello');\n" +
                    "end.", matchResult.value
        )
    }
}