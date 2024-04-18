package poker;

import java.math.BigDecimal;

public enum Rank {
   ONE(1), //
   TWO(2), //
   THREE(3), //
   FOUR(4), //
   FIVE(5), //
   SIX(6), //
   SEVEN(7), //
   EIGHT(8), //
   NINE(9), //
   TEN(10), //
   ELEVEN(11), //
   TWLVE(12), //
   THIRTEEN(13); //


   private int value;

   private Rank(int value) {
      this.value = value;
   }

   public void setValue(int value) {
      this.value = value;
   }

   public int getRankValue() {
      return this.value;
   }

   public static boolean isPlayable(Rank rank1, Rank rank2) {
      return rank1.value > rank2.value;

   }

   public boolean isPlayable(Rank rank) {
      return this.value > rank.value;
   }

   public static void main(String[] args) {

   }
}
