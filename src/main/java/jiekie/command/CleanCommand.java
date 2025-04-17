package jiekie.command;

import jiekie.util.ChatUtil;
import jiekie.util.SoundUtil;
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
        if(!(sender instanceof Player)) {
            ChatUtil.notPlayer(sender);
            return true;
        }

        Player player = (Player) sender;
        if(!player.isOp()) {
            ChatUtil.notOp(player);
            return true;
        }

        if(args == null || args.length == 0) {
            ChatUtil.commandHelper(player);
            return true;
        }

        switch (args[0]) {
            case "채팅창":
                cleanChat(player);
                break;

            case "몬스터":
                killMonsters(player);
                break;

            case "동물":
                killAnimals(player);
                break;

            case "아이템":
                killDropItems(player);
                break;

            case "화살":
                killArrows(player);
                break;

            case "경험치":
                killExperienceOrbs(player);
                break;

            case "주민":
                killVillagers(player);
                break;

            case "도움말":
                ChatUtil.commandList(player);
                break;

            default:
                ChatUtil.commandHelper(player);
                break;
        }

        return true;
    }

    /* 채팅창 */
    private void cleanChat(Player player) {
        for(int i = 0 ; i < 100 ; i++) {
            Bukkit.broadcastMessage("");
        }

        ChatUtil.cleanChat(player);
        SoundUtil.playNoteBlockBell(player);
    }

    /* 몬스터 */
    private void killMonsters(Player player) {
        World world = player.getWorld();
        for(Entity entity : world.getEntities()) {
            if(entity instanceof Monster)
                entity.remove();
        }

        ChatUtil.killMonsters(player);
        SoundUtil.playNoteBlockBell(player);
    }

    /* 동물 */
    private void killAnimals(Player player) {
        World world = player.getWorld();
        for (Entity entity : world.getEntities()) {
            if (entity instanceof Animals)
                entity.remove();
        }

        ChatUtil.killAnimals(player);
        SoundUtil.playNoteBlockBell(player);
    }

    /* 아이템 */
    private void killDropItems(Player player) {
        World world = player.getWorld();
        for (Entity entity : world.getEntities()) {
            if (entity instanceof Item)
                entity.remove();
        }

        ChatUtil.killItems(player);
        SoundUtil.playNoteBlockBell(player);
    }

    /* 화살 */
    private void killArrows(Player player) {
        World world = player.getWorld();
        for (Entity entity : world.getEntities()) {
            if (entity instanceof Arrow)
                entity.remove();
        }

        ChatUtil.killArrows(player);
        SoundUtil.playNoteBlockBell(player);
    }

    /* 경험치 */
    private void killExperienceOrbs(Player player) {
        World world = player.getWorld();
        for (Entity entity : world.getEntities()) {
            if (entity instanceof ExperienceOrb)
                entity.remove();
        }

        ChatUtil.killExperienceOrbs(player);
        SoundUtil.playNoteBlockBell(player);
    }

    /* 경험치 */
    private void killVillagers(Player player) {
        World world = player.getWorld();
        for (Entity entity : world.getEntities()) {
            if (entity instanceof Villager)
                entity.remove();
        }

        ChatUtil.killVillagers(player);
        SoundUtil.playNoteBlockBell(player);
    }
}
