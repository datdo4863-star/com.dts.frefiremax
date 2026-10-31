package optimizer

object Unlock90Hz {
    fun apply() {
        exec("settings put system target_fps 90")
        exec("settings put system refresh_rate_override 90")
        exec("settings put system force_90hz 1")
        exec("settings put system peak_refresh_rate 90")
        exec("settings put system min_refresh_rate 90")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
