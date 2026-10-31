package optimizer

object SoftAim {
    fun apply() {
        exec("settings put system soft_aim_weight 0.3")
        exec("settings put system aim_drag_friction 0.1")
        exec("settings put system aim_light_pull 1")
        exec("settings put system aim_smooth_factor 90")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
