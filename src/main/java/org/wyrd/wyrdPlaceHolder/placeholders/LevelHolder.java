package org.wyrd.wyrdPlaceHolder.placeholders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.rukon0621.wyrddata.data.PlayerData;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LevelHolder extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "wyrd_level";
    }

    @Override
    public @NotNull String getAuthor() {
        return "_Rukon";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0";
    }

    @Override
    public @Nullable String onPlaceholderRequest(Player player, @NotNull String params) {
        if(PlayerData.isFullyLoaded(player)) return String.valueOf(PlayerData.get(player).getLevel());
        return "0";
    }
}
