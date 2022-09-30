public class Main {
    public static void main(String[] args) {
        Flower Roza = new Flower("Роза", null,"Голландия", 39.59, 0 );
        Flower Hrizantema = new Flower("Хризантема",null, null, 15, 5);
        Flower Pion = new Flower("Пион",null, "Англия", 69.9, 1);
        Flower Gipsofila = new Flower("Гипсофила",null, "Турция", 19.5, 10);

        printInfo(Roza);
        printInfo(Hrizantema);
        printInfo(Pion);
        printInfo(Gipsofila);

        printCost(Roza, Roza, Roza, Hrizantema, Hrizantema, Hrizantema, Hrizantema, Hrizantema, Gipsofila );
    }
    public static void printInfo(Flower flower){
        System.out.println("Название:" + flower.name +" Цвет:" + flower.getFlowerColor() + " Страна:" + flower.getCountry() + " Цена:" + flower.getCost() + " Срок хранения:" + flower.lifeSpan);
    }
    public static void printCost( Flower... flowers){
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for(Flower flower : flowers){
            if(flower.lifeSpan < minimumLifeSpan){
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета " + totalCost);
        System.out.println("Срок стояния букета " + minimumLifeSpan);
    }
}