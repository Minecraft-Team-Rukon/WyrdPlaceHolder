package org.wyrd.wyrdPlaceHolder.placeholders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.rukon0621.wyrddata.data.PlayerData;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.wyrd.wyrdutil.WyrdUtil;

public class PlayerDataExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "wyrduser";
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
        if(!PlayerData.isFullyLoaded(player)) return "?";
        return switch (params) {
            case "level" -> String.valueOf(PlayerData.get(player).getLevel());
            default -> "?????";
        };
    }
}
