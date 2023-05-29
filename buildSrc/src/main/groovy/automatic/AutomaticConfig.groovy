package automatic

import com.google.gson.Gson

class AutomaticConfig {
    FlavorInfo[] flavors

    static AutomaticConfig getClassInfo(File configFile) {
        def inputStringReader = new InputStreamReader(configFile.newInputStream())
        BufferedReader reader = new BufferedReader(inputStringReader)
        return new Gson().fromJson(reader, AutomaticConfig.class)
    }

    @Override
    public String toString() {
        return "flavors=" + Arrays.toString(flavors)
    }

    class FlavorInfo {
        public String flavorName

        @Override
        String toString() {
            return flavorName
        }
    }
}