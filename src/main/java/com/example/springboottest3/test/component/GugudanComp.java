package com.example.springboottest3.test.component;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GugudanComp {
    public List<GugudanDto> createDan(int dan) {
        // Init
        List<GugudanDto> listGugu = new ArrayList<>();

        // Process
        for (int col = 1; col < 10; col++)
            listGugu.add(GugudanDto.builder()
                    .dan1(dan)
                    .dan2(col)
                    .result(dan * col)
                    .build());

        return listGugu;
    }

    public List<GugudanDto> createDan2(int dan) {
        // Init
        List<GugudanDto> listGugu2 = new ArrayList<>();
        for(int i = 1; i <= dan; i++)
            for(int col = 1; col < 10; col++)
                listGugu2.add(GugudanDto.builder()
                        .dan1(i)
                        .dan2(col)
                        .result(i * col)
                        .build());
        return listGugu2;
    }

}
