package surreal.dangerouszone.core;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Map;

@IFMLLoadingPlugin.Name("DangerousZone")
@IFMLLoadingPlugin.MCVersion("1.7.10")
@IFMLLoadingPlugin.SortingIndex(-255)
public class DZCore implements IFMLLoadingPlugin {

    private static final String LINK = "https://orespawn.fr/download/orespawn-1-7-10/?tmstv=1724879932";

    public DZCore() {
        installOreSpawn();
    }

    private static void installOreSpawn() {
        File file = new File("mods/orespawnmc_1.7-v20.3.jar");
        if (file.exists()) return;
        file.getParentFile().mkdirs();

        try {
            URL url = new URL(LINK);
            InputStream stream = url.openStream();
            Files.copy(stream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            stream.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override public String[] getASMTransformerClass() { return null; }
    @Override public String getModContainerClass() { return null; }
    @Nullable @Override public String getSetupClass() { return null; }
    @Override public void injectData(Map<String, Object> map) {}
    @Override public String getAccessTransformerClass() { return null; }
}
