package org.example.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.models.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "ProductWs")
public class ProductWebService {



   private List<Product> ProductList=new ArrayList<>();


@WebMethod(operationName = "sellingPrice")
    public Double sellingPrice(@WebParam(name="Price") Double price){
    return price*1.5;
    }

    @WebMethod
    public Product getProduct(Integer code){
       return new Product(code,"table",300.00,new Date());
    }
/*
@WebMethod
    public List<Product> productList(){
        return List.of(
        new Product(1,"table",1600.00,new Date()),
        new Product(2,"shoes",900.00,new Date()),
        new Product(3,"burger",90.00,new Date()),
        new Product(4,"pen",3.00,new Date())
        );
    }
*/


    @WebMethod
    public List<Product> getproductList(@WebParam(name = "code") Integer code){
       return (List<Product>) ProductList.stream()
               .filter(product -> product.getCode().equals(code))
               .findFirst()
               .orElse(null);
    }

    @WebMethod
    public List<Product> productList() {
        return new ArrayList<>(ProductList);
    }




    @WebMethod
    public void addProduct(@WebParam(name="product") Product product) {
        ProductList.add(product);
    }

    @WebMethod
    public void EditProduct(@WebParam(name = "product")  Product product){
    for(int i=0; i<ProductList.size();i++){
        if(ProductList.get(i).getCode().equals(product.getCode())){
          ProductList.set(i,product);
        }
    }
    }

    @WebMethod
    public void DeleteProduct(@WebParam(name = "code") Integer code){
    ProductList.removeIf(p->p.getCode().equals(code) );
    }


}
