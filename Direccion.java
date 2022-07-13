public class Direccion {
   private String casa, calle, barrio, ciudad, d;
   private Familia fam;

   public Direccion(String casa, String calle, String barrio, String ciudad, Familia fam) {
      this.casa = casa;
      this.calle = calle;
      this.barrio = barrio;
      this.ciudad = ciudad;
      this.fam = fam;
      d = "Casa " + casa + " calle " + calle + " " + barrio + " " + ciudad;
   }

   public String toString() {
      return String.format("%s%nDireccion %s", family, d);
   }
}