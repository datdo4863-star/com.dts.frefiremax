package optimizer

object TouchSensitivity {
    fun apply() {
        exec("settings put system touch_slop 2")
        exec("settings put system pointer_speed 5")
        exec("settings put system touch_response_boost 1")
        exec("settings put system touch_latency_min 1")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
