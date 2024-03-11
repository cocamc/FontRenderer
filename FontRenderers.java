
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class FontRenderers {
    public static FontAdapter settings;
    public static FontAdapter modules;
    public static FontAdapter categories;
    public static FontAdapter icons;
    public static FontAdapter mid_icons;
    public static FontAdapter outfit;
    public static FontAdapter outfitbigger;
    public static FontAdapter name;
    public static FontAdapter big_icons;
    public static FontAdapter thglitch;
    public static FontAdapter monsterrat;
    public static FontAdapter cate;
    public static FontAdapter sf_bold;
    public static FontAdapter sf_bold_mini;
    public static FontAdapter sf_medium;
    public static FontAdapter sf_medium_mini;



    public static FontAdapter getSettingsRenderer() {
        return settings;
    }

    public static FontAdapter getModulesRenderer() {
        return modules;
    }

    // Replace the Menu class with your mainclass which extends implements ModInitializer

    public static @NotNull RendererFontAdapter createDefault(float size, String name) throws IOException, FontFormatException {
        return new RendererFontAdapter(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(Menu.class.getClassLoader().getResourceAsStream("fonts/" + name + ".ttf"))).deriveFont(Font.PLAIN, size * 2), size * 2);
    }

    public static @NotNull RendererFontAdapter createIcons(float size) throws IOException, FontFormatException {
        return new RendererFontAdapter(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(Menu.class.getClassLoader().getResourceAsStream("fonts/icons.ttf"))).deriveFont(Font.PLAIN, size * 2), size * 2);
    }
}
