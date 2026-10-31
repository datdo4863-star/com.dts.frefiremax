package optimizer

object DisplayFix {
    fun apply() {
        exec("settings put system render_mode ultra")
        exec("settings put system frame_pacing 0")
        exec("settings put system display_lag_fix 1")
        exec("settings put system gpu_overdraw 0")
        exec("settings put system drop_threshold 0")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
EOFcat > com.dts.freefiremax/optimizer/DisplayFix.kt << 'EOF'
package optimizer

object DisplayFix {
    fun apply() {
        exec("settings put system render_mode ultra")
        exec("settings put system frame_pacing 0")
        exec("settings put system display_lag_fix 1")
        exec("settings put system gpu_overdraw 0")
        exec("settings put system drop_threshold 0")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
