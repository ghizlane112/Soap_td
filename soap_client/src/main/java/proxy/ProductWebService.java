
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ProductWebService", targetNamespace = "http://webservice.example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductWebService {


    /**
     * 
     * @param code
     * @return
     *     returns java.util.List<proxy.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getproductList", targetNamespace = "http://webservice.example.org/", className = "proxy.GetproductList")
    @ResponseWrapper(localName = "getproductListResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.GetproductListResponse")
    @Action(input = "http://webservice.example.org/ProductWebService/getproductListRequest", output = "http://webservice.example.org/ProductWebService/getproductListResponse")
    public List<Product> getproductList(
        @WebParam(name = "code", targetNamespace = "")
        Integer code);

    /**
     * 
     * @param code
     */
    @WebMethod(operationName = "DeleteProduct")
    @RequestWrapper(localName = "DeleteProduct", targetNamespace = "http://webservice.example.org/", className = "proxy.DeleteProduct")
    @ResponseWrapper(localName = "DeleteProductResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.DeleteProductResponse")
    @Action(input = "http://webservice.example.org/ProductWebService/DeleteProductRequest", output = "http://webservice.example.org/ProductWebService/DeleteProductResponse")
    public void deleteProduct(
        @WebParam(name = "code", targetNamespace = "")
        Integer code);

    /**
     * 
     * @param price
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sellingPrice", targetNamespace = "http://webservice.example.org/", className = "proxy.SellingPrice")
    @ResponseWrapper(localName = "sellingPriceResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.SellingPriceResponse")
    @Action(input = "http://webservice.example.org/ProductWebService/sellingPriceRequest", output = "http://webservice.example.org/ProductWebService/sellingPriceResponse")
    public Double sellingPrice(
        @WebParam(name = "Price", targetNamespace = "")
        Double price);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "productList", targetNamespace = "http://webservice.example.org/", className = "proxy.ProductList")
    @ResponseWrapper(localName = "productListResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.ProductListResponse")
    @Action(input = "http://webservice.example.org/ProductWebService/productListRequest", output = "http://webservice.example.org/ProductWebService/productListResponse")
    public List<Product> productList();

    /**
     * 
     * @param product
     */
    @WebMethod(operationName = "EditProduct")
    @RequestWrapper(localName = "EditProduct", targetNamespace = "http://webservice.example.org/", className = "proxy.EditProduct")
    @ResponseWrapper(localName = "EditProductResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.EditProductResponse")
    @Action(input = "http://webservice.example.org/ProductWebService/EditProductRequest", output = "http://webservice.example.org/ProductWebService/EditProductResponse")
    public void editProduct(
        @WebParam(name = "product", targetNamespace = "")
        Product product);

    /**
     * 
     * @param product
     */
    @WebMethod
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://webservice.example.org/", className = "proxy.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.AddProductResponse")
    @Action(input = "http://webservice.example.org/ProductWebService/addProductRequest", output = "http://webservice.example.org/ProductWebService/addProductResponse")
    public void addProduct(
        @WebParam(name = "product", targetNamespace = "")
        Product product);

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://webservice.example.org/", className = "proxy.GetProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.GetProductResponse")
    @Action(input = "http://webservice.example.org/ProductWebService/getProductRequest", output = "http://webservice.example.org/ProductWebService/getProductResponse")
    public Product getProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
