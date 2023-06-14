package com.example.symtestdemo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MyRequestBodyObject {


    @JsonProperty("data")
    private DataDTO data;
    @JsonProperty("method")
    private String method;
    @JsonProperty("type")
    private String type;
    @JsonProperty("url")
    private String url;

    @NoArgsConstructor
    @Data
    public static class DataDTO {
        @JsonProperty("pageNo")
        private Integer pageNo;
        @JsonProperty("pageSize")
        private Integer pageSize;
    }
}
