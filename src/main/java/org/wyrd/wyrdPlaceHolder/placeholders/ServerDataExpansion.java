package org.wyrd.wyrdPlaceHolder.placeholders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.wyrd.wyrdutil.WyrdUtil;

public class ServerDataExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "wyrd";
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
        return switch (params) {
            case "channel" -> WyrdUtil.getServerNumber();
            default -> "?????";
        };

    }
}
