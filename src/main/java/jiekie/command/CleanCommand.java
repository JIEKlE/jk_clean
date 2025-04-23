package jiekie.command;

import jiekie.util.ChatUtil;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.jetbrains.annotations.NotNull;

public class CleanCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player && !sender.isOp()) {
            ChatUtil.notOp(sender);
            return true;
        }

        if(args == null || args.length == 0) {
            ChatUtil.commandHelper(sender);
            return true;
        }

        switch (args[0]) {
            case "채팅창":
                cleanChat();
                break;

            case "몬스터":
                killMonsters(sender);
                break;

            case "동물":
                killAnimals(sender);
                break;

            case "아이템":
                killDropItems();
                break;

            case "화살":
                killArrows();
                break;

            case "경험치":
                killExperienceOrbs();
                break;

            case "주민":
                killVillagers(sender);
                break;

            case "도움말":
                ChatUtil.commandList(sender);
                break;

            default:
                ChatUtil.commandHelper(sender);
                break;
        }

        return true;
    }

    /* 채팅창 */
    private void cleanChat() {
        for(Player player : Bukkit.getOnlinePlayers()) {
            for(int i = 0 ; i < 100 ; i++)
                player.sendMessage("");
        }

        ChatUtil.cleanChat();
    }

    /* 몬스터 */
    private void killMonsters(CommandSender sender) {
        if(!(sender instanceof Player)) {
            ChatUtil.notPlayer(sender);
            return;
        }

        Player player = (Player) sender;
        World world = player.getWorld();
        for(Entity entity : world.getEntities()) {
            if(entity instanceof Monster
                || entity instanceof Slime
                || entity instanceof Shulker
                || entity instanceof MagmaCube
                || entity instanceof EnderDragon
                || entity instanceof Wither)
                entity.remove();
        }

        ChatUtil.killMonsters();
    }

    /* 동물 */
    private void killAnimals(CommandSender sender) {
        if(!(sender instanceof Player)) {
            ChatUtil.notPlayer(sender);
            return;
        }

        Player player = (Player) sender;
        World world = player.getWorld();
        for (Entity entity : world.getEntities()) {
            if (entity instanceof Animals)
                entity.remove();
        }

        ChatUtil.killAnimals();
    }

    /* 아이템 */
    private void killDropItems() {
        for(World world : Bukkit.getWorlds()) {
            for (Entity entity : world.getEntities()) {
                if (entity instanceof Item)
                    entity.remove();
            }
        }

        ChatUtil.killItems();
    }

    /* 화살 */
    private void killArrows() {
        for(World world : Bukkit.getWorlds()) {
            for (Entity entity : world.getEntities()) {
                if (entity instanceof Arrow)
                    entity.remove();
            }
        }

        ChatUtil.killArrows();
    }

    /* 경험치 */
    private void killExperienceOrbs() {
        for(World world : Bukkit.getWorlds()) {
            for (Entity entity : world.getEntities()) {
                if (entity instanceof ExperienceOrb)
                    entity.remove();
            }
        }

        ChatUtil.killExperienceOrbs();
    }

    /* 주민 */
    private void killVillagers(CommandSender sender) {
        if(!(sender instanceof Player)) {
            ChatUtil.notPlayer(sender);
            return;
        }

        Player player = (Player) sender;
        World world = player.getWorld();
        for (Entity entity : world.getEntities()) {
            if (entity instanceof Villager)
                entity.remove();
        }

        ChatUtil.killVillagers();
    }
}
