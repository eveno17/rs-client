package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class ModelData0 {
   @ObfuscatedName("ha")
   static int field1785;

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1264128253"
   )
   public static boolean method3069(int var0) {
      return (var0 >> 28 & 1) != 0;
   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1738289394"
   )
   static final void method3068(int var0) {
      if(var0 >= 0) {
         int var1 = Client.menuArguments1[var0];
         int var2 = Client.menuArguments2[var0];
         int var3 = Client.menuOpcodes[var0];
         int var4 = Client.menuIdentifiers[var0];
         String var5 = Client.menuActions[var0];
         String var6 = Client.menuTargets[var0];
         InvDefinition.method4339(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, 2035743327);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Lbo;",
      garbageValue = "0"
   )
   static World method3067() {
      World.World_listCount = 0;
      return AbstractByteArrayCopier.method3875();
   }
}
