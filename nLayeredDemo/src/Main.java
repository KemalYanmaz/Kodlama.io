import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        //ToDo Spring IoC ile iyileştirilecek.
        ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
        Product product = new Product(1,2,"Elma",1.23,300);
        productService.add(product);
    }
}
