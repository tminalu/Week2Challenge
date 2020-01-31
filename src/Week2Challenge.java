import java.util.ArrayList;

public class Week2Challenge {
    public static void main(String[] args){

        //variables
        int counter = 1;
        int ingCounter = 0;

        //do while loop that continues until the counter variable equals 25
        do {
            //Burrito array
            ArrayList<String> burrito = new ArrayList<>();

            //Call riceChoice method. The returned value is added to the Burrito array
            burrito.add(riceChoice());

            //Call meatChoice method. The returned value is added to the Burrito array
            burrito.add(meatChoice());

            //Call beanChoice method. The returned value is added to the Burrito array
            burrito.add(beanChoice());

            //Call salsaChoice method. The returned value is added to the Burrito array
            burrito.add(salsaChoice());

            //Call veggieChoice method. The returned value is added to the Burrito array
            burrito.add(veggieChoice());

            //Call cheeseChoice method. The returned value is added to the Burrito array
            burrito.add(cheeseChoice());

            //Call guacChoice method. The returned value is added to the Burrito array
            burrito.add(guacChoice());

            //Call quesoChoice Method. The returned value is added to the Burrito array
            burrito.add(quesoChoice());

            //Call sourCreamChoice Method. The returned value is added to the Burrito array
            burrito.add(sourCreamChoice());

            //Loop runs through the Burrito array. Displaying the contents
            System.out.print("Burrito " + counter + ": ");
            for(int i = 0; i < burrito.size(); i++){

                /*If the content of the current index contains "all"
                  or does NOT contain "no"
                  then the ingCounter will be increased by a certain amount
                  to reflect the total added ingredients
                 */
                if(burrito.get(i).contains("all")){
                    ingCounter += 3;
                }else if(!burrito.get(i).contains("no")){
                    ingCounter++;
                }

                //If statement for whether or not to include commas between indexes
                if(i < (burrito.size()-1)){
                    System.out.print(burrito.get(i) + ", ");

                }else{
                    System.out.print(burrito.get(i));
                }
            }
            //Call cost method.
            cost(counter, ingCounter);

            //Empty println for spacing between burritos
            System.out.println();

            //Burrito array is cleared before next loop
            burrito.clear();

            //Reset ingCounter to zero before next loop
            ingCounter = 0;

            //Increment counter to keep track of total loops
            counter++;

        }while(counter <= 25);

    }
    /*
      cost Method
      Displays the price of the burrito.
      This adjusts based on the ingCounter determined
      in the for loop
    */
    private static void cost(int count, int ingred){
        System.out.println("\nBurrito " + count + " costs: $" + (3 +(.50*ingred)) + "0");
    }

    //riceChoice Method
    private static String riceChoice(){
        //Rice array
        ArrayList<String> rice = new ArrayList<>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");
            /*
            Rice random number generator.
            Whatever index is chosen the value is returned
            */
        return rice.get((int) (Math.random()* rice.size()));
    }

    //meatChoice Method
    private static String meatChoice(){
        //Meat array
        ArrayList<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("no meat");
            /*
            Meat random number generator.
            Whatever index is chosen the value is returned
            */
        return meat.get((int) (Math.random()* meat.size()));
    }

    //beanChoice Method
    private static String beanChoice(){
        //Beans array
        ArrayList<String> beans = new ArrayList<>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");
            /*
            Beans random number generator.
            Whatever index is chosen the value is returned
            */
        return beans.get((int) (Math.random()* beans.size()));
    }

    //salsaChoice method
    private static String salsaChoice(){
        //Salsa Array
        ArrayList<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("all salsa options");
            /*
            Salsa random number generator.
            Whatever index is chosen the value is returned
            */
        return salsa.get((int) (Math.random()* salsa.size()));
    }

    //veggieChoice Method
    private static String veggieChoice(){
        //Veggies Array
        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("diced tomato");
        veggies.add("no veggies");
        veggies.add("all veggie options");
            /*
            Veggie random number generator.
            Whatever index is chosen the value is returned
            */
        return veggies.get((int) (Math.random()* veggies.size()));
    }

    //cheeseChoice Method
    private static String cheeseChoice(){
        //Cheese Array
        ArrayList<String> cheese = new ArrayList<>();
        cheese.add("cheese");
        cheese.add("no cheese");
            /*
            Cheese random number generator.
            Whatever index is chosen the value is returned
            */
        return cheese.get((int) (Math.random()* cheese.size()));
    }

    //guacChoice Method
    private static String guacChoice(){
        //Guac Array
        ArrayList<String> guac = new ArrayList<>();
        guac.add("guac");
        guac.add("no guac");
            /*
            Guac random number generator.
            Whatever index is chosen the value is returned
            */
        return guac.get((int) (Math.random()* guac.size()));
    }

    //quesoChoice Method
    private static String quesoChoice(){
        //Queso Array
        ArrayList<String> queso = new ArrayList<>();
        queso.add("queso");
        queso.add("no queso");
            /*
            Queso random number generator.
            Whatever index is chosen the value is returned
            */
        return queso.get((int) (Math.random()* queso.size()));
    }

    //sourCreamChoice Method
    private static String sourCreamChoice(){
        //Sour Cream Array
        ArrayList<String> sourCream = new ArrayList<>();
        sourCream.add("sour cream");
        sourCream.add("no sour cream");
            /*
            Sour Cream random number generator.
            Whatever index is chosen the value is returned
            */
        return sourCream.get((int) (Math.random()* sourCream.size()));
    }

}