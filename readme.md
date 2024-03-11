## This was made for fabric 1.20.1 so may not work on other clients.
(also the icons arnt documented)
# Installing
1. Change the main client instance in FontRenderers to your main class.

# MixinInstance
1. To use this you just copy this mixin class or add it to your already made MinecraftClientMixin
```
@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Inject(method = "<init>", at = @At("TAIL"))
    void postWindowInit(RunArgs args, CallbackInfo ci) throws IOException {
        try {
            FontRenderers.settings = FontRenderers.createDefault(12f, "comfortaa");
            FontRenderers.modules = FontRenderers.createDefault(15f, "comfortaa");
            FontRenderers.categories = FontRenderers.createDefault(18f, "comfortaa");
            FontRenderers.outfit = FontRenderers.createDefault(15f, "OutfitSemiBold");
            FontRenderers.outfitbigger = FontRenderers.createDefault(30, "OutfitSemiBold");
            FontRenderers.name = FontRenderers.createDefault(60, "OutfitSemiBold");
            FontRenderers.cate = FontRenderers.createDefault(30, "urban");
            FontRenderers.thglitch = FontRenderers.createDefault(36f, "glitched");
            FontRenderers.monsterrat = FontRenderers.createDefault(18f, "monsterrat");
            FontRenderers.sf_bold = FontRenderers.createDefault(21f, "sf_bold");
            FontRenderers.sf_medium = FontRenderers.createDefault(16f, "sf_medium");
            FontRenderers.sf_medium_mini = FontRenderers.createDefault(12f, "sf_medium");
            FontRenderers.sf_bold_mini = FontRenderers.createDefault(14f, "sf_bold");
            FontRenderers.icons = FontRenderers.createIcons(20);
            FontRenderers.mid_icons = FontRenderers.createIcons(46f);
            FontRenderers.big_icons = FontRenderers.createIcons(72f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
Replace the String with the fontname to change the font you want and the float for the size

Also, you must create a fonts folder and just put it into the mods resource. I have attached a .rar with all of the fonts that you need and you can add more by putting a new ttf in the fonts folder and then init.
Your folder will look like this
ClientFolder -> src -> main -> resources -> fonts

## Usage
If you have installed correctly this is super easy.
Just use FontRenderers.<fontvar>.drawString() or centeredString etc
Example:
```
FontRenderers.outfitbigger.drawCenteredString(matrices,"Spiral Client", <x> , <y>,  <color>);
```
