package day32_Constructors.restaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {

    Restaurant restaurant = new Restaurant("HK","Washington",5);

    Server[] servers = {
                new Server("Aaa", 111, 20.5, true),
                new Server("Bbb", 222, 18.5, false),
                new Server("Ccc", 333, 22, true),
                new Server("Ddd", 444, 19, false)
    };

    Chef[] chefs = {
                new Chef("Eee", 111, 30.5, true),
                new Chef("Fff", 222, 27.5, false),
                new Chef("Ggg", 333, 33, true)
    };

        restaurant.hireServers(servers);
        restaurant.hireChefs(chefs);



        System.out.println(restaurant);

    }
}

/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	  Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	              Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */