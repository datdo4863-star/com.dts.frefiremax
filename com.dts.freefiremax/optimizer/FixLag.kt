package optimizer

object FixLag {
    fun apply() {
        exec("settings put system network_latency_fix 1")
        exec("settings put system tcp_buffer_size_default 1048576")
        exec("settings put system wifi_scan_throttle_enabled 0")
        exec("settings put system game_lag_reduce 1")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
