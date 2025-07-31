package com.example;

import java.util.List;
import java.util.Scanner;
import com.example.util.HibernateUtil;
import com.example.dao.ItemDao;
import com.example.model.Item;

public class Main {
    private static ItemDao itemDao = new ItemDao();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println("\nHIBERNATE:");
            System.out.println("1. Add");
            System.out.println("2. View All");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Get by ID");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    viewAllItems();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    getItemById();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        
        HibernateUtil.shutdown();
        System.out.println("Application exited.");
    }

    private static void addItem() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        
        Item item = new Item(name, price);
        itemDao.saveItem(item);
        System.out.println("Item added");
    }

    private static void viewAllItems() {
        List<Item> items = itemDao.getAllItems();
        if (items.isEmpty()) {
            System.out.println("No items found");
        } else {
            System.out.println("Items:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    private static void updateItem() {
        System.out.print("Enter item ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Item item = itemDao.getItemById(id);
        if (item == null) {
            System.out.println("Item not found");
            return;
        }
        
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter new price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        
        item.setName(name);
        item.setPrice(price);
        itemDao.updateItem(item);
        System.out.println("Item updated");
    }

    private static void deleteItem() {
        System.out.print("Enter item ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Item item = itemDao.getItemById(id);
        if (item == null) {
            System.out.println("Item not found");
            return;
        }
        
        itemDao.deleteItem(id);
        System.out.println("Item deleted");
    }

    private static void getItemById() {
        System.out.print("Enter item ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Item item = itemDao.getItemById(id);
        if (item == null) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item details: " + item);
        }
    }
}




/*
HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 1
Enter name: pen
Enter price: 5
log4j:WARN No appenders could be found for logger (org.jboss.logging).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
Hibernate: create table items (id integer not null auto_increment, name varchar(255) not null, price double precision not null, primary key (id)) engine=InnoDB
Hibernate: insert into items (name, price) values (?, ?)
Item added

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: select item0_.id as id1_0_, item0_.name as name2_0_, item0_.price as price3_0_ from items item0_
Items:
Item [id=1, name=pen, price=5.0]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 1
Enter name: pencil
Enter price: 3
Hibernate: insert into items (name, price) values (?, ?)
Item added

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 3
Enter item ID to update: 2
Hibernate: select item0_.id as id1_0_0_, item0_.name as name2_0_0_, item0_.price as price3_0_0_ from items item0_ where item0_.id=?
Enter new name: book
Enter new price: 50
Hibernate: update items set name=?, price=? where id=?
Item updated

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: select item0_.id as id1_0_, item0_.name as name2_0_, item0_.price as price3_0_ from items item0_
Items:
Item [id=1, name=pen, price=5.0]
Item [id=2, name=book, price=50.0]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 0
Application exited.
*/