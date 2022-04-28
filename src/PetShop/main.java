package PetShop;

public class main {
    public static void main(String[] args) {

        bird bird1=new bird(5,"Yellow","Mavis");

        bird [] birds={bird1};

        for (bird bird:birds) {
            System.out.println(bird.birdName);
            System.out.println(bird.birdAge);
            System.out.println(bird.birdColor);
        }
        cat cat1= new cat(3,"Minnak","White");

        cat [] cats = {cat1};

        for (cat cat: cats) {
            System.out.println(cat.catName);
            System.out.println(cat.catColor);
            System.out.println(cat.catAge);
        }
        CatService catService = new CatService();
        catService.eat(cat1);
        catService.drink(cat1);
        catService.sleep(cat1);
        System.out.println("**********************************");
        BirdService birdService=new BirdService();
        birdService.eat(bird1);
        birdService.drink(bird1);
    }

}
