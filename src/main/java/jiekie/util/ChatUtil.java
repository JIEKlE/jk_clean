package jiekie.util;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatUtil {
    public static String getWarnPrefix() {
        return "[ " + ChatColor.YELLOW + "❗" + ChatColor.WHITE + " ] ";
    }

    public static void notPlayer(CommandSender sender) {
        sender.sendMessage(getWarnPrefix() + "플레이어가 아닙니다.");
    }

    public static void notOp(Player player) {
        player.sendMessage(getWarnPrefix() + "권한이 없습니다.");
    }

    public static String wrongCommand() {
        return getWarnPrefix() + "명령어 사용법이 잘못되었습니다.";
    }

    public static void cleanChat(Player player) {
        player.sendMessage(getWarnPrefix() + "채팅창을 청소했습니다.");
    }
    
    public static void killMonsters(Player player) {
        player.sendMessage(getWarnPrefix() + "몬스터를 제거했습니다.");
    }

    public static void killAnimals(Player player) {
        player.sendMessage(getWarnPrefix() + "동물을 제거했습니다.");
    }

    public static void killItems(Player player) {
        player.sendMessage(getWarnPrefix() + "바닥에 떨어진 아이템을 제거했습니다.");
    }

    public static void killArrows(Player player) {
        player.sendMessage(getWarnPrefix() + "화살을 제거했습니다.");
    }

    public static void killExperienceOrbs(Player player) {
        player.sendMessage(getWarnPrefix() + "경험치 공을 제거했습니다.");
    }

    public static void killVillagers(Player player) {
        player.sendMessage(getWarnPrefix() + "주민을 제거했습니다.");
    }

    public static void commandHelper(Player player) {
        player.sendMessage(getWarnPrefix() + "/청소 도움말" + ChatColor.GRAY + " : 사용 가능한 명령어를 확인할 수 있습니다.");
    }

    public static void commandList(Player player) {
        player.sendMessage(getWarnPrefix() + "청소 명령어 목록");
        player.sendMessage("　　　① /청소 채팅창");
        player.sendMessage(ChatColor.GRAY + "　　　　　: 채팅창을 청소합니다.");
        player.sendMessage("　　　② /청소 몬스터");
        player.sendMessage(ChatColor.GRAY + "　　　　　: 몬스터를 제거합니다.");
        player.sendMessage("　　　③ /청소 동물");
        player.sendMessage(ChatColor.GRAY + "　　　　　: 동물을 제거합니다.");
        player.sendMessage("　　　④ /청소 아이템");
        player.sendMessage(ChatColor.GRAY + "　　　　　: 바닥에 떨어진 아이템을 제거합니다.");
        player.sendMessage("　　　⑤ /청소 화살");
        player.sendMessage(ChatColor.GRAY + "　　　　　: 화살을 제거합니다.");
        player.sendMessage("　　　⑥ /청소 경험치");
        player.sendMessage(ChatColor.GRAY + "　　　　　: 경험치 공을 제거합니다.");
        player.sendMessage("　　　⑦ /청소 주민");
        player.sendMessage(ChatColor.GRAY + "　　　　　: 주민을 제거합니다.");
        player.sendMessage("　　　⑧ /청소 도움말");
        player.sendMessage(ChatColor.GRAY + "　　　　　: 사용 가능한 명령어를 확인할 수 있습니다.");
    }
}
