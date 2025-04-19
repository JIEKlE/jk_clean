package jiekie.completer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CleanTabCompleter implements TabCompleter {
    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!sender.hasPermission("jk.clean.command")) return Collections.emptyList();

        if(args.length == 1)
            return Arrays.asList("채팅창", "몬스터", "동물", "아이템", "화살", "경험치", "주민", "도움말");

        return Collections.emptyList();
    }
}
