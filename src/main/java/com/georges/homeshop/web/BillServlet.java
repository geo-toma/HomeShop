package com.georges.homeshop.web;

import com.georges.homeshop.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BillServlet extends HttpServlet {
    List<Product> products = new ArrayList<>();
    @Override
    public void init() throws ServletException {
        Product cafe = new Product(79.99, "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses","Philips HD7866/61");
        Product tv = new Television(599.46,"Smart TV LED incurvee 49/", "TV Samsung", 49,"LED");
        Fridge fridge = new Fridge(189,"Réfrigérateur BEKO 130L - Classe A+ - blanc","BEKO TSE 1042 F", 130, false);

        products.add(cafe);
        products.add(tv);
        products.add(fridge);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if (req.getQueryString() == null)
            displayForm(resp);
        else
            displayBill();
    }

    private void displayForm(HttpServletResponse resp) throws IOException {
        for (int i = 0; i < products.size(); i++){
            Product product = products.get(i);
            resp.getWriter().println("<b>"+i+" - "+product.getName()+"</b> : "+product.getPrice()+"</br>"+product.getDescrition()+"</br></br>");
        }
        String form = "<form action=\"bill\">" +

                "<b>nom complet :</b> <input name=\"fullname\"/><br/>" +

                "<b>adresse :</b> <input name=\"address\"/><br/><br/>" +

                "<b>livraison :</b> <br/>" +

                "à domicile : <input type=\"radio\" name=\"deliveryMode\" value=\"direct\"/><br/>" +

                "express : <input type=\"radio\" name=\"deliveryMode\" value=\"express\"/><br/>" +

                "point relais : <input type=\"radio\" name=\"deliveryMode\" value=\"relay\"/><br/>" +

                "à retirer : <input type=\"radio\" name=\"deliveryMode\" value=\"takeAway\"/><br/>" +

                "<b>Informations livraison</b> (relay et express) : <input name=\"deliveryInfo\"/><br/><br/>" +

                "<b>liste produits </b> (produit:quantité, un produit par ligne) : <br/>" +

                "<textarea name=\"products\"></textarea><br/>" +

                "<input type=\"submit\"/>" +

                "</form>";

        resp.getWriter().println(form);
    }

    private void displayBill() {

    }


}
