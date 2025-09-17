package net.vertrauterdavid.combat.listener;

import net.vertrauterdavid.combat.Combat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void handle(PlayerDeathEvent event) {
        final Player player = event.getPlayer();

        if (Combat.getInstance().isInCombat(player)) {
            Combat.getInstance().getCombatPlayers().remove(player.getUniqueId());
        }
    }
}
