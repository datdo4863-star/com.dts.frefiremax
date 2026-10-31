package optimizer

object Overclock {
    fun apply() {
        exec("settings put system cpu_overclock 1")
        exec("settings put system gpu_overclock 1")
        exec("settings put system perf_mode game")
        exec("settings put system motion_fast_render 1")
        exec("settings put system display_overclock_hz 90")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
