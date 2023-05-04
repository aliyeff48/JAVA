 class LaptopBase {


    final String laptopname1 = "MacBook";
    final String laptopname2 = "Lenova";
    final String laptopname3 = "HP";
    final int RAM_8GB = 8;
    final int RAM_16GB = 16;
    final int RAM_32GB = 32;

    final double PRICE_MACBOOK = 1500;

    final double PRICE_lenova = 1200;
    final double PRICE_hp = 1050;
LaptopBase(String name,int ram,double price) {
    if(name.equalsIgnoreCase(laptopname1)&&ram==RAM_8GB&&price==PRICE_MACBOOK) laptop1infos();
  else   if(name.equalsIgnoreCase(laptopname2)&&ram==RAM_16GB&&price==PRICE_lenova)laptop2infos();
    else   if(name.equalsIgnoreCase(laptopname3)&&ram==RAM_32GB&&price==PRICE_hp)laptop3infos();
    else System.out.println("Bele laptop yoxdur...");

}



public void laptop1infos(){
    System.out.println("Axtardiginiz mehsul Tapildi...");
    System.out.println("name:"+this.laptopname1+" ram:"+this.RAM_8GB+" price:"+this.PRICE_MACBOOK);
}
    public void laptop2infos(){
        System.out.println("Axtardiginiz mehsul Tapildi...");
        System.out.println("name:"+this.laptopname2+" ram:"+this.RAM_16GB+" price:"+this.PRICE_lenova);
    }
    public void laptop3infos(){
        System.out.println("Axtardiginiz mehsul Tapildi...");
        System.out.println("name:"+this.laptopname3+" ram:"+this.RAM_32GB+" price:"+this.PRICE_hp);
    }
}