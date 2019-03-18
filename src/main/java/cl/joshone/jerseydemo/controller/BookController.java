package cl.joshone.jerseydemo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import cl.joshone.jerseydemo.model.Book;

@Component
@Path("/books")
public class BookController{

    @GET
    @Produces("application/json")
    public Collection<Book> getAllBooks() {
        
        List<Book> list = new ArrayList<Book>();
        list.add(new Book("Diarios Arthur Schnitzler", "Arthur Schnitzler"));
        list.add(new Book("Un mar de Piedras", "Raúl Zurita"));

        return list;
    }

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        return "Hello from Spring";
    }
}