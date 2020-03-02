import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InvoiceTest_1 {
                            private Map<String, Comparator<? super Invoice>> sortingOptions = new HashMap<>();
private String sortBy;  //sorting attribute selected by user
private List<Invoice> list;

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice(83, "Electric sander", 7, 57.98D);
		Invoice invoice2 = new Invoice(24, "Power saw", 18, 99.99);
		Invoice invoice3 = new Invoice(7, "Sledge hammer", 11, 21.50);
		Invoice invoice4 = new Invoice(77, "Hammer", 76, 11.99);
		Invoice invoice5 = new Invoice(39, "Lawn mower", 3, 79.50);
		Invoice invoice6 = new Invoice(68, "Screwdriver", 106, 6.99);
		Invoice invoice7 = new Invoice(56, "Jig saw", 21, 11.00);
		Invoice invoice8 = new Invoice(3, "Wrench", 34, 7.50);
		List<Invoice> list = new ArrayList<>();
		list.add(invoice1);
		list.add(invoice2);
		list.add(invoice3);
		list.add(invoice4);
		list.add(invoice5);
		list.add(invoice6);
		list.add(invoice7);
		list.add(invoice8);
		invoice8.getPrice();

		/*System.out.println(" Sorted by part description");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getPartDescription() ))
		.forEach(System.out::println);*/
		
		/*System.out.println("\n Sorted by part price");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getPrice() ))
		.forEach(System.out::println);*/
		
		/*System.out.println("\n Sorted by quantity");
		System.out.printf("%15s %5s %n","desc", "price");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getQuantity()))
		.map(invoice -> String.format("%15s %5d", invoice.getPartDescription(), invoice.getQuantity()))
		.forEach(System.out::println);*/
		
		/*System.out.println("\n Sorted by value");
		System.out.printf("%15s %5s %n","desc", "value");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getQuantity()*invoice.getPrice()))
		.map(invoice -> String.format("%15s %5f", invoice.getPartDescription(), invoice.getQuantity()*invoice.getPrice()))
		.forEach(System.out::println);*/
		
		/*System.out.println("\n Sorted by value, between $200 and $500");
		System.out.printf("%15s %5s %n","desc", "value");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getQuantity()*invoice.getPrice()))
		.filter(invoice ->
			invoice.getQuantity()*invoice.getPrice() >= 200 && 
			invoice.getQuantity()*invoice.getPrice() <= 500)
		.map(invoice -> String.format("%15s %5f", invoice.getPartDescription(), invoice.getQuantity()*invoice.getPrice()))
		.forEach(System.out::println);*/
                
                /*list.stream()
                      .filter(invoice -> invoice.getPartDescription().contentEquals("saw"))
                      .map(invoice -> String.format("%15s %5f",invoice.getPartDescription(), invoice.getPartNumber(), invoice.getPrice()))
                        .forEach(System.out::println);*/
                  
                System.out.println("Enter which column you want to sort");
                Scanner sc = new Scanner(System.in);
                String sor = sc.nextLine();
                
//list = Invoice.getList();
      
		InvoiceTest_1 ec = new InvoiceTest_1();

/*list.stream()
       .sorted(ec.sortingOptions.get(sor))
      		.forEach(System.out::println);*/
if(sor == "1"){
    list.stream()
      .sorted(Comparator.comparing(invoice ->invoice.getPartDescription()))
      .forEach(System.out::println);
}


      
list.sort(ec.sortingOptions.get(sor));
  

	}
        public void init(){
            
            sortingOptions.put("1", Comparator.comparing(Invoice::getPartDescription));
    sortingOptions.put("2", Comparator.comparing(Invoice::getPrice));
    sortingOptions.put("3", Comparator.comparing(Invoice::getQuantity));
        list.sort(sortingOptions.get(sortBy));

        }
}

