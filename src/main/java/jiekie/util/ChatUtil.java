package jiekie.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class ChatUtil {
    public static String getWarnPrefix() {
        return "[ " + ChatColor.YELLOW + "❗" + ChatColor.WHITE + " ] ";
    }

    public static void notOp(CommandSender sender) {
        sender.sendMessage(getWarnPrefix() + "권한이 없습니다.");
    }

    public static void notPlayer(CommandSender sender) {
        sender.sendMessage(getWarnPrefix() + "플레이어가 아닙니다.");
    }

    public static void cleanChat() {
        Bukkit.broadcastMessage(getWarnPrefix() + "채팅창을 청소했습니다.");
    }
    
    public static void killMonsters() {
        Bukkit.broadcastMessage(getWarnPrefix() + "몬스터를 제거했습니다.");
    }

    public static void killAnimals() {
        Bukkit.broadcastMessage(getWarnPrefix() + "동물을 제거했습니다.");
    }

    public static void killItems() {
        Bukkit.broadcastMessage(getWarnPrefix() + "바닥에 떨어진 아이템을 제거했습니다.");
    }

    public static void killArrows() {
        Bukkit.broadcastMessage(getWarnPrefix() + "화살을 제거했습니다.");
    }

    public static void killExperienceOrbs() {
        Bukkit.broadcastMessage(getWarnPrefix() + "경험치 공을 제거했습니다.");
    }

    public static void killVillagers() {
        Bukkit.broadcastMessage(getWarnPrefix() + "주민을 제거했습니다.");
    }

    public static void commandHelper(CommandSender sender) {
        sender.sendMessage(getWarnPrefix() + "/청소 도움말" + ChatColor.GRAY + " : 사용 가능한 명령어를 확인할 수 있습니다.");
    }

    public static void commandList(CommandSender sender) {
        sender.sendMessage(getWarnPrefix() + "청소 명령어 목록");
        sender.sendMessage("　　　① /청소 채팅창");
        sender.sendMessage(ChatColor.GRAY + "　　　　　: 채팅창을 청소합니다.");
        sender.sendMessage("　　　② /청소 몬스터");
        sender.sendMessage(ChatColor.GRAY + "　　　　　: 몬스터를 제거합니다. (OP 플레이어만 가능합니다.)");
        sender.sendMessage("　　　③ /청소 동물");
        sender.sendMessage(ChatColor.GRAY + "　　　　　: 동물을 제거합니다. (OP 플레이어만 가능합니다.)");
        sender.sendMessage("　　　④ /청소 아이템");
        sender.sendMessage(ChatColor.GRAY + "　　　　　: 바닥에 떨어진 아이템을 제거합니다.");
        sender.sendMessage("　　　⑤ /청소 화살");
        sender.sendMessage(ChatColor.GRAY + "　　　　　: 화살을 제거합니다.");
        sender.sendMessage("　　　⑥ /청소 경험치");
        sender.sendMessage(ChatColor.GRAY + "　　　　　: 경험치 공을 제거합니다.");
        sender.sendMessage("　　　⑦ /청소 주민");
        sender.sendMessage(ChatColor.GRAY + "　　　　　: 주민을 제거합니다. (OP 플레이어만 가능합니다.)");
        sender.sendMessage("　　　⑧ /청소 도움말");
        sender.sendMessage(ChatColor.GRAY + "　　　　　: 사용 가능한 명령어를 확인할 수 있습니다.");
    }
}
