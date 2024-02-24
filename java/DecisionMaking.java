// Decision Making 
//simple if
//if-else
//if else if ladder
//nested if 
// loop statements
//for
//for each
//while
//do-while
// jump statements
//break
//continue

class DecisionMaking{
    public static void main(String args[]){
        String address="Delhi,India";
        if(address.endsWith("India")){
            if(address.contains("Agra")){
                System.out.println("You are in city Agra");
            }
            else if(address.contains("Noida")){
                System.out.println("You are in city Noida");
            }
            else{
                System.out.println(address.split(",")[0]);
            }
        }
        else{
            System.out.println("You are not living in India");
        }
    }
}
