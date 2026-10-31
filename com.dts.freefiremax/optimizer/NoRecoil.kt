package optimizer

object NoRecoil {
    fun apply() {
        exec("settings put system recoil_factor 0")
        exec("settings put system recoil_vertical 0")
        exec("settings put system recoil_horizontal 0")
        exec("settings put system recoil_compensate 100")
    }
    private fun exec(cmd: String) {
        Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd)).waitFor()
    }
}
