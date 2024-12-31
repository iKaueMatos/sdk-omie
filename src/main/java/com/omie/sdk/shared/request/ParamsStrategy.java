package com.omie.sdk.shared.request;

import java.util.HashMap;
import java.util.Map;

public class ParamsStrategy implements IParamStrategy {

    @Override
    public Map<String, Object> buildParams(Integer page, Integer size, String importedApi, Map<String, Object> params) {
        Map<String, Object> param = new HashMap<>();

        if (page != null && page > 0) {
            param.put("pagina", page);
        }

        if (size != null && size > 0) {
            param.put("registros_por_pagina", size);
        }

        if (importedApi != null && !importedApi.isEmpty()) {
            param.put("apenas_importado_api", importedApi);
        }

        if (params != null && !params.isEmpty()) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    param.put(entry.getKey(), entry.getValue());
                }
            }
        }

        return param;
    }
}
