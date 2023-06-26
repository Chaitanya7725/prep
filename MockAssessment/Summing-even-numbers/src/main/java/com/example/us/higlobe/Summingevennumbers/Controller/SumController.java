package com.example.us.higlobe.Summingevennumbers.Controller;

import com.example.us.higlobe.Summingevennumbers.DAO.SumDao;
import com.example.us.higlobe.Summingevennumbers.Model.Numbers;
import com.example.us.higlobe.Summingevennumbers.Response.Response;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class SumController {

    private int sum=0;
    private int [] numberArray;

    SumDao dao=new SumDao();

    @PostMapping(path="/sum_even_numbers",produces = MediaType.APPLICATION_JSON_VALUE, consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public Response postSum(@RequestBody Numbers inputs){
        return dao.PostSum(inputs);
    }

    @GetMapping(path="/sum_even_numbers")
    public Response getSum(){
        return dao.getSum();
    }

    @GetMapping(path="/sum_even_numbers/{num}")
    public Response getSumWithParameter(@PathVariable int num){
        return dao.getSumWithParameters(num);
    }

}
