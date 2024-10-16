package com.xworkz.collections.runner;

import com.xworkz.collections.dto.ProductDTO;
import sun.applet.AppletResourceLoader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class ProductdtoRunner {


    public static void main(String[] args) {


        ProductDTO productDTO = new ProductDTO(1,"Clothes","nike",232.3);
        ProductDTO productDTO1 = new ProductDTO(2,"Shoes","puma",32423.3);
        ProductDTO productDTO2 = new ProductDTO(5,"Lock And Key","hoshi",3654.4);
        ProductDTO productDTO3 = new ProductDTO(7,"Apples","fruites",7654);
        ProductDTO productDTO4 = new ProductDTO(9,"T-Shirt","H&M",254);
        ProductDTO productDTO5 = new ProductDTO(57,"Socks","Adidas",23567.3);
        ProductDTO productDTO6 = new ProductDTO(64,"Lipstick","Nyka",63);
        ProductDTO productDTO7 = new ProductDTO(24,"Bag","Myntra",1000.4);
        ProductDTO productDTO8 = new ProductDTO(13,"Mobile Phone","snapdeal",900);
        ProductDTO productDTO9 = new ProductDTO(10,"Watches","ajio",850.4);

        System.out.println(productDTO1);

        Collection<ProductDTO> collection = new ArrayList<ProductDTO>();

        collection.add(productDTO);
        collection.add(productDTO1);
        collection.add(productDTO2);
        collection.add(productDTO3);
        collection.add(productDTO4);
        collection.add(productDTO5);
        collection.add(productDTO6);
        collection.add(productDTO7);
        collection.add(productDTO8);
        collection.add(productDTO9);



        //normal data
        collection.stream()
                .forEach(ref-> System.out.println(ref));

        System.out.println("111111111111111111111111111111");
        //1. Collect product cost greater than 5000
        collection.stream()
                .filter(ref1->ref1.getCost()>5000)
                .forEach(ref-> System.out.println(ref));
        System.out.println("22222222222222222222222222222222222222");

       // 2. Collect product cost greater than 5000 & less than 30000

        collection.stream().filter(ref->ref.getCost()>2000 && ref.getCost()<10000)
                .forEach(ref-> System.out.println(ref));

        System.out.println("3333333333333333333333333");
        //3. Collect product sort in desc by cost
        System.out.println("decending order on bases of cost".toUpperCase());
        collection.stream()
                .sorted((ref1,ref2)->Double.compare(ref2.getCost(),ref1.getCost()))
                .forEach(ref-> System.out.println(ref));

        System.out.println("4444444444444444444444444444444444444444");
// Collect product where vendor names starts with A and sort by asc by name
        collection.stream()
                .sorted().filter(ref->ref.getVendor().startsWith("A"))
                        .forEach(ref-> System.out.println(ref)); //Vendor

        System.out.println("5555555555555555555555");
        //5. Collect product sort by cost & id
        collection.stream()
                .sorted((ref,ref1)->Double.compare(ref1.getCost(),ref.getCost()));

        //5a. sort by id
        collection.stream().sorted(Comparator.comparingInt(ProductDTO:: getId))
                .forEach(ref-> System.out.println(ref));

        System.out.println("6666666666666666666666666666666666");
//        6. Collect only names from product

        collection.stream()
                .map(ProductDTO:: getName)
                .forEach(ref-> System.out.println(ref));

        System.out.println("***********************************");

        System.out.println("77777777777777777777777777777777");
        //7. Collect only id from product using map and normal method
        collection.stream().map(ProductDTO::getId).forEach(ref-> System.out.println(ref));
        System.out.println("7777777777 second approach");
        collection.stream()
                .forEach(ref-> System.out.println(ref.getId()));
        System.out.println("888888888888888888888888888");

        //8. collect product by converting name to uppercase
        collection.stream()
                .forEach(ref-> ref.getName().toUpperCase());
        //using map method
        collection.stream().map(ProductDTO::getName)
                        .forEach(ref-> System.out.println(ref.toUpperCase()));
        System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((");


    }
}
