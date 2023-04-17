public class Reservation {
    int guestCount; // contagem de convidados
    int restaurantCapacity; // capacidade de pessoas
    boolean isRestaurantOpen; // está aberto?
    boolean isConfirmed; // está confirmado?


    public Reservation(int count, int capacity, boolean open){
    guestCount = count;
    restaurantCapacity = capacity;
    isRestaurantOpen = open;
    if(count<1||count > 8){
    System.out.println("Invalid reservation!");
    }
}



    public void confirmReservation(){
    if(restaurantCapacity >= guestCount && isRestaurantOpen == true){
    
    System.out.println("Reservation confirm");
    
    isConfirmed = true;
    }else {
    System.out.println("Não confirmou");
    }
    }



    public void informUser(){
    if(!isConfirmed){
    System.out.println("Unable to confirm reservation, pleace contact restaurant");
    }else{
    System.out.println("pleace enjoy your meal");
    }
    }


    public static void main(String[] args){
    Reservation partyOfThree = new Reservation (3, 12, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    }

    
    }
