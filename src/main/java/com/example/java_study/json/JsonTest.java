package com.example.java_study.json;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    public static void main(String[] args) {
        BudgetInputDto dto1 = new BudgetInputDto("화학보수", "기계1반", 10000);
        BudgetInputDto dto2 = new BudgetInputDto("전기보수", "전기2반", 20000);

        List<BudgetInputDto> list = new ArrayList<>();
        list.add(dto1);
        list.add(dto2);

        String jsonData = JsonConverter.convert(list);
        System.out.println(jsonData);
    }

    @Getter @Setter
    static class BudgetInputDto {
        private String DeptName;
        private String BanName;
        private Integer budget;

        public BudgetInputDto(String DeptName, String BanName, Integer budget) {
            this.DeptName = DeptName;
            this.BanName = BanName;
            this.budget = budget;
        }
    }

}
