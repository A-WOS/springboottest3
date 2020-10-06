package com.example.springboottest3.component;

import com.example.springboottest3.Dto.guguDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // 객체로 만듬. guguComponent name = new guguComponent();
public class guguComponent {
    // guguDTO를 리스트로 만들고 값을 받아서  리스트로 리턴.
    public List<guguDto> createDan(int dan){
        // 초기화
        // guguDto 리스트를 listgugu로 초기화
        List<guguDto> listgugu = new ArrayList<guguDto>();

        // process
        /* 단 하나의 한문장을 출력하면 이렇게 쓰겠지만
           guguDto gD = gD.bulder()
            .dan1(dan)
            .dan2(1)
            .result(dan*1)
            .build();
           단 전체를 출력하여야 하기 때문에 리스트를 만들어서 listname.add해서 쓰이는것.
         */
        for (int i=1; i<10; i++){
            listgugu.add(guguDto.builder()
                    .dan1(dan)
                    .dan2(i)
                    .result(dan*i)
                    .build());
        }
        // return값은 리스트 메서드였기 때문에 리스트로 반환.
        return listgugu;
    }

    public List<guguDto> createDan2(int dan){
        // 초기화
        List<guguDto> listgugu = new ArrayList<guguDto>();

        // process
        // 1 ~ 입력받은 dan까지 돌릴예정.
        for(int i = 1; i < dan; i++)
            for (int col = 1; col < 10; col++)
                listgugu.add(guguDto.builder()
                        .dan1(dan)
                        .dan2(col)
                        .result(dan * col)
                        .build());


        return listgugu;
    }


}
