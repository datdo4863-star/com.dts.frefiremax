package optimizer

object FixDlops {
    fun apply() {
        exec("settings put system dlops_fix 1")
        exec("settings put system frame_drop_fix 1")
        exec("settings put system render_skip_fix 1")
        exec("settings put system dlops_threshold 0")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
