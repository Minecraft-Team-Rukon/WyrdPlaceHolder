package org.wyrd.wyrdPlaceHolder;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import org.wyrd.wyrdPlaceHolder.placeholders.ChannelHolder;
import org.wyrd.wyrdPlaceHolder.placeholders.LevelHolder;

public final class WyrdPlaceHolder extends JavaPlugin {

    @Getter
    private static WyrdPlaceHolder inst;

    @Override
    public void onEnable() {
        new LevelHolder().register();
        new ChannelHolder().register();
    }

    @Override
    public void onDisable() {
    }
}
