package com.example.us.higlobe.Summingevennumbers.DAO;

import com.example.us.higlobe.Summingevennumbers.Model.Numbers;
import com.example.us.higlobe.Summingevennumbers.Response.Response;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

import static com.example.us.higlobe.Summingevennumbers.Helper.GetIndex.search;

public class SumDao {

    private int sum=0;
    private int [] numberArray;

    Map<Integer,Integer> archive=new HashMap<>();
    public Response PostSum(@RequestBody Numbers inputs){
        sum=0;
        numberArray=inputs.getNumbers();
        for (int i = 0; i < inputs.getNumbers().length; i++)
            if(inputs.getNumbers()[i]%2==0)
                sum+=inputs.getNumbers()[i];
        archive.put(inputs.getNumbers().length,sum);
        return new Response(sum,"Successful");
    }

    public Response getSum() {
        return new Response(sum,"Successful");
    }

    public Response getSumWithParameters(int num) {

        if (num % 2 == 1) return new Response(0,"Odd input/ error");
        int min = 0;
        int max = numberArray.length - 1;
        int index = search(numberArray, min,max,num);
        if(index > -1){
            sum=0;
            for (int i = index+1; i < numberArray.length; i++) {
                if(numberArray[i]%2==0)
                    sum+=numberArray[i];
            }
        }
        else
            return new Response(0,"Number is greater");

        return new Response(sum,"Successful");

    }
}
