package com.folksdev.bookstore.controller;

import com.folksdev.bookstore.dto.BookOrderRequest;
import com.folksdev.bookstore.model.Order;
import com.folksdev.bookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController , uygulama içine dışardan rest api olarak erişilebileceği anlamına geliyor
// Normalde veriyi @GetMapping annotationla alıyoruz, GetMapping yazmamıssak @RequestMapping tan alıyor.
@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    //order servise gidip kaydedicez, geri donen sonucu da response body e cekicez
    private final OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<String> helloTwitch(){
        return ResponseEntity.ok("Hello Twitch");
    }

    // Request Body json olarak yollanan datayı objeye ceviriyor -db
    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdList(), bookOrderRequest.getUserName());

        return ResponseEntity.ok(order);
    }
}
