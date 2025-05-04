package org.wyrd.wyrdPlaceHolder;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import org.wyrd.wyrdPlaceHolder.placeholders.ServerDataExpansion;
import org.wyrd.wyrdPlaceHolder.placeholders.PlayerDataExpansion;

public final class WyrdPlaceHolder extends JavaPlugin {

    @Getter
    private static WyrdPlaceHolder inst;

    @Override
    public void onEnable() {
        new PlayerDataExpansion().register();
        new ServerDataExpansion().register();
    }

    @Override
    public void onDisable() {
    }
}
