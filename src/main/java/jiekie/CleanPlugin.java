package jiekie;

import jiekie.command.CleanCommand;
import jiekie.completer.CleanTabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class CleanPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // 명령어 등록
        getCommand("청소").setExecutor(new CleanCommand());

        // 자동완성 등록
        getCommand("청소").setTabCompleter(new CleanTabCompleter());

        getLogger().info("서버 청소 플러그인 by Jiekie");
        getLogger().info("Copyright © 2025 Jiekie. All rights reserved.");
    }

    @Override
    public void onDisable() {}
}
