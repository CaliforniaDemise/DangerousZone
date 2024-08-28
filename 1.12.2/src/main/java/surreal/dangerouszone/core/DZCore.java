package surreal.dangerouszone.core;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Map;

@IFMLLoadingPlugin.Name("DangerousZone")
@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.SortingIndex(-255)
public class DZCore implements IFMLLoadingPlugin {

    private static final String LINK = "https://dangerzone-archive.weebly.com/uploads/1/3/6/2/136250918/orespawnmc_1.12-development_0.8_-_public.jar";

    public DZCore() {
        installOreSpawn();
    }

    private static void installOreSpawn() {
        File file = new File("mods/orespawnmc_1.12-v0.8.jar");
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
