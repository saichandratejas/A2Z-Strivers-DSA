class Continue {
    public static void main(String args[]){
        
        for( int i=0; i<=10 ; i++){
            if(i==5){
                continue;
            }
            System.out.println("The value of i = " + i);
        }

        // for( int i=0; i<=10 ; i++){
        //     if(i==5){
        //         break;
        //     }
        //     System.out.println("The value of i = " + i);
        // }
    }
}
