package org.example.client;

import proxy.EditProduct;
import proxy.Product;
import proxy.ProductWebService;
import proxy.ProductWs;


import java.util.List;

public class ClientWs {


    public static void main(String[] args) {
        ProductWebService proxy= new ProductWs().getProductWebServicePort();
        System.out.println(proxy.sellingPrice(400.00));
        System.out.println("----------------------------");

        Product product=proxy.getProduct(4);
        System.out.println(product.getName());
        System.out.println(product.getPrice());

        System.out.println("----------------------------");
        List<Product> products=proxy.productList();
        products.forEach(p ->{
            System.out.println(p.getName());
            System.out.println(p.getPrice());
            System.out.println("----");
        } );

        System.out.println("--------------------------");
        // Test de la méthode addProduct
        Product newProduct = new Product();
        newProduct.setCode(5);
        newProduct.setName("Chair");
        newProduct.setPrice(150.00);
        proxy.addProduct(newProduct);
        System.out.println("Produit ajouté : " + newProduct.getName()+" "+newProduct.getPrice());


        System.out.println("----------------------");

        newProduct.setName("ChangePro");
        newProduct.setPrice(344.00);
        proxy.editProduct(newProduct);
        System.out.println("le produit est changer "+newProduct.getName()+" "+newProduct.getPrice());
        System.out.println("------------------------");
        proxy.deleteProduct(2);
        System.out.println("le produit est supprimer");

    }
}
