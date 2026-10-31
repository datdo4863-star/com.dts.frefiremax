package optimizer

object SmoothCloud {
    fun apply() {
        exec("settings put system thread_priority -20")
        exec("settings put system gpu_level 5")
        exec("settings put system cpu_boost_game 1")
        exec("settings put system cloud_render_smooth 1")
        exec("settings put system motion_boost 1")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
