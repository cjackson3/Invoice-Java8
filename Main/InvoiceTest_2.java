import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class InvoiceTest_2 {
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

        Scanner sc = new Scanner(System.in);
                System.out.println("Enter which column you want to sort");
                String sor = sc.nextLine();
                System.out.println("Enter which way you want the list sorted");
                String sor2 = sc.nextLine();
                if (sor2.equals("desceding")){
        if (null != sor) switch (sor) {
                case "price":
                    list.stream()
                            .sorted(Comparator.comparing(invoice ->invoice.getPrice() ))
                            .forEach(System.out::println);
                    break;
                case "description":
                    list.stream()
                            .sorted(Comparator.comparing(invoice ->invoice.getPartDescription() ))
                            .forEach(System.out::println);
                    break;
                case "quantity":
                    list.stream()
                            .sorted(Comparator.comparing(invoice ->invoice.getQuantity() ))
                            .forEach(System.out::println);
                    break;
                case "number":
                    list.stream()
                            .sorted(Comparator.comparing(invoice ->invoice.getPartNumber() ))
                            .forEach(System.out::println);
                    break;
                default:
                    break;
            }
                
	}
                else{
                        if (null != sor) switch (sor) {
                case "price":
                    list.stream()
                            .sorted(Comparator.comparing(invoice ->invoice.getPrice() ))
                            .forEach(System.out::println);
                    break;
                case "description":
                    list.stream()
                            .sorted(Comparator.comparing(invoice ->invoice.getPartDescription() ))
                            .forEach(System.out::println);
                    break;
                case "quantity":
                    list.stream()
                            .sorted(Comparator.comparing(invoice ->invoice.getQuantity() ))
                            .forEach(System.out::println);
                    break;
                case "number":
                    list.stream()
                            .sorted(Comparator.comparing(invoice ->invoice.getPartNumber() ))
                            .forEach(System.out::println);
                
                    break;
                default:
                    break;
                }
}
}
}

