import java.util.ArrayList;

public class Special extends Machine {

   private ArrayList<Product> ingredientsSold; //list of ingredients sold
   //NOT SURE
   public Special() {
      super();
      ingredientsSold = new ArrayList<Product>();
   }

   //Generate Combo based on inputted ingredients
   public Combo generateCombo(ArrayList<Product> ingredients) {
      return new Combo(ingredients);
   }
   // Customize the preparation process for Combo
   public String preparingCombo(Combo combo) {

      StringBuilder preparationSteps = new StringBuilder();
      // ALWAYS PRINT, EACH COMBO MUST HAVE YOGURT
      preparationSteps.append("Preparing Cup...\n");
      preparationSteps.append("Dispensing Yogurt...\n");

      //ArrayList<Product> comboIngredients = combo.getIngredients();

      preparationSteps.append("Topping with ").append(combo.getName().substring(12)).append("...\n");
      preparationSteps.append("Serving ").append(combo.getName()).append("...\n");
      preparationSteps.append("Order Complete!");

      return preparationSteps.toString();
   }

  //Ovveride Machine generateTransaction
  //Generate Transaction (AFTER SUCESSFUL TRANSACTION)
  public Transaction generateTransaction(int payment, Combo combo, int change) {
      //Convert Combo to Product 
      Product product = new Product(combo.getName(), combo.getPrice(),combo.getCalories());
      Transaction transaction = new Transaction(payment, product, change); //create transaction
      transactionList.add(transaction); //add to list
      return transaction;
   }

   //SVM Exclusive: List of all ingredients sold for combo
   public ArrayList<Product> updateIngredientsSold(Combo combo) {
      ArrayList<Product> ingredients = combo.getIngredients();
      for (Product ingredient : ingredients) {
         ingredientsSold.add(ingredient);
      }
      return ingredientsSold;
   }

   public void clearIngredientsSold() {
      ingredientsSold.clear();
   }

   //Ovveride Sales Report: 
   //Sales Report, print quantity of each product sold
   public ArrayList<String> salesReport() {
      ArrayList<String> salesReport = new ArrayList<>(); 
      for (Slot slot : slotList)//loop through all slots
      { 
         Product product = slot.getProduct(); //get product in slot
         int quantitySold = 0;
         //SVM Exclusive: 
         //Count quantity of each product sold (ingredients sold for combo)
         for (Product ingredient : ingredientsSold) {
            if (product.getName().equals(ingredient.getName())) {
               quantitySold++;
            }
         }
         salesReport.add(product.getName() + " x " + quantitySold); //add to sales report
      }
      return salesReport;
   }
}