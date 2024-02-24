class SwitchStatement{
    public static void main(String args[]){
        int number=2;
        switch (number) { /* switch expressions can be : int , char , enum , byte , short , 
            it is a type of decision statement , case and switch should have same data type , 
            case shouldnt be duplicate */ 
            case 1 :
                System.out.println("You chose 1");
                break;
            case 2 :
                System.out.println("You chose 2");
                break;
            case 3 :
                System.out.println("You chose 3");
                break;
            case 4 :
                System.out.println("You chose 4");
                break;

            default:
                System.out.println("Your number is = "+ number);
        }
    }
}