package io.github.portlek.fakeplayer.nms.v1_16_R2;

import io.github.portlek.fakeplayer.api.FakeCreated;
import io.github.portlek.fakeplayer.api.INPC;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_16_R2.CraftWorld;
import org.jetbrains.annotations.NotNull;

public final class FakeCreated1_16_R2 implements FakeCreated {

  @NotNull
  @Override
  public INPC create(@NotNull final String name, @NotNull final String tabname, @NotNull final World world) {
    return new NPC(
      Bukkit.getServer().getOfflinePlayer(name).getUniqueId(),
      name,
      tabname,
      (CraftWorld) world);
  }
}
