package business.concretes;

import JLogger.JLoggerManager;
import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;
    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;
        }
        this.productDao.add(product);
        loggerService.logToSystem("sSisteme loglandı : "+ product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

}
