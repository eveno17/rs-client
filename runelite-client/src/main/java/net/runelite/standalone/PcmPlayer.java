package net.runelite.standalone;

import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class PcmPlayer {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lcf;"
   )
   static PcmPlayerProvider pcmPlayerProvider;
   @ObfuscatedName("p")
   public static boolean PcmPlayer_stereo;
   @ObfuscatedName("m")
   static ScheduledExecutorService soundSystemExecutor;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = 2578589966919390689L
   )
   long field1593;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      longValue = -9085441602565192727L
   )
   long timeMs;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 529397433
   )
   int field1588;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1375539879
   )
   int field1591;
   @ObfuscatedName("a")
   protected int[] samples;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "[Ldc;"
   )
   PcmStream[] field1600;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1371288149
   )
   int field1599;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "[Ldc;"
   )
   PcmStream[] field1601;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -236130375
   )
   int field1596;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldc;"
   )
   PcmStream stream;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -709133773
   )
   int field1583;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 937182747
   )
   int capacity;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -383494247
   )
   int field1592;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1808057975
   )
   int field1597;
   @ObfuscatedName("k")
   boolean field1594;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = -2782522933298206297L
   )
   long field1582;

   protected PcmPlayer() {
      this.field1588 = 32;
      this.timeMs = class33.method680();
      this.field1593 = 0L;
      this.field1583 = 0;
      this.field1597 = 0;
      this.field1596 = 0;
      this.field1582 = 0L;
      this.field1594 = true;
      this.field1599 = 0;
      this.field1600 = new PcmStream[8];
      this.field1601 = new PcmStream[8];
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "2148"
   )
   protected void vmethod2712(int var1) throws Exception {
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1875138754"
   )
   protected void vmethod2715() throws Exception {
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "90832052"
   )
   protected void vmethod2725() {
   }

   @ObfuscatedName("u")
   protected void vmethod2704() throws Exception {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   protected int vmethod2735() throws Exception {
      return this.capacity;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "8"
   )
   protected void vmethod2711() throws Exception {
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "17"
   )
   public final synchronized void method2755() {
      if(this.samples != null) {
         long var1 = class33.method680();

         try {
            if(this.field1593 != 0L) {
               if(var1 < this.field1593) {
                  return;
               }

               this.vmethod2712(this.capacity);
               this.field1593 = 0L;
               this.field1594 = true;
            }

            int var3 = this.vmethod2735();
            if(this.field1596 - var3 > this.field1583) {
               this.field1583 = this.field1596 - var3;
            }

            int var4 = this.field1591 + this.field1592;
            if(var4 + 256 > 16384) {
               var4 = 16128;
            }

            if(var4 + 256 > this.capacity) {
               this.capacity += 1024;
               if(this.capacity > 16384) {
                  this.capacity = 16384;
               }

               this.vmethod2725();
               this.vmethod2712(this.capacity);
               var3 = 0;
               this.field1594 = true;
               if(var4 + 256 > this.capacity) {
                  var4 = this.capacity - 256;
                  this.field1592 = var4 - this.field1591;
               }
            }

            while(var3 < var4) {
               this.method2744(this.samples, 256);
               this.vmethod2704();
               var3 += 256;
            }

            if(var1 > this.field1582) {
               if(!this.field1594) {
                  if(this.field1583 == 0 && this.field1597 == 0) {
                     this.vmethod2725();
                     this.field1593 = var1 + 2000L;
                     return;
                  }

                  this.field1592 = Math.min(this.field1597, this.field1583);
                  this.field1597 = this.field1583;
               } else {
                  this.field1594 = false;
               }

               this.field1583 = 0;
               this.field1582 = var1 + 2000L;
            }

            this.field1596 = var3;
         } catch (Exception var7) {
            this.vmethod2725();
            this.field1593 = var1 + 2000L;
         }

         try {
            if(var1 > this.timeMs + 500000L) {
               var1 = this.timeMs;
            }

            while(var1 > this.timeMs + 5000L) {
               this.method2739(256);
               this.timeMs += (long)(256000 / UrlRequest.PcmPlayer_sampleRate);
            }
         } catch (Exception var6) {
            this.timeMs = var1;
         }

      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1026437845"
   )
   public final synchronized void method2707() {
      if(RunException.soundSystem != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if(this == RunException.soundSystem.players[var2]) {
               RunException.soundSystem.players[var2] = null;
            }

            if(RunException.soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if(var1) {
            soundSystemExecutor.shutdownNow();
            soundSystemExecutor = null;
            RunException.soundSystem = null;
         }
      }

      this.vmethod2725();
      this.samples = null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ldc;I)V",
      garbageValue = "1280132594"
   )
   public final synchronized void method2703(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Ldc;II)V",
      garbageValue = "1373941757"
   )
   final void method2710(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field1601[var3];
      if(var4 == null) {
         this.field1600[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field1601[var3] = var1;
      var1.field1325 = var2;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "580966872"
   )
   public final void method2705() {
      this.field1594 = true;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-601426802"
   )
   public final synchronized void method2708() {
      this.field1594 = true;

      try {
         this.vmethod2715();
      } catch (Exception var2) {
         this.vmethod2725();
         this.field1593 = class33.method680() + 2000L;
      }

   }

   @ObfuscatedName("as")
   final void method2744(int[] var1, int var2) {
      int var3 = var2;
      if(PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class288.method5208(var1, 0, var3);
      this.field1599 -= var2;
      if(this.stream != null && this.field1599 <= 0) {
         this.field1599 += UrlRequest.PcmPlayer_sampleRate >> 4;
         DynamicObject.method1573(this.stream);
         this.method2710(this.stream, this.stream.vmethod2542());
         int var4 = 0;
         int var5 = 255;

         int var6;
         PcmStream var10;
         label104:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  PcmStream var11 = this.field1600[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if(var11 == null) {
                           break label98;
                        }

                        AbstractSound var12 = var11.sound;
                        if(var12 != null && var12.position > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.after;
                        } else {
                           var11.active = true;
                           int var13 = var11.vmethod3787();
                           var4 += var13;
                           if(var12 != null) {
                              var12.position += var13;
                           }

                           if(var4 >= this.field1588) {
                              break label104;
                           }

                           PcmStream var14 = var11.vmethod3775();
                           if(var14 != null) {
                              for(int var15 = var11.field1325; var14 != null; var14 = var11.vmethod3794()) {
                                 this.method2710(var14, var15 * var14.vmethod2542() >> 8);
                              }
                           }

                           PcmStream var18 = var11.after;
                           var11.after = null;
                           if(var10 == null) {
                              this.field1600[var7] = var18;
                           } else {
                              var10.after = var18;
                           }

                           if(var18 == null) {
                              this.field1601[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            PcmStream var16 = this.field1600[var6];
            PcmStream[] var17 = this.field1600;
            this.field1601[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.after;
               var16.after = null;
            }
         }
      }

      if(this.field1599 < 0) {
         this.field1599 = 0;
      }

      if(this.stream != null) {
         this.stream.vmethod3777(var1, 0, var2);
      }

      this.timeMs = class33.method680();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "629535464"
   )
   final void method2739(int var1) {
      this.field1599 -= var1;
      if(this.field1599 < 0) {
         this.field1599 = 0;
      }

      if(this.stream != null) {
         this.stream.vmethod3778(var1);
      }

   }
}
