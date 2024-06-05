public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
        total = (price*quantity)*tax;
        int outOfStock = 2;
         
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;
        if (quantity > 1) {
            System.out.println(custName+" wants to purchase "+quantity+" Shirts");
        }
        if (outOfStock == 0) {
            System.out.println("Peça não disponivel no estoque");
        }
        else {
            System.out.println(total);
        }

	

        
        // Declare outOfStock variable and initialize it
        
        
        // Test quantity and modify message if quantity > 1.  
         
        
        // Test outOfStock and notify user in either case.  
        
        
        
    }
    
}


